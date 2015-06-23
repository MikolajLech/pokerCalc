package pokerMaven;
import java.util.Comparator;

public class CardValueComparator implements Comparator<Card> { // when Comparator is raw, compare() expects Object arguments
	@Override
	public int compare(Card o1, Card o2) {
		if(o1.getValue().ordinal() == o2.getValue().ordinal())
			return o2.getSuite().ordinal() - o1.getSuite().ordinal();
		return o2.getValue().ordinal() - o1.getValue().ordinal(); // ascending order
	}
}
