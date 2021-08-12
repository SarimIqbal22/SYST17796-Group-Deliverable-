package cardgame;

import java.util.Random;

public class CardHandGenerator {

    /**
     * 
     * @param numCards
     */
    public static Card[] generateHand(int numCards) {
       //an array to hold 7 cards
        Card[] hand=new Card[numCards];
        
        Random random=new Random();
        
        for(int i=0; i< hand.length;i++)
        {
           
            Value value=Value.values()[random.nextInt(13) + 1];
            Suit suit=Suit.values()[random.nextInt(4) + 1];
            Card card=new Card(value,suit);
            hand[i]=card;
        
        }
        return hand;
    }

}