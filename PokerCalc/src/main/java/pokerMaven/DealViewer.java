package pokerMaven;

public class DealViewer implements Viewer<Deal> {	
	@Override
	public void prt(Deal deal) {
		prtHandsConfigs(deal);
		for(Hand hand : deal.getHands()) {
			for(Card card : hand.getCards()) {
				System.out.printf("%-6s%-10s", card.getValue(), card.getSuite());
			}
			System.out.print("\t");
		}
		System.out.println();
	}
	public void prtHandsConfigs(Deal deal) {
		for(Hand hand : deal.getHands()) {
			System.out.printf("%-10s", hand.getHandConfType());
		}
	}
	
}
