package pokerhand

class RoyalFlush extends PokerHands {
	private List<String> hand
	private List<Integer> handValue
	private Hand name

	RoyalFlush(String hand) {
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
		name = Hand.RoyalFlush
	}

	@Override
	Hand obterNome() {
		return name
	}

	@Override
	List<String> obterHand() {
		return hand
	}

	static Integer verificaClasse(List<String> hand) {
		Integer sequencia = Sequencia.verificaClasse(hand)
		Integer flush = Flush.verificaClasse(hand)
		if(sequencia == 14 && flush)return sequencia
		return 0
	}

	@Override
	int compareWith(Object pokerHand) {
		RoyalFlush otherHand = (RoyalFlush) pokerHand
		return compare2HandsValues(handValue, otherHand.handValue)
	}

	@Override
	String toString() {
		return hand.toString() + " " + name
	}
}