package pokerhand

abstract class PokerHands {
	private static final Map<String, Integer> cardValue = ['2':2, '3':3, '4':4, '5':5, '6':6, '7':7, '8':8,
													'9':9, 'T':10, 'J':11, 'Q':12, 'K':13, 'A':14]

	static Integer getCardValor(String card){
		return cardValue[card[0]]
	}

	static List<String> splitCards(String hand){
		return hand.split(" ")
	}

	static List<String> getCardsSorted(String hand){
		List<String> cardList = splitCards(hand)
		cardList.sort{a ,b -> getCardValor(b) <=> getCardValor(a)}
		return cardList
	}

	static List<Integer> getSortedCardsValues(String hand){
		List<String> cardList = splitCards(hand)
		List<Integer> handValues = []
		cardList.each {
			handValues.add(getCardValor(it))
		}
		handValues.sort{a ,b -> b <=> a}
		return handValues
	}

	static int compare2HandsValues(List<Integer> handValue1, List<Integer> handValue2){
		for(int i = 0; i < handValue1.size(); i++){
			if(handValue1[i] != handValue2[i])
				return handValue1[i] <=> handValue2[i]
		}
		return 0
	}

	abstract int compareWith(Object pokerHand)
	abstract Hand obterNome()
	abstract List<String> obterHand()
}
