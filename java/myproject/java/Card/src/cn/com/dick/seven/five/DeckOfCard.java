//Fig. 7.10:DeckOfCard.java
//DeckOfCard class represents a deck of playing cards
package cn.com.dick.seven.five;
import java.util.Random;

public class DeckOfCard 
{
	private Card deck[];//array of Card objects
	private int currentCard;//index of next Card to be dealt
	private final int NUMBER_OF_CARDS = 52;//constant number of Cards
	private final int NUMBER_OF_FACES = 13;//constant number of Faces
	private Random randomNumber;//randomNumber generator
	
	//constructor fills deck of cards
	public DeckOfCard()
	{
		String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
						  "Seven", "Eight", "Nine", "Ten", "Jack",
						  "Queen", "King"};
		String suits[] = {"Heart", "Diamond", "Clubs", "Spades"};
		
		deck = new Card[NUMBER_OF_CARDS];//create array of Card objects
		currentCard = 0;//set currentCard so first Card dealt is deck[0]
		randomNumber = new Random();//create random number generator
		
		//populate deck with Card objects
		for (int count = 0; count < deck.length; count++) 
		{
			deck[count] = new Card( faces[ count % 13 ], suits[ count / 13 ] );
		}//end DeckOfCard constructor
		
	}
	
	//shuffle deck of Cards with one-pass algorithm
	public void shuffle()
	{
		//after shuffling, dealing should start at deck[0] again
		currentCard = 0;//reinitialize currentCard
		
		//for each Card, pick another random Card and swap them
		for (int first = 0; first < deck.length; first++) 
		{
			//select a random number between 0 and 51
			int second = randomNumber.nextInt(NUMBER_OF_CARDS);
			
			//swap current Card with randomly selected Card
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
			
		}//end for
		
	}//end method shuffle
	
	//deal one Card
	public Card dealCard()
	{
		//determined whether Card remain to be dealt
		if (currentCard<deck.length)
			return deck[currentCard++];//return Card in array
		else
			return null;//return null to indicate that all Cards were dealt
	}//end method dealCard
	//judge one pile of card
	public int judgeCard( Card cards[])
	{
		//create faces array
		int faces[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		//define face number
		int faceNumber = 13;
		//arrange cards in face order
		for (int i = 0; i < cards.length; i++) 
		{
			switch (cards[i].getFace()) 
			{
			case "Ace":
				faces[0]++;
				break;
			case "Deuce":
				faces[1]++;
				break;
			case "Three":
				faces[2]++;
				break;
			case "Four":
				faces[3]++;
				break;
			case "Five":
				faces[4]++;
				break;
			case "Six":
				faces[5]++;
				break;
			case "Seven":
				faces[6]++;
				break;				
			case "Eight":
				faces[7]++;
				break;				
			case "Nine":
				faces[8]++;
				break;				
			case "Ten":
				faces[9]++;
				break;				
			case "Jack":
				faces[10]++;
				break;				
			case "Queen":
				faces[11]++;
				break;				
			case "King":
				faces[12]++;
				break;				
			default:
				System.out.println("Wrong int judgeCard()");
				break;
			}
		}
		//judge couple
		judgeCouple(faces);
		//judge suit
		//judgeSuit(cards);
		//judge red
		judgeRed(faces);
		//judge order
		return	judgeContinue(faces) * judgeSuit(cards);
		
	}
	//judge one pile of card whether has couple
	/**
	 * @param faces(int)
	 * faces array 
	 */
	public void judgeCouple( int faces[])
	{
		String face[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
				  "Seven", "Eight", "Nine", "Ten", "Jack",
				  "Queen", "King"};
		//arrange cards in face order
		for (int i = 0; i < faces.length; i++) 
		{
			if (faces[i] >= 2)
				System.out.printf("%s的数量是%d\n",
					face[i], faces[i]	);
		}
	}
	//judge one pile of card whether has the same suit
	public int judgeSuit(Card cards[])
	{
		//determine an value to memory the change
		String compareString = cards[0].getSuit();
		int differFlag = 0;
		
		for (int i = 0; i < cards.length; i++) 
		{
			if (compareString != cards[i].getSuit()) {
				differFlag = 1;
			}
		}
		
		if (differFlag == 0)
			{
				System.out.println("同花");
				return 1;
			}
		else
			return 0;
	}
	//judge one pile of cards has continue order
	public int judgeContinue(int faces[])
	{
		//create an value to indicate the change
		int Flags = 0;
		int breakFlag = 0;
		//order
		for (int i = 0; i < faces.length - 4; i++) 
		{
			if(breakFlag == 1)
				break;
			Flags = 0;
			if(faces[i]==1&&i+4<=faces.length)
			{
				for (int j = i; j < i + 5; j++) 
				{
					if (faces[j]==1)
					{	
						Flags++;
					}
					else
					{
						breakFlag = 1;
						break;
					}
				}
				if (Flags == 5)
					break;
			}
			else if (faces[i] > 1)
			{
				break;
			}
		}
		if (Flags == 5)
		{
			System.out.println("同花顺");
			return 1;
		}
		else
			return 0;
	}
	//judge one pile of cards has "red" phenomenon
	public void judgeRed(int faces[])
	{
		//count number of more than 1
		int count = 0;
		for (int i = 0; i < faces.length; i++) 
		{
			if (faces[i] == 0)
				continue;
			else if (faces[i] == 1)
			{
				count = 0;
				break;
			}
			else if (faces[i] >= 1)
				count++;
		}
		
		if (count==2)
		{
			System.out.println("满堂红");
		}
			
	}

}//end class DeckOfCard
