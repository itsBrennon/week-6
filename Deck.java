/*Cards (List of Card)
*Shuffle (randomizes the order of the cards)
*Draw (removes and returns the top card of the Cards field)
*In the constructor, when a new Deck is instantiated, 
*Card field should be populated with the standard 52 cards.*/

package war;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("serial")
public class Deck extends ArrayList<Card> {
	private List<String> suits = List.of("Diamonds", "Hearts", "Spades", "Clubs");
	private List<String> cardNames = List.of("2","3","4","5","6","7","8","9","10",
			"Jack","Queen","King","Ace");
	
	public Deck() {
		for (int cardRank = 0; cardRank<cardNames.size(); cardRank++) {
			
			int cardValue = cardRank +1;
			String cardName = cardNames.get(cardRank);
			
			for (String suit : suits) {
				this.add(new Card(cardName, suit, cardValue));
			}
		} 
	}
	
	public void shuffle() {
		Collections.shuffle(this);
		}
	
	public void deal(Deck deck, Player player1, Player player2) {
		int size = deck.size();
		for (int i = 0; i < size; i++) {
			if(i % 2 == 0) {
				player1.draw(deck);
			}
			else {
				player2.draw(deck);
			}
		}
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String extraLine = System.lineSeparator();
		sb.append("List of Cards: ").append((extraLine));
		
		for (Card card : this) {
		sb.append(" ").append(card).append(extraLine);
		}
	return sb.toString();
	}
	
	
}