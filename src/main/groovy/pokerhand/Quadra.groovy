package pokerhand

class Quadra extends PokerHands {
	private List<String> hand
	private List<Integer> handValue
	private Integer valor

	Quadra(String hand) {
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
		valor = verificaClasse(this.hand)
	}

	static Integer verificaClasse(List<String> hand) {
		Integer valor = getCardValor(hand[0])
		for(int i = 1; i < 4; i++){
			if(hand[i][0] != hand[i - 1][0])valor = 0
		}
		if(valor)return valor
		valor = getCardValor(hand[1])
		for(int i = 2; i < 5; i++){
			if(hand[i][0] != hand[i - 1][0])valor = 0
		}
		return valor
	}

	@Override
	int compareWith(Object pokerHand) {
		if (this.class.name != pokerHand.class.name) {
			return getHandValue(this.toString()) <=> getHandValue(pokerHand.toString())
		}
		Quadra otherHand = (Quadra) pokerHand
		if(valor != otherHand.valor)return valor <=> otherHand.valor
		return compare2HandsValues(handValue, otherHand.handValue)
	}

	@Override
	String toString() {
		return "Quadra"
	}
}