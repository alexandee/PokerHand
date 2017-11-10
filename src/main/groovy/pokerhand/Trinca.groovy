package pokerhand

class Trinca extends PokerHands{
	private List<String> hand
	private List<Integer> handValue
	private Integer trinca

	Trinca(String hand) {
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
		trinca = verificaClasse(this.hand)
	}


	static Integer verificaClasse(List<String> hand){
		for(int i = 1; i < hand.size() - 1; i++){
			if(hand[i][0] == hand[i - 1][0] && hand[i][0] == hand[i + 1][0] ){
				return getCardValor(hand[i])
			}
		}
		return 0
	}

	@Override
	int compareWith(Object pokerHand) {
		if(this.class.name != pokerHand.class.name){
			return getHandValue(this.toString()) <=> getHandValue(pokerHand.toString())
		}
		Trinca otherHand = (Trinca) pokerHand
		if(trinca != otherHand.trinca)return trinca <=> otherHand.trinca
		return compare2HandsValues(handValue, otherHand.handValue)
	}

	@Override
	String toString() {
		return "Trinca";
	}
}
