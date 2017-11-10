package pokerhand

class Application {

	static void main(String[] args) {

		 println new PokerHand("TS TD KC JC 7C").compareWith(new PokerHand("JS JC AS KC TD")) == Result.LOSS
		 println new PokerHand("7H 7C QC JS TS").compareWith(new PokerHand("7D 7C JS TS 6D")) == Result.WIN
		 println new PokerHand("5S 5D 8C 7S 6H").compareWith(new PokerHand("7D 7S 5S 5D JS")) == Result.LOSS
		 println new PokerHand("AS AD KD 7C 3D").compareWith(new PokerHand("AD AH KD 7C 4S")) == Result.LOSS
		 println new PokerHand("TS JS QS KS AS").compareWith(new PokerHand("AC AH AS AS KS")) == Result.WIN
		 println new PokerHand("TS JS QS KS AS").compareWith(new PokerHand("TC JS QC KS AC")) == Result.WIN
		 println new PokerHand("TS JS QS KS AS").compareWith(new PokerHand("QH QS QC AS 8H")) == Result.WIN
		 println new PokerHand("AC AH AS AS KS").compareWith(new PokerHand("TC JS QC KS AC")) == Result.WIN
		 println new PokerHand("AC AH AS AS KS").compareWith(new PokerHand("QH QS QC AS 8H")) == Result.WIN
		 println new PokerHand("TC JS QC KS AC").compareWith(new PokerHand("QH QS QC AS 8H")) == Result.WIN
		 println new PokerHand("7H 8H 9H TH JH").compareWith(new PokerHand("JH JC JS JD TH")) == Result.WIN
		 println new PokerHand("7H 8H 9H TH JH").compareWith(new PokerHand("4H 5H 9H TH JH")) == Result.WIN
		 println new PokerHand("7H 8H 9H TH JH").compareWith(new PokerHand("7C 8S 9H TH JH")) == Result.WIN
		 println new PokerHand("7H 8H 9H TH JH").compareWith(new PokerHand("TS TH TD JH JD")) == Result.WIN
		 println new PokerHand("7H 8H 9H TH JH").compareWith(new PokerHand("JH JD TH TC 4C")) == Result.WIN
		 println new PokerHand("JH JC JS JD TH").compareWith(new PokerHand("4H 5H 9H TH JH")) == Result.WIN
		 println new PokerHand("JH JC JS JD TH").compareWith(new PokerHand("7C 8S 9H TH JH")) == Result.WIN
		 println new PokerHand("JH JC JS JD TH").compareWith(new PokerHand("TS TH TD JH JD")) == Result.WIN
		 println new PokerHand("JH JC JS JD TH").compareWith(new PokerHand("JH JD TH TC 4C")) == Result.WIN
		 println new PokerHand("4H 5H 9H TH JH").compareWith(new PokerHand("7C 8S 9H TH JH")) == Result.WIN
		 println new PokerHand("4H 5H 9H TH JH").compareWith(new PokerHand("TS TH TD JH JD")) == Result.LOSS
		 println new PokerHand("4H 5H 9H TH JH").compareWith(new PokerHand("JH JD TH TC 4C")) == Result.WIN
		 println new PokerHand("7C 8S 9H TH JH").compareWith(new PokerHand("TS TH TD JH JD")) == Result.LOSS
		 println new PokerHand("7C 8S 9H TH JH").compareWith(new PokerHand("JH JD TH TC 4C")) == Result.WIN
		 println new PokerHand("TS TH TD JH JD").compareWith(new PokerHand("JH JD TH TC 4C")) == Result.WIN

	}
}
