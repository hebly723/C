//Fig. 7. 9: Card. java
//card class represents a playing card
package cn.com.dick.seven.five;

/**
 * @author 张钊晋
 * Card
 * 2016年2月4日下午9:55:38
 */
public class Card {
	private String face;//face of card("Ace", "Deuce", ...)
	private String suit;//suit of card("Hearts", "Diamonds")
	
	public String getFace() {
		return face;
	}

	public String getSuit() {
		return suit;
	}
	
	//two-argument constructor initializes card's face and suit
	public Card(String cardFace, String cardSuit)
	{
		face = cardFace;//initialize face of card
		suit = cardSuit;//initialize suit of card
	}//end two-argument Card constructor
	
	//return String representation of Card
	public String toString()
	{
		return face + " of " + suit;
	}//end method toString

}//end class card
