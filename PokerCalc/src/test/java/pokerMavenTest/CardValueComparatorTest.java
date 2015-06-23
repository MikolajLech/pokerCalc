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
	public void AceBiggerThanNine() {
		assertTrue(0 < cardValueComparator.compare(card1, card3));	
	}
	@Test
	public void eightEqualsEight() {
		assertTrue(0 == cardValueComparator.compare(card4, card5));	
	}
	@Test
	public void EightSmallerThanAce() {
		assertTrue(0 > cardValueComparator.compare(card4, card1));		
	}
	@Test
	public void AceClubsSmallerThanAceHearts() {
		assertTrue(0 > cardValueComparator.compare(card1, card2));		
	}
	@Test
	public void KingSpareBiggerThanKingHearts() {
		assertTrue(0 < cardValueComparator.compare(card6, card7));		
	}
	@Test
	public void DeuceSmallerThanEight() {
		assertTrue(0 > cardValueComparator.compare(card8, card5));		
	}
}
