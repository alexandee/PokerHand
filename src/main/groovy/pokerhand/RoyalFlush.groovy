package pokerhand

class RoyalFlush extends PokerHands {
	private List<String> hand
	private List<Integer> handValue

	RoyalFlush(String hand) {
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
	}

	static Integer verificaClasse(List<String> hand) {
		Integer sequencia = Sequencia.verificaClasse(hand)
		Integer flush = Flush.verificaClasse(hand)
		if(sequencia == 14 && flush)return sequencia
		return 0
	}

	@Override
	int compareWith(Object pokerHand) {
		if (this.class.name != pokerHand.class.name) {
			return getHandValue(this.toString()) <=> getHandValue(pokerHand.toString())
		}
		RoyalFlush otherHand = (RoyalFlush) pokerHand
		return compare2HandsValues(handValue, otherHand.handValue)
	}

	@Override
	String toString() {
		return "RoyalFlush"
	}
}