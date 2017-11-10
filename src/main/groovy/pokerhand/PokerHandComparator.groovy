package pokerhand

class PokerHandComparator implements Comparator<PokerHand> {
	@Override
	int compare(PokerHand o1, PokerHand o2) {
		return o1.compareWith(o2)
	}
}
