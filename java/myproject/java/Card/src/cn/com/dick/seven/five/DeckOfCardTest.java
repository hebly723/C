//Fig 7.11: DeckOfCardTest.java
//Card shuffling and dealing application.
package cn.com.dick.seven.five;

public class DeckOfCardTest {
//execute application
	public static void main(String[] args) {
		DeckOfCard myDeckOfCard = new DeckOfCard();
		myDeckOfCard.shuffle();//place Cards in random order
		
		//print all 52 Cards in the order in which they are dealt
		//print all 52 Cards in the order in which they are dealt
//		Card onceCard[] = new Card[5];
//		onceCard[0] = new Card("Ace", "Spades");
//		onceCard[1] = new Card("Deuce", "Spades");
//		onceCard[2] = new Card("Three", "Spades");
//		onceCard[3] = new Card("Four", "Spades");
//		onceCard[4] = new Card("Five", "Spades");
//		myDeckOfCard.judgeCard(onceCard);
		int y = 0;
		int i = 0;
		do
		{
			myDeckOfCard.shuffle();
			
			Card cards[] = {myDeckOfCard.dealCard(),myDeckOfCard.dealCard(),
					myDeckOfCard.dealCard(), myDeckOfCard.dealCard(),
					myDeckOfCard.dealCard()};
			//deal and print 4 Cards
			System.out.printf("%-20s%-20s%-20s%-20s%-20s\n",
					cards[0], cards[1], cards[2],
					cards[3], cards[4]);
			myDeckOfCard.judgeCard(cards);
			System.out.println("****");
			
			y = myDeckOfCard.judgeCard(cards);
			i++;
			
		}while(y == 0);
		System.out.println(i);

	}

}
