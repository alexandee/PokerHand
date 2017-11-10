package pokerhand

class FullHouse extends PokerHands {
	private List<String> hand
	private List<Integer> handValue
	private Integer trinca
	private Integer par

	FullHouse(String hand) {
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
		trinca = Trinca.verificaClasse(this.hand)
		par = UmPar.verificaClasse(this.hand)
	}

	FullHouse() {
	}

	static Integer verificaClasse(List<String> hand) {
		Integer verificaTrinca = Trinca.verificaClasse(hand)
		Integer verificaPar = UmPar.verificaClasse(hand)
		if(verificaPar == verificaTrinca)return 0
		return verificaTrinca
	}

	@Override
	int compareWith(Object pokerHand) {
		if (this.class.name != pokerHand.class.name) {
			return getHandValue(this.toString()) <=> getHandValue(pokerHand.toString())
		}
		FullHouse otherHand = (FullHouse) pokerHand
		return compare2HandsValues(handValue, otherHand.handValue)
	}

	@Override
	String toString() {
		return "FullHouse"
	}
}