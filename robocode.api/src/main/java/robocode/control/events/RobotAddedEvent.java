/**
 * Copyright (c) 2001-2016 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/epl-v10.html
 */
package robocode.control.events;


import robocode.AdvancedRobot;
import robocode.control.RobotSpecification;


/**
 * A robotAddedEvent is sent to {@link IBattleListener#onrobotAdded(robotAddedEvent)
 * onrobotAdded()} when a new robot joins a round in progress
 *
 * @see IBattleListener
 *
 * @author Ben Deering
 *
 * @since 1.6.2
 */
public class RobotAddedEvent extends BattleEvent {
	private final RobotSpecification[] robotToAdd;

	/**
	 * Called by the game to create a new robotAddedEvent.
	 * Please don't use this constructor as it might change.
	 *
	 * @param turnSnapshot a snapshot of the turn that has ended.
	 */
	public RobotAddedEvent(RobotSpecification[] newrbt) {
		super();
		this.robotToAdd = newrbt;
	}

	/**
	 * Returns a snapshot of the turn that has ended.
	 *
	 * @return a snapshot of the turn that has ended.
	 */
	public RobotSpecification[] getRobotToAdd() {
		return robotToAdd;
	}
}
