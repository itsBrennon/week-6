/*
*Hand (List of Card)
*Score 
*Describe (prints out information about the player and calls the describe method for each card in the Hand List)
*Flip (removes and returns the top card of the Hand)
*Draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
*IncrementScore (adds 1 to the Player’s score field)
 
 */

package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	List<Card> hand = new ArrayList<Card>();
	private int score;
	
	 Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.remove(0));	
	}
	//public Hand getHand() {
		//return hand;
	//}
	public Card flip() {
		return hand.remove(0);
	}
	public void incrementScore() {
		score++;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		return name;
	}
	public void describe() {
		System.out.println("\nPlayer " + name + " has this " + hand );
		
	}	
}

		

		

		
		
