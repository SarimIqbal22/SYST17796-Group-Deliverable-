/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author abbyaube
 */
public class Player {
   
    private Card[] deck = new Card[52];
    private Card[] winnings = new Card[52];
    
    public Player(Card[] deck) {
        
        this.deck = deck;
        
    }
    
    public Card[] getDeck() {
        return deck;
    }
   
    public void setDeck(Card[] deck) {
        this.deck = deck;
    }
    
    public Card[] getWinnings() {
        return winnings;
    }
    
    public void setWinnings(Card[] winnings) {
        this.winnings = winnings;
    }
    
    public String toString() {
        String ts = "";
        
        for (int i = 0; i < deck.length; i++) {
            ts = ts + "Card " + i + ": " + deck[i].getValue() + " of " + deck[i].getSuit() + "; ";
        }
        
        return ts;
    }
    
    // At the end of a round when one or both players have run out of cards, this method will be called to convert a player's winnings from the pervious round into their deck for their next round.
    public Card[] convertWinnings() {
    Card[] newDeck = new Card[52];
    for(int i = 0; i < winnings.length; i++) {
        if (!(winnings[i].getValue() != Value.NULL)) {
            newDeck[i].setValue(winnings[i].getValue());
        }
                        
    }
    
    
    return newDeck;
}
        
    
    
}
