
public class Card {
	private int number;
	private int value;
	private int letter;
	private String letters;
	
	/**
	 * creates a card
	 * @param number int number of the given card in the deck
	 */
	public Card(int number) {
		
		this.number = number % 13;
		this.number++;
		if (this.number == 1) {
			this.value = 11;
		} else if (this.number >= 10) {
			this.value = 10;
		} else {
			this.value = this.number;
		}
		if(this.number >= 11){
			this.number++;
		}
		this.letter = number / 13;
	
		if(letter == 0)
			letters = "\u2665";
		if(letter == 1)
			letters = "\u2660" ;
		if(letter == 2)
			letters = "\u2666";
		if(letter == 3)
			letters = "\u2663";
		}
	
	/**
	 * gets value of the card
	 * @return value
	 */
	public int getValue() {
		return value;
	}
	
	
	/**
	 * returns a string representation of the object
	 */	
	public String toString() {
		String str = "";
		str += this.number;
		str += " ";
		str += this.letter;
		return str;
	}
	
	/**
	 * gets the number of the card
	 * @return number of the card
	 */
	public int getNumber() {
		return number;
	}

}
