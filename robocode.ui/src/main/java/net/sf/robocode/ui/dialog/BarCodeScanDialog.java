package net.sf.robocode.ui.dialog;

//import com.sun.java.swing.plaf.gtk.GTKLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

import net.sf.robocode.battle.IBattleManager;
import net.sf.robocode.repository.IRepositoryManager;
import net.sf.robocode.robotname.RobotNameFactory;
import net.sf.robocode.robotname.RobotNameInfo;
import net.sourceforge.zbar.Image;
import net.sourceforge.zbar.ImageScanner;
import net.sourceforge.zbar.Symbol;
import net.sourceforge.zbar.SymbolSet;
import au.edu.jcu.v4l4j.CaptureCallback;
import au.edu.jcu.v4l4j.FrameGrabber;
import au.edu.jcu.v4l4j.V4L4JConstants;
import au.edu.jcu.v4l4j.VideoDevice;
import au.edu.jcu.v4l4j.VideoFrame;
import au.edu.jcu.v4l4j.exceptions.InvalidValue;
import au.edu.jcu.v4l4j.exceptions.StateException;
import au.edu.jcu.v4l4j.exceptions.UnsupportedMethod;
import au.edu.jcu.v4l4j.exceptions.V4L4JException;

/**
 * 
 * 
 * @author bdeering
 * 
 */
@SuppressWarnings("serial")
public class BarCodeScanDialog extends JFrame implements CaptureCallback {

	private static int width = 640, height = 480,
			std = V4L4JConstants.STANDARD_WEBCAM, channel = 0;
	private static final int MAX_WAIT_TO_ADD_TIME = 3000;
	private static String device = "/dev/video0"; // getting device this is the
													// path of device
	private VideoDevice videoDevice;
	private FrameGrabber frameGrabber;
	private JLabel label;
	private boolean scanningdisabled;
	private IBattleManager battleManager;
	private RobotNameFactory nameInfoFactory;
	private long lastScanTimeMillis;
	private Image image;
	private ImageScanner imageScanner;
	BufferedImage bf;

	public BarCodeScanDialog(IBattleManager battleManager2,
			IRepositoryManager repositoryManager) {
		super();
		lastScanTimeMillis = -1;
		scanningdisabled = false;
		this.battleManager = battleManager2;
		nameInfoFactory = new RobotNameFactory(repositoryManager);
		System.out.println("PATH IS" + System.getProperty("java.library.path"));
		System.loadLibrary("video");
		System.loadLibrary("v4l4j");
		try {
			initFrameGrabber(); // creating frame grabber
		} catch (V4L4JException e1) {
			System.err.println("Error setting up capture");
			e1.printStackTrace();

			cleanupCapture();
			return;
		}

		initGUI(); // creating Jframe

		try {
			frameGrabber.startCapture(); // Starting cam
		} catch (V4L4JException e) {
			System.err.println("Error starting the capture");
			e.printStackTrace();
		}
	}

	private void initFrameGrabber() throws V4L4JException { // Setting

		// Framegrabberlibv4l4j.so
		videoDevice = new VideoDevice(device); // getting the webcam
		frameGrabber = videoDevice.getJPEGFrameGrabber(width, height, channel,
				std, 80);
		try
		{
		
		frameGrabber.setFrameInterval(1, 30);
		frameGrabber.setFrameInterval(1, 20);
		frameGrabber.setFrameInterval(1, 10);
		frameGrabber.setFrameInterval(1, 6);
		}
		catch(InvalidValue e)
		{
			
		}
		catch(UnsupportedMethod e)
		{
			System.out.println("Couldn't set framerate.  Expect high CPU usage.");
		}
		frameGrabber.setCaptureCallback(this);
		width = frameGrabber.getWidth();
		height = frameGrabber.getHeight();

		image = new Image(width, height, "JPEG");
		imageScanner = new ImageScanner();

	}

	private void initGUI() { // setting JFr ame
		// frame = new JFrame();
		label = new JLabel();
		label.setSize(width, height);
		getContentPane().add(label, BorderLayout.CENTER);

		setTitle("Robocode Barcode Scanner");
		setVisible(true);
		setSize(width + 16, height + 44);
		label.setBorder(BorderFactory
				.createMatteBorder(4, 4, 4, 4, Color.GREEN));
	}

	// this method is use for turn off cam and release framegrabber and device
	private void cleanupCapture() {
		try {
			frameGrabber.stopCapture();
		} catch (StateException ex) {
		}

		videoDevice.releaseFrameGrabber();
		videoDevice.release();
	}

	@Override
	public void exceptionReceived(V4L4JException e) {

		e.printStackTrace();
	}

	// this method is call from startCapture() method
	// getting the frame from framegrabber and draw it on JLable to show the
	// user and recycle frame
	// again getting frame , showing it , recycle it
	@Override
	public void nextFrame(VideoFrame frame) {

		label.getGraphics().drawImage(frame.getBufferedImage(), 4, 4, width,
				height, null);
		image.setData(frame.getBytes());
		long scanTimeMillis = System.currentTimeMillis();
		if (scanTimeMillis - lastScanTimeMillis > MAX_WAIT_TO_ADD_TIME) {
			if (scanningdisabled) {
				label.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4,
						Color.GREEN));
				scanningdisabled = false;
			}
			Image grayImage = image.convert("GREY");
			if (imageScanner.scanImage(grayImage) > 0) {
				SymbolSet resultSet = imageScanner.getResults();
				Symbol sym = resultSet.iterator().next();
				String data = sym.getData();

				lastScanTimeMillis = scanTimeMillis;
				
				//Easter egg
				if (data.equals("WIKIPEDIA")) 
				{
					battleManager.killRobot(-1);
					battleManager.killRobot(-1);
				}
				else
				{
					RobotNameInfo robotName = nameInfoFactory.getRobotNameInfo(data);
					System.out.println("Adding a " + robotName.getRobotAIName() + " called "
							+ robotName.getContestantName() + "(from " + sym.getData() + ")");
				
					battleManager.addRobot(robotName);
				}
				scanningdisabled = true;
				label.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4,
						Color.RED));
			}
		}
		frame.recycle();

	}

}