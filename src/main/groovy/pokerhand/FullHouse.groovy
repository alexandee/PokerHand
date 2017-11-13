package pokerhand

class FullHouse extends PokerHands {
	private List<String> hand
	private List<Integer> handValue
	private Integer trinca
	private Integer par
	private Hand name

	FullHouse(String hand) {
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
		trinca = Trinca.verificaClasse(this.hand)
		par = UmPar.verificaClasse(this.hand)
		name = Hand.FullHouse
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
		Integer verificaTrinca = Trinca.verificaClasse(hand)
		Integer verificaPar = UmPar.verificaClasse(hand)
		if(verificaPar == verificaTrinca)return 0
		return verificaTrinca
	}

	@Override
	int compareWith(Object pokerHand) {
		FullHouse otherHand = (FullHouse) pokerHand
		return compare2HandsValues(handValue, otherHand.handValue)
	}

	@Override
	String toString() {
		return hand.toString() + " " + name
	}
}