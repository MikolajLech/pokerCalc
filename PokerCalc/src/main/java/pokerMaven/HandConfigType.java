package pokerMaven;

public enum HandConfigType {
	STRAIGHTFLUSH(9), FOUROFKIND(8), FULLHOUSE(7), FLUSH(6), STRAIGHT(5), THREEOFKIND(4), TWOPAIRS(3), ONEPAIR(2), HIGHCARD(1);
	private int value;
	private HandConfigType(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}