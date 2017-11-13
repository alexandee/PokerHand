package pokerhand

class StraightFlush extends PokerHands {
	private List<String> hand
	private List<Integer> handValue
	private Hand name

	StraightFlush(String hand) {
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
		name = Hand.StraightFlush
	}

	static Integer verificaClasse(List<String> hand) {
		Integer sequencia = Sequencia.verificaClasse(hand)
		Integer flush = Flush.verificaClasse(hand)
		if(sequencia && flush)return flush
		return 0
	}

	@Override
	Hand obterNome() {
		return name
	}

	@Override
	List<String> obterHand() {
		return hand
	}

	@Override
	int compareWith(Object pokerHand) {
		StraightFlush otherHand = (StraightFlush) pokerHand
		return compare2HandsValues(handValue, otherHand.handValue)
	}

	@Override
	String toString() {
		return "StraightFlush"
	}
}