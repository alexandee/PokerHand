package pokerhand

class PokerHand  {
	private PokerHands myHand
	PokerHandFactory pokerHandFactory

	PokerHand(String hand) {
		pokerHandFactory = PokerHandFactory.pokerHandFactorySingleton()
		myHand = pokerHandFactory.createHand(hand)
	}

	int compareWith(PokerHand otherHand){
		return myHand.compareWith(otherHand.getMyHand())
	}

	String toString(){
		return myHand.toString()
	}

	PokerHands getMyHand(){
		return this.myHand
	}

	boolean equals(o) {
		if (this.is(o)) {
			return true
		}

		PokerHand pokerHand = (PokerHand) o

		if(this.compareWith(pokerHand) == 0)return true
		return false
	}

	int hashCode() {
		int result
		result = (myHand != null ? myHand.hashCode() : 0)
		result = 31 * result + (pokerHandFactory != null ? pokerHandFactory.hashCode() : 0)
		return result
	}
}