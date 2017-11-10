package pokerhand

class UmPar extends PokerHands{
	private List<String> hand
	private List<Integer> handValue
	private Integer value

	UmPar(String hand) {
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
		value = verificaClasse(this.hand)
	}

	static Integer verificaClasse(List<String> hand) {
		for(int i = 1; i < hand.size(); i++){
			if(hand[i][0] == hand[i - 1][0])return getCardValor(hand[i])
		}
		return 0
	}

	@Override
	int compareWith(Object pokerHand) {
		if(this.class.name != pokerHand.class.name){
			return getHandValue(this.toString()) <=> getHandValue(pokerHand.toString())
		}
		UmPar otherHand = (UmPar) pokerHand
		if(value != otherHand.value)return value <=> otherHand.value
		return compare2HandsValues(handValue, otherHand.handValue)
	}


	@Override
	String toString() {
		return "UmPar"
	}
}
