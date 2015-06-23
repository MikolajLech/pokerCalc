package pokerMavenTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pokerMaven.Card;
import pokerMaven.CardValueComparator;

public class CardValueComparatorTest {

	Card card1 = new Card("AC");
	Card card2 = new Card("AH");
	Card card3 = new Card("9S");
	Card card4 = new Card("8H");
	Card card5 = new Card("8H");
	Card card6 = new Card("KS");
	Card card7 = new Card("KH");
	Card card8 = new Card("2C");
	
	CardValueComparator cardValueComparator = new CardValueComparator();
	
	@Test
	public void testCompare() {
		// S < H < D < C
		assertTrue(0 < cardValueComparator.compare(card1, card3)); // AC > 9S
		assertTrue(0 == cardValueComparator.compare(card4, card5)); // 8H = 8H
		assertTrue(0 > cardValueComparator.compare(card4, card1)); // 8H < AC
		assertTrue(0 > cardValueComparator.compare(card1,card2)); // AC < AH
		assertTrue(0 < cardValueComparator.compare(card6, card7)); // KS > KH
		assertTrue(0 > cardValueComparator.compare(card8, card5)); // 2C < 8H
		
	}
}
