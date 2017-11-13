package pokerhand

class Trinca extends PokerHands{
	private List<String> hand
	private List<Integer> handValue
	private Integer trinca
	private Hand name

	Trinca(String hand) {
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
		trinca = verificaClasse(this.hand)
		name = Hand.Trinca
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
		for(int i = 1; i < hand.size() - 1; i++){
			if(hand[i][0] == hand[i - 1][0] && hand[i][0] == hand[i + 1][0] ){
				return getCardValor(hand[i])
			}
		}
		return 0
	}

	@Override
	int compareWith(Object pokerHand) {
		Trinca otherHand = (Trinca) pokerHand
		if(trinca != otherHand.trinca)return trinca <=> otherHand.trinca
		return compare2HandsValues(handValue, otherHand.handValue)
	}

	@Override
	String toString() {
		return "Trinca";
	}
}
