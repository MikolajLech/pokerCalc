package pokerMavenTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pokerMaven.Hand;
import pokerMaven.HandComparator;

public class HandComparatorTest {

	Hand hand1 = new Hand("AC KC QC JC TC"); // straight flush (royal) A
	Hand hand2 = new Hand("2D 3D 4D 5D 6D"); // straight flush 6
	Hand hand3 = new Hand("QH QC QS QD 5S"); // four of a kind Q
	Hand hand4 = new Hand("KC KS KH 6D 6C"); // full house K, 6
	Hand hand5 = new Hand("9S TS QS KS AS"); // flush S
	Hand hand6 = new Hand("8D 9S TS JC QH"); // straight Q
	Hand hand7 = new Hand("9S 9D 9H 2D TC"); // three of a kind 9
	Hand hand8 = new Hand("QC QS 9S 9H TC"); // two pairs Q, 9
	Hand hand9 = new Hand("8H 8C 7S 5D KD"); // one pair 8
	Hand hand10 = new Hand("2D 6S 8C TS AD"); // high card A
	Hand hand11 = new Hand("2H 6H 8S TC AS"); // high card A
	Hand hand12 = new Hand("3D 6C JS 9S 4H"); // high card J	
	Hand hand13 = new Hand("9S 9C 9H 7H 9D"); // four of kind 9
	Hand hand14 = new Hand("5S 7C 7S 5D 7H"); // full house 7, 5
	Hand hand15 = new Hand("KS QH QS KD KH"); // full house K, Q
	Hand hand16 = new Hand("2D 7D JD KD AD"); // flush D
	Hand hand17 = new Hand("5S 9D 7H 8D 6H"); // straight 9
	Hand hand18 = new Hand("TS 2D TD QC TH"); // three of kind T
	Hand hand19 = new Hand("TD QS TS 5S TC"); // three of kind T
	Hand hand20 = new Hand("KC 9S 8S 2C 8H"); // one pair 8
	// add comparison between different pairs, three of kind etc.
	
    HandComparator handComparator = new HandComparator();
	// Compare hands of different types
    @Test
    public void straightFlushBiggerThanFourOfKind() {
    	assertTrue(0 < handComparator.compare(hand2, hand3)); 			
    }
    @Test
    public void fourOfKindBiggerThanFullHouse() {
    	assertTrue(0 < handComparator.compare(hand3, hand4));
    }
    @Test
    public void fullHouseBiggerThanFlush() {
    	assertTrue(0 < handComparator.compare(hand4, hand5)); 			
    }
    @Test
    public void flushBiggerThanStraight() {
    	assertTrue(0 < handComparator.compare(hand5, hand6)); 			
    }
    @Test
    public void straightBiggerThanThreeOfKind() {
    	assertTrue(0 < handComparator.compare(hand6, hand7)); 			
    }
    @Test
    public void threeOfKindBiggerThanTwoPairs() {
    	assertTrue(0 < handComparator.compare(hand7, hand8)); 			
    }
    @Test
    public void twoPairsBiggerThanOnePair() {
    	assertTrue(0 < handComparator.compare(hand8, hand9)); 			
    }
    @Test
    public void onePairBiggerThanHighCard() {
    	assertTrue(0 < handComparator.compare(hand9, hand10)); 			
    }
    @Test
    public void fourOfKindBiggerThanHighCard() {
    	assertTrue(0 < handComparator.compare(hand3, hand10)); 			
    }
    @Test
    public void straightFlushBiggerThanOnePair() {
    	assertTrue(0 < handComparator.compare(hand2, hand3)); 			
    }
    @Test
    public void threeOfKindBiggerThanOnePair() {
    	assertTrue(0 < handComparator.compare(hand7, hand9)); 			
    }
    @Test
    public void fullHouseBiggerThanThreeOfKind() {
    	assertTrue(0 < handComparator.compare(hand4, hand7)); 			
    }
    @Test
    public void straightFlushBiggerThanThreeOfKind() {
    	assertTrue(0 < handComparator.compare(hand2, hand7)); 			
    }
    @Test
    public void straightFlushBiggerThanFourOfKind2() {
    	assertTrue(0 < handComparator.compare(hand1, hand3)); 			
    }
    // Same configuration types comparison
    @Test
    public void sameHighCards() {
    	assertTrue(0 == handComparator.compare(hand10, hand11)); 			
    }
    @Test
    public void straightFlushAceBiggerThanStraightFlushSix() {
    	assertTrue(0 < handComparator.compare(hand1, hand2)); 			
    }
    @Test
    public void highCardAceBiggerThanhighCardJack() {
    	assertTrue(0 < handComparator.compare(hand11, hand12)); 			
    }
    @Test
    public void threeOfKindTenQeenFiveBiggerThanThreeOfKindTenQeenTwo() {
    	assertTrue(0 < handComparator.compare(hand19, hand18)); 			
    }
    @Test
    public void straightQeenBiggerThanStraightNine() {
    	assertTrue(0 < handComparator.compare(hand6, hand17)); 			
    }
    @Test
    public void onePairEightKingNineBiggerThanOnePairEightKingSeven() {
    	assertTrue(0 < handComparator.compare(hand20, hand9)); 			
    }
    @Test
    public void FullKingQeenBiggerThanFullKingSix() {
    	assertTrue(0 < handComparator.compare(hand15, hand14)); 			
    }
    @Test
    public void FlushAceKingQeenBiggerThanFlushAceKingThree() {
    	assertTrue(0 < handComparator.compare(hand5, hand16)); 			
    }
    @Test
    public void FourOfKindQeenBiggerThanFourOfKindNine() {
    	assertTrue(0 < handComparator.compare(hand5, hand16)); 			
	}
}