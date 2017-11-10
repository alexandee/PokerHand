package pokerhand

class Flush extends PokerHands {
	private List<String> hand
	private List<Integer> handValue

	Flush(String hand) {
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
	}

	static Integer verificaClasse(List<String> hand){
		for (int i = 1; i < hand.size(); i++) {
			if (hand[i][1] != hand[i - 1][1]) return 0
		}
		return getCardValor(hand[0])
	}


	@Override
	int compareWith(Object pokerHand) {
		if (this.class.name != pokerHand.class.name) {
			return getHandValue(this.toString()) <=> getHandValue(pokerHand.toString())
		}
		Flush otherHand = (Flush) pokerHand
		return compare2HandsValues(handValue, otherHand.handValue)
	}

	@Override
	String toString() {
		return "Flush"
	}
}