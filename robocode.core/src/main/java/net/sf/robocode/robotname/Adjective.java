package net.sf.robocode.robotname;

import java.util.ArrayList;
import java.util.Arrays;

public class Adjective extends Word {
	public Adjective() {
		super();

		words = new ArrayList<String>(Arrays.asList("aback", "abaft",
				"abandoned", "abashed", "aberrant", "abhorrent", "abiding",
				"abject", "ablaze", "abnormal", "aboard", "aboriginal",
				"abortive", "abounding", "abrasive", "abrupt", "absent",
				"absorbed", "absorbing", "abstracted", "absurd", "abusive",
				"acceptable", "accessible", "accidental", "accurate",
				"acoustic", "acrid", "ad", "hoc", "adamant", "adaptable",
				"addicted", "adhesive", "adjoining", "adorable", "afraid",
				"agonizing", "ahead", "alcoholic", "alert", "alike", "alive",
				"alleged", "alluring", "aloof", "ambiguous", "ambitious",
				"amuck", "ancient", "animated", "apathetic", "aquatic",
				"aromatic", "aspiring", "assorted", "astonishing",
				"auspicious", "available", "average", "aware", "axiomatic",
				"bad", "barbarous", "bashful", "bawdy", "beautiful",
				"belligerent", "berserk", "better", "big", "billowy",
				"bizarre", "black", "boiling", "boorish", "boring",
				"boundless", "brash", "brawny", "breezy", "brief", "bright",
				"broad", "broken", "bumpy", "burly", "cagey", "callous",
				"capable", "capricious", "ceaseless", "changeable", "cheerful",
				"childlike", "chilly", "chivalrous", "chubby", "chunky",
				"clammy", "classy", "cloistered", "cloudy", "clumsy",
				"coherent", "cold", "colossal", "combative", "comfortable",
				"cooing", "cool", "cooperative", "courageous", "cowardly",
				"crabby", "craven", "crazy", "credible", "creepy", "crooked",
				"cuddly", "cultured", "curly", "curved", "cynical", "daffy",
				"daily", "damaged", "damaging", "damp", "dapper", "dashing",
				"dazzling", "deadpan", "debonair", "decisive", "decorous",
				"deep", "deeply", "defective", "delightful", "demonic",
				"deranged", "deserted", "detailed", "determined", "devilish",
				"didactic", "diligent", "direful", "dirty", "disagreeable",
				"discreet", "disillusioned", "dispensable", "divergent",
				"dizzy", "domineering", "draconian", "dramatic", "drunk",
				"dry", "dull", "dusty", "dynamic", "dysfunctional", "eager",
				"early", "earsplitting", "earthy", "eatable", "economic",
				"educated", "efficacious", "efficient", "elated", "elderly",
				"elfin", "elite", "eminent", "empty", "enchanting",
				"encouraging", "endurable", "energetic", "entertaining",
				"enthusiastic", "equable", "erect", "erratic", "ethereal",
				"evanescent", "evasive", "evil", "excellent", "excited",
				"exclusive", "exotic", "expensive", "exuberant", "exultant",
				"fabulous", "faded", "fallacious", "fanatical", "fancy",
				"fantastic", "fascinated", "fast", "fat", "faulty", "fearless",
				"feigned", "fertile", "festive", "filthy", "finicky",
				"flagrant", "flashy", "flawless", "flippant", "flowery",
				"foamy", "foregoing", "forgetful", "fortunate", "frail",
				"fretful", "friendly", "functional", "funny", "furtive",
				"futuristic", "gabby", "gainful", "gamy", "gaping",
				"garrulous", "gaudy", "gentle", "giant", "giddy", "gigantic",
				"glamorous", "glib", "glorious", "glossy", "godly", "good",
				"goofy", "gorgeous", "graceful", "grandiose", "great",
				"greedy", "green", "groovy", "grotesque", "grouchy",
				"gruesome", "grumpy", "guarded", "guiltless", "gullible",
				"gusty", "guttural", "habitual", "half", "hallowed", "halting",
				"handsome", "handsomely", "hapless", "happy", "harmonious",
				"heady", "healthy", "heartbreaking", "heavenly", "heavy",
				"hellish", "helpful", "hesitant", "high", "highfalutin",
				"hilarious", "historical", "holistic", "hollow", "honorable",
				"horrible", "hospitable", "huge", "hulking", "humdrum",
				"humorous", "hungry", "hurried", "hurt", "hypnotic",
				"hysterical", "icky", "idiotic", "ignorant", "illegal",
				"illustrious", "imaginary", "immense", "imminent", "impartial",
				"imperfect", "imported", "incandescent", "incompetent",
				"inconclusive", "industrious", "innate", "instinctive",
				"internal", "invincible", "irate", "itchy", "jaded", "jagged",
				"jazzy", "jealous", "jittery", "jobless", "jolly", "joyous",
				"judicious", "jumbled", "jumpy", "juvenile", "kaput", "kind",
				"kindhearted", "knotty", "knowing", "knowledgeable", "known",
				"labored", "lackadaisical", "lacking", "lamentable", "languid",
				"large", "late", "laughable", "lavish", "lazy", "lean",
				"learned", "legal", "lethal", "level", "lewd", "light",
				"likeable", "literate", "little", "lively", "long", "longing",
				"lopsided", "loutish", "lovely", "loving", "low", "lowly",
				"lucky", "ludicrous", "lush", "luxuriant", "lying", "lyrical",
				"macabre", "macho", "maddening", "madly", "magenta", "magical",
				"magnificent", "majestic", "makeshift", "malicious", "mammoth",
				"maniacal", "many", "marked", "massive", "materialistic",
				"mature", "measly", "meek", "melodic", "merciful", "mere",
				"mighty", "mindless", "miniature", "minor", "miscreant",
				"moaning", "modern", "moldy", "momentous", "muddled",
				"mundane", "murky", "mushy", "mysterious", "naive", "nappy",
				"narrow", "nasty", "nauseating", "nebulous", "needless",
				"needy", "neighborly", "nervous", "new", "nice", "nifty",
				"noiseless", "noisy", "nonchalant", "nondescript", "nonstop",
				"nostalgic", "nosy", "noxious", "null", "numberless",
				"numerous", "nutritious", "oafish", "obedient", "obeisant",
				"obscene", "obsequious", "observant", "obsolete", "obtainable",
				"oceanic", "odd", "offbeat", "old", "omniscient", "onerous",
				"optimal", "orange", "ordinary", "organic", "ossified", "oval",
				"overconfident", "overjoyed", "overrated", "overt",
				"overwrought", "painful", "painstaking", "panoramic",
				"parched", "parsimonious", "pastoral", "pathetic", "peaceful",
				"penitent", "perfect", "periodic", "permissible", "perpetual",
				"petite", "phobic", "picayune", "piquant", "placid",
				"plausible", "pleasant", "plucky", "pointless", "political",
				"possessive", "precious", "premium", "pretty", "prickly",
				"productive", "profuse", "protective", "proud", "psychedelic",
				"psychotic", "puffy", "pumped", "puny", "purple", "quack",
				"quaint", "quarrelsome", "questionable", "quick", "quickest",
				"quiet", "quixotic", "quizzical", "rabid", "racial", "ragged",
				"rainy", "rambunctious", "rampant", "rare", "raspy", "ratty",
				"rebellious", "receptive", "recondite", "red", "redundant",
				"reflective", "relieved", "reminiscent", "resolute",
				"resonant", "rhetorical", "righteous", "rightful", "ritzy",
				"roasted", "robust", "romantic", "roomy", "round", "royal",
				"ruddy", "rural", "rustic", "ruthless", "sable", "sad",
				"sassy", "satisfying", "scandalous", "scarce", "scary",
				"scientific", "scintillating", "scrawny", "secretive",
				"sedate", "seemly", "selective", "shallow", "shocking",
				"short", "shrill", "silly", "sincere", "skillful", "skinny",
				"sloppy", "slow", "small", "smelly", "sneaky", "snobbish",
				"snotty", "soggy", "somber", "sordid", "spectacular", "spicy",
				"spiffy", "spiritual", "splendid", "spooky", "spurious",
				"squalid", "square", "squeamish", "staking", "standing",
				"statuesque", "steadfast", "stereotyped", "stimulating",
				"stingy", "strange", "subdued", "subsequent", "successful",
				"succinct", "sulky", "supreme", "swanky", "sweltering",
				"symptomatic", "synonymous", "taboo", "tacit", "tacky",
				"talented", "tall", "tame", "tan", "tangible", "tangy", "tart",
				"tasteful", "tawdry", "tearful", "telling", "temporary",
				"tender", "tenuous", "tested", "testy", "therapeutic",
				"thinkable", "threatening", "tight", "tightfisted", "tiny",
				"tiresome", "toothsome", "torpid", "tough", "towering",
				"tranquil", "trashy", "tricky", "trite", "truculent",
				"typical", "ubiquitous", "ugliest", "ugly", "ultra", "unable",
				"unaccountable", "unadvised", "unarmed", "unbecoming",
				"unbiased", "uncovered", "understood", "undesirable",
				"unequaled", "uneven", "unsightly", "unsuitable", "unusual",
				"upbeat", "uppity", "upset", "uptight", "used", "utopian",
				"utter", "uttermost", "vacuous", "vague", "various", "vast",
				"vengeful", "venomous", "verdant", "versed", "victorious",
				"vigorous", "vivacious", "voiceless", "volatile", "voracious",
				"vulgar", "wacky", "waggish", "wakeful", "wanting", "warlike",
				"warm", "wary", "wasteful", "watchful", "watery", "weak",
				"wealthy", "weary", "wee", "wet", "whimsical", "whispering",
				"wholesale", "wicked", "wide", "willing", "wiry", "wise",
				"wistful", "woebegone", "womanly", "wonderful", "wooden",
				"woozy", "workable", "worried", "worthless", "wrathful",
				"wretched", "wry", "x-rated", "yellow", "yielding", "young",
				"youthful", "yummy", "zany", "zealous", "zippy", "zonked"));
	}
}
