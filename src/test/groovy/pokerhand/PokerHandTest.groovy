package pokerhand

import spock.lang.Specification

class PokerHandTest extends Specification {

	def "Comparacao entre PokerHands"(){
		given:
			PokerHand p1 = new PokerHand(a)
			PokerHand p2 = new PokerHand(b)

		expect:
		p1.compareWith(p2) == c

		where:
		a | b | c
		"TC TH 5C 5H KH" | "9C 9H 5C 5H AC" | Result.WIN
		"TS TD KC JC 7C" | "JS JC AS KC TD" | Result.LOSS
		"7H 7C QC JS TS" | "7D 7C JS TS 6D" | Result.WIN
		"5S 5D 8C 7S 6H" | "7D 7S 5S 5D JS" | Result.LOSS
		"AS AD KD 7C 3D" | "AD AH KD 7C 4S" | Result.LOSS
		"TS JS QS KS AS" | "AC AH AS AS KS" | Result.WIN
		"TS JS QS KS AS" | "TC JS QC KS AC" | Result.WIN
		"TS JS QS KS AS" | "QH QS QC AS 8H" | Result.WIN
		"AC AH AS AS KS" | "TC JS QC KS AC" | Result.WIN
		"AC AH AS AS KS" | "QH QS QC AS 8H" | Result.WIN
		"TC JS QC KS AC" | "QH QS QC AS 8H" | Result.WIN
		"7H 8H 9H TH JH" | "JH JC JS JD TH" | Result.WIN
		"7H 8H 9H TH JH" | "4H 5H 9H TH JH" | Result.WIN
		"7H 8H 9H TH JH" | "7C 8S 9H TH JH" | Result.WIN
		"7H 8H 9H TH JH" | "TS TH TD JH JD" | Result.WIN
		"7H 8H 9H TH JH" | "JH JD TH TC 4C" | Result.WIN
		"JH JC JS JD TH" | "4H 5H 9H TH JH" | Result.WIN
		"JH JC JS JD TH" | "7C 8S 9H TH JH" | Result.WIN
		"JH JC JS JD TH" | "TS TH TD JH JD" | Result.WIN
		"JH JC JS JD TH" | "JH JD TH TC 4C" | Result.WIN
		"4H 5H 9H TH JH" | "7C 8S 9H TH JH" | Result.WIN
		"4H 5H 9H TH JH" | "TS TH TD JH JD" | Result.LOSS
		"4H 5H 9H TH JH" | "JH JD TH TC 4C" | Result.WIN
		"7C 8S 9H TH JH" | "TS TH TD JH JD" | Result.LOSS
		"7C 8S 9H TH JH" | "JH JD TH TC 4C" | Result.WIN
		"TS TH TD JH JD" | "JH JD TH TC 4C" | Result.WIN
	}

	def "Ordenacao PokerHands"() {
		given:
			def royalFlush = new PokerHand("AH KH QH JH TH")
			def flush1 =  new PokerHand("2H 4H 6H 8H TH")
			def flush2 =  new PokerHand("3H 4H 6H 8H TH")
			def cartaAlta = new PokerHand("3H 4C 6C 8H TH")
			def resultadoEsperado = [cartaAlta, flush2, flush1, royalFlush]
			def resultadoObtido = [flush2, cartaAlta, royalFlush, flush1]

		when:
			Collections.sort(resultadoObtido, new PokerHandComparator())

		then:
			resultadoEsperado == resultadoObtido

	}
}
