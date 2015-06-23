package pokerMaven;
import java.lang.IllegalArgumentException;

public class Card {
	private Value mValue;
	private	Suite mSuite;
	private Value convValue(String strValue) {
		switch(strValue) {
		case "2":
			return Value.DEUCE;
		case "3":
			return Value.THREE;
		case "4":
			return Value.FOUR;
		case "5":
			return Value.FIVE;
		case "6":
			return Value.SIX;
		case "7":
			return Value.SEVEN;
		case "8":
			return Value.EIGHT;
		case "9":
			return Value.NINE;
		case "T":
			return Value.TEN;
		case "J":
			return Value.JACK;
		case "Q":
			return Value.QUEEN;
		case "K":
			return Value.KING;
		case "A":
			return Value.ACE;
		default:
			throw new IllegalArgumentException("BadCardValue: " + strValue);
		}
	}
	private Suite convSuite(String strSuite) {
		switch(strSuite) {
		case "S":
			return Suite.SPADES;
		case "H":
			return Suite.HEARTS;
		case "D":
			return Suite.DIAMONDS;
		case "C":
			return Suite.CLUBS;
		default:
			throw new IllegalArgumentException("BadCardSuite: " + strSuite);
		}
	}
	public Card(String inCard) {
		try {
			mValue = convValue(inCard.substring(0, 1));
			mSuite = convSuite(inCard.substring(1,2));
		}
		catch(IllegalArgumentException exception) {
			System.out.println(exception);
		}
	}
	public void setSuite(Suite suite) {
		mSuite = suite;
	}
	public void setValue(Value value) {
		mValue = value;
	}
	public Suite getSuite() {
		return mSuite;
	}
	public Value getValue() {
		return mValue;
	}
}
