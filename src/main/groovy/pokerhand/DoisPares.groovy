package pokerhand

class DoisPares extends PokerHands {
	private List<String> hand
	private List<Integer> handValue
	private List<Integer> pares
	private Hand name

	DoisPares(String hand) {
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
		pares = valorPares(this.hand)
		name = Hand.DoisPares
	}

	@Override
	Hand obterNome() {
		return name
	}

	@Override
	List<String> obterHand() {
		return hand
	}

	static List<Integer> valorPares(List<String> hand){
		List<Integer> valorPares = []
		for(int i = 1; i < hand.size(); i++){
			if(hand[i][0] == hand[i - 1][0]){
				valorPares << getCardValor(hand[i])
				i++
			}
		}
		return valorPares
	}


	static Integer verificaClasse(List<String> hand){
		Integer pares = 0
		Integer parMaior = 0
		for(int i = 1; i < hand.size(); i++){
			if(hand[i][0] == hand[i - 1][0]){
				pares++
				parMaior = Math.max(parMaior, getCardValor(hand[i]))
				i++
			}
		}
		if(pares == 2)return parMaior
		return 0
	}


	@Override
	int compareWith(Object pokerHand) {
		DoisPares otherHand = (DoisPares) pokerHand
		if(pares[0] != otherHand.pares[0])return pares[0] <=> otherHand.pares[0]
		if(pares[1] != otherHand.pares[1])return pares[1] <=> otherHand.pares[1]
		return compare2HandsValues(handValue, otherHand.handValue)
	}

	@Override
	String toString() {
		return hand.toString() + " " + name
	}
}