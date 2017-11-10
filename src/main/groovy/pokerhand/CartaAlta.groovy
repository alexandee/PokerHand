package pokerhand

class CartaAlta extends PokerHands{
	private List<String> hand
	private List<Integer> handValue

	CartaAlta(String hand){
		this.hand = getCardsSorted(hand)
		handValue = getSortedCardsValues(hand)
	}

	static boolean verificaClasse(List<String> hand){
		return getCardValor(hand[0])
	}

	@Override
	int compareWith(Object pokerHand){
		if(this.class.name <=> pokerHand.class.name){
			return getHandValue(this.toString()) <=> getHandValue(pokerHand.toString())
		}
		CartaAlta otherHand = (CartaAlta)pokerHand
		return compare2HandsValues(handValue, otherHand.handValue)
	}

	@Override
	String toString() {
		return "CartaAlta"
	}
}
