package pokerhand

class PokerHand {
	private PokerHands myHand
	PokerHandFactory pokerHandFactory

	PokerHand(String hand) {
		pokerHandFactory = PokerHandFactory.pokerHandFactorySingleton()
		myHand = pokerHandFactory.createHand(hand)
	}

	int compareWith(PokerHand otherHand){
		return myHand.compareWith(otherHand.myHand)
	}

	String toString(){
		return myHand.toString()
	}
}