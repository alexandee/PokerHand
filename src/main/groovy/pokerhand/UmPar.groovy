package pokerhand

class UmPar extends PokerHands{
	private List<String> hand
	private List<Integer> handValue
	private Integer value
	private Hand name

	UmPar(String hand) {
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
		value = verificaClasse(this.hand)
		name = Hand.UmPar
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
		for(int i = 1; i < hand.size(); i++){
			if(hand[i][0] == hand[i - 1][0])return getCardValor(hand[i])
		}
		return 0
	}

	@Override
	int compareWith(Object pokerHand) {
		UmPar otherHand = (UmPar) pokerHand
		if(value != otherHand.value)return value <=> otherHand.value
		return compare2HandsValues(handValue, otherHand.handValue)
	}


	@Override
	String toString() {
		return "UmPar"
	}
}
