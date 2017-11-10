package pokerhand

class PokerHand {
	private PokerHands myHand

	PokerHand(String hand) {
		PokerHandFactory pokerHandFactory = new PokerHandFactory()
		myHand = pokerHandFactory.createHand(hand)
	}

	int compareWith(PokerHand otherHand){
		return myHand.compareWith(otherHand.myHand)
	}

	String toString(){
		return myHand.toString()
	}
}