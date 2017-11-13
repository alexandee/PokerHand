package pokerhand

class CartaAlta extends PokerHands{
	private List<String> hand
	private List<Integer> handValue
	private Hand name

	CartaAlta(String hand){
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
		name = Hand.CartaAlta
	}

	static boolean verificaClasse(List<String> hand){
		return getCardValor(hand[0])
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
	int compareWith(Object pokerHand){
		CartaAlta otherHand = (CartaAlta)pokerHand
		return compare2HandsValues(handValue, otherHand.handValue)
	}

	@Override
	String toString() {
		return hand.toString() + " " + name
	}
}
