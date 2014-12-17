
public class Hand {
	private Card[] cards;
	private int counter;
	private int numAces;
	private int sum;
	
	/**
	 * creates new deck in the hands with 52 cards
	 */
	public Hand() {
		this.numAces = 0;
		this.counter = 0;
		this.cards = new Card[52];
	}
	
	/**
	 * adds new card from the deck into the hand
	 * @param newCard Card new card from the deck
	 */
	public void addCard(Card newCard) {
		cards[counter] = newCard;
		counter++;
		
		if(newCard.getNumber() == 1)
			numAces++;
		
	}
	
	/**
	 * gets the sum of the cards
	 * @return sum
	 */
	public int getSum() {
		this.sum = 0;
		for(int i = 0; i < counter; i++) {
			this.sum += cards[i].getValue();
		}
		return sum;
	}
	
	/**
	 * sets the sum when there is more aces, sum is lower by 10
	 */
	public void setSum() {
		this.sum = this.sum - 10;
	}
	
	/**
	 * gets the number of aces in the hand
	 * @return number of aces
	 */
	public int getNumAces() {
		return numAces;
	}
	
	/**
	 * sets the number of aces, number is lower by 1
	 */
	public void setNumAces() {
		this.numAces--;
	}
	
	/**
	 * gets the counter
	 * @return counter
	 */
	public int getCounter() {
		return counter;
	}
	
	/**
	 * sets the counter, counter is lower by 1
	 */
	public void setCounter() {
		counter--;
	}

}
