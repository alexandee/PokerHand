package pokerhand

class Flush extends PokerHands {
	private List<String> hand
	private List<Integer> handValue
	private Hand name

	Flush(String hand) {
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
		name = Hand.Flush
	}

	@Override
	Hand obterNome() {
		return name
	}

	@Override
	List<String> obterHand() {
		return hand
	}

	static Integer verificaClasse(List<String> hand){
		for (int i = 1; i < hand.size(); i++) {
			if (hand[i][1] != hand[i - 1][1]) return 0
		}
		return getCardValor(hand[0])
	}


	@Override
	int compareWith(Object pokerHand) {
		Flush otherHand = (Flush) pokerHand
		return compare2HandsValues(handValue, otherHand.handValue)
	}

	@Override
	String toString() {
		return hand.toString() + " " + name
	}
}