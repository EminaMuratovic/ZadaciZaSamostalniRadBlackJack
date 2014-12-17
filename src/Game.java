/**
 * We made a game called 'BlackJack'.
 * The player plays the game in the consol.
 * @author eminamuratovic
 *
 */
public class Game {
	public static void main(String[] args) {
		boolean endOfTheGame = false; // checks if we came to the and of the game
		
		Deck deck = new Deck();
		Hand player = new Hand();
		Hand dealer = new Hand();
		
		player.addCard(deck.getNext());
		player.addCard(deck.getNext());
		
		dealer.addCard(deck.getNext());
		dealer.addCard(deck.getNext());
		
		//if the sum of the players cards is less then 10, player gets new card
		while(player.getSum() < 10) {
			player.addCard(deck.getNext());
		}
		
		System.out.println("The player has: " + player.getSum());
		System.out.println("The dealer has: " + dealer.getSum());
		
		//checks if the sum is 21, if so the player has won
		if(player.getSum() == 21) {
			System.out.println("Congratulations! You have won the game! BlackJack! :D");
			return ;
		}
		
		//game continues
		while(player.getSum() < 21 || endOfTheGame == false) {
			System.out.println("Type 'next' if you want new card: ");
			String next = TextIO.getlnString();
		if(!next.equals("next")) 
			break;
		else {
			player.addCard(deck.getNext());
			
			//if the sum is more than 21 and the player doesn't have any aces
			if(player.getSum() > 21 && player.getNumAces() < 1) {
				System.out.println("We are sorry! You have lost the game! :(");
				endOfTheGame = true;
				break;
			}
			
			//if the sum is more than 21 and the player has 1 or more aces in the hand
			if(player.getSum() > 21 && player.getNumAces() > 0) {
				player.setSum();
				player.setCounter();
				player.setNumAces();
			}
			
			//if the sum is 21
			if(player.getSum() == 21) {
				System.out.println("BlackJack! :)))");
				endOfTheGame = true;
				break;
			}
			
			System.out.println("New sum is "+ player.getSum());
			
		}
		
	}

		//if it's not the end of the game, dealer gets new card
		if(endOfTheGame == false) {
			while (dealer.getSum() < 17) {
				dealer.addCard(deck.getNext());
				
				if(dealer.getSum() > 21) {
					System.out.println("Congratulations! You have won the game!");
					endOfTheGame = true;
					break;
				}
				if(dealer.getSum() > 21 && dealer.getNumAces() < 1) {
					System.out.println("Congratulations! You have won the game!");
					endOfTheGame = true;
					break;
				}
				if(dealer.getSum() > 21 && dealer.getNumAces() > 0) {
					dealer.setSum();
					dealer.setCounter();
					dealer.setNumAces();
				}
			}
		}
		
		//if it's not the end of the game we have to see whose sum is bigger
		if(endOfTheGame == false) {
			if(dealer.getSum() > player.getSum())
				System.out.println("Dealer has won the game!");
			else if(dealer.getSum() < player.getSum())
				System.out.println("Congratulations! You have won the game!");
			else 
				System.out.println("It's a draw!");
		}
		
		System.out.println();
		System.out.println("The player has: " + player.getSum());
		System.out.println("The dealer has: " + dealer.getSum());
		
}
}
