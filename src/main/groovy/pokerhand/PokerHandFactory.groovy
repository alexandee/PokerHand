package pokerhand

import java.lang.reflect.Constructor

class PokerHandFactory {
	private static List<Class> allPokerHands = [RoyalFlush.class, StraightFlush.class, Quadra.class, FullHouse.class,
											   Flush.class, Sequencia.class, Trinca.class, DoisPares.class, UmPar.class]

	private static pokerHandFactory
	private PokerHandFactory(){

	}

	static pokerHandFactorySingleton(){
		if(!pokerHandFactory)pokerHandFactory = new PokerHandFactory()
		return pokerHandFactory
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

