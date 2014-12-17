
public class Deck {
	
	private Card[] cards;
	private int counter = 0;
	
	/**
	 * creates new deck with 52 cards and shuffles them
	 */
	public Deck() {
		cards = new Card[52];
		for(int i = 0; i < cards.length; i++)
			cards[i] = new Card(i + 1);
		Shuffle();
		
	}
	
	/**
	 * shuffles the cards
	 */
	public void Shuffle() {
		Card[] temp = new Card[52];
		for(int i = 0; i < cards.length; i++) {
			int b = (int)(Math.random() * 52);
			if(temp[b] == null)
				temp[b] = cards[i];
			else i--;
		}
		cards = temp;
		
	}
	
	/**
	 * prints the deck of cards
	 */
	public void printCards() {
		for(int i = 0; i < cards.length; i++)
			System.out.println(cards[i].toString());
	}
	
	/**
	 * gets the next card on top from the deck
	 * @return the next card
	 */
	public Card getNext() {
		if(counter + 1 < 52)
			return cards[counter++];
		else return null;
	}
	

}
