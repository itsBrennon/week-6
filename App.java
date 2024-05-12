 /*
  * Create a class called App with a main method.

a.      Instantiate a Deck and two Players, call the shuffle method on the deck.

b.     Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using 
the Deck you instantiated.

c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.

Compare the value of each card returned by the two player’s flip methods. 
Call the incrementScore method on the player whose card has the higher value.  Print a message to say which player received a point.

d.      After the loop, compare the final score from each player.

e.      Print the final score of each player and either “Player 1”, “Player 2”, 
or “Draw” depending on which score is higher or if they are both the same.
  */




package war;


	public class App {
		public static void main(String[] args) {
			new App ().playGame();
		}
//
		private void playGame() {
			Player player1 = new Player("Brennon");
			Player player2 = new Player("AI");
			System.out.println(player1 + " is playing " + player2 + " in the classic card game WAR");
			Deck deck = new Deck();
			deck.shuffle();
			deck.deal(deck, player1, player2);
			player1.describe();
			player2.describe();
			play(player1,player2);
			declareWinner(player1, player2);
			}
		
		private void play(Player player1, Player player2) {
			int numTurns = 26;
			for (int i = 0; i < numTurns; i++) {
				Card card1 = player1.flip();
				Card card2 = player2.flip();
				
				if(card1.getCardValue() > card2.getCardValue()) {
					player1.incrementScore();
				}
				else if(card2.getCardValue() > card1.getCardValue()) {
					player2.incrementScore();
				} else {
				}
			}
		}
		private void declareWinner(Player player1, Player player2) {
			if(player1.getScore() > player2.getScore()) {
				printWinner(player1);
				printLoser(player2);
			} else if(player2.getScore()> player1.getScore()) {
				printWinner(player2);
				printLoser(player1);
			}
			else {
				printDraw(player1,player2);
			}
		}

		private void printDraw(Player player1, Player player2) {
			System.out.println("\n" + player1 + " " + player2 + " Draw");
		}

		private void printLoser(Player loser) {
			System.out.println("\n" + loser + " is the loser! " + loser.getScore());
		}

		private void printWinner(Player winner) {
			System.out.println("\n" + winner + " is the winner! " + winner.getScore());
		}
	}