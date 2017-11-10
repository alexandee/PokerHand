package pokerhand

import java.lang.reflect.Constructor

class PokerHandFactory {
	private List<Class> allPokerHands

	PokerHandFactory(){
		allPokerHands = [RoyalFlush.class, StraightFlush.class, Quadra.class, FullHouse.class,
						 Flush.class, Sequencia.class, Trinca.class, DoisPares.class, UmPar.class]
	}

	PokerHandFactory(List<Class> allPokerHands){
		this.allPokerHands = allPokerHands
	}

	PokerHands createHand(String allCards){
		PokerHands actualHand = new CartaAlta(allCards)
		List<String> hand = PokerHands.getCardsSorted(allCards)
		for(handType in allPokerHands){
			if(handType.verificaClasse(hand)){
				Constructor constructor = handType.getConstructor(String.class)
				actualHand = (PokerHands) constructor.newInstance(allCards)
				break
			}
		}
		return actualHand
	}
}

