/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cardgame;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Megha Patel
 */
public class CardGame {

   
    public static void main(String[] args) {
        //generate hands
        Player p1 = new Player(CardHandGenerator.generateHand(26));
        Player p2 = new Player(CardHandGenerator.generateHand(26));
        
        Scanner nextTurn = new Scanner(System.in);
        
        
        //System.out.println(p1.toString());
        //System.out.println(p2.toString());
        
        //tiebreaker(p1, p2);
       
        //System.out.println(p1.toString());
        //System.out.println(p2.toString());
        //Start game
        
        System.out.println("Please enter the letter 'n' to start the game!");
        String input = nextTurn.next();
        
        int p1count = 26;
        int p2count = 26;
        
        while(input != "n" || input != "q"){
        //Loop through rounds
            playTurn(p1, p2);
            p1count = p1.getDeck().length;
            p2count = p2.getDeck().length;
            System.out.printf("Player 1 current has %d cards. Player 2 currently has %d cards \n", p1count, p2count);
            if (p1count == 52){
                System.out.println("Player 1 has won all the cards! This game is over.");
                break;
            }
            else if (p2count == 52){
                System.out.println("Player 2 has won all the cards! This game is over.");
                break;
            }
            System.out.println("Please enter the letter 'n' to proceed!\n");
            input = nextTurn.next();
        }
    }
    
    public static void playTurn(Player p1, Player p2){
        ArrayList<Card> cards = new ArrayList<Card>();
        //Both players draw a card
        Card c1 = p1.drawCard();
        Card c2 = p2.drawCard();
        
        cards.add(c1);
        cards.add(c2);
        
        System.out.printf("Player 1 draws a %s, Player 2 draws a %s\n", c1.getValue(), c2.getValue());
        //compare card values;
        int result = compareCards(c1.getValue(), c2.getValue());
        
        //compare cards and handle tie result
        if (result == 1){
            System.out.println("PLAYER 1 wins the cards!");
            cards.forEach(c -> p1.addDeckBottom(c));
        }
        else if (result == 2){
            System.out.println("PLAYER 2 wins the cards!");
            cards.forEach(c -> p1.addDeckBottom(c));
        }
        else if (result == 0){
            tiebreaker(p1, p2, cards);
        }
    }
    
    // In the event of a tie, this method will be called to resolve it. 
    // It will loop through the next cards in each players' deck until two cards that do not have the same value have been pulled. 
    //When that happens, the winner will take all cards played in the tiebreaker.
    public static void tiebreaker(Player p1, Player p2, ArrayList<Card> cards) {
        System.out.println("WAR! More cards will be drawn!");
        
        while (true) {
            Card c1 = p1.drawCard();
            Card c2 = p2.drawCard();
        
            cards.add(c1);
            cards.add(c2);
            
            System.out.printf("Player 1 draws a %s, Player 2 draws a %s\n", c1.getValue(), c2.getValue());
            
            int result = compareCards(c1.getValue(), c2.getValue());
           //p1 Wins
           if (result == 1) {
               //if p1 ends, add the 2 cards to his
               System.out.println("PLAYER 1 wins the cards!");
               cards.forEach(c -> p1.addDeckBottom(c));
               break;
           }
           //p2 Wins
           else if (result == 2) {
               System.out.println("PLAYER 2 wins the cards!");
               cards.forEach(c -> p2.addDeckBottom(c));
               break;
           }
           else if (result == 0){
               System.out.println("Another draw! More cards will be drawn...");
           }
        }

    }
    
    // Returns 1 if player 1 won the turn. Returns 2 if player 2 won the turn. Returns 0 in the event of a tie.
    public static int compareCards(Value player1Card, Value player2Card) {
        
        int p1value = 0;
        int p2value = 0;
        
        // These two switch statements assign the cards their actual numerical value, so that they can be compared.
        
        switch(player1Card) {
            case ACE:
                p1value = 13;
                break;
            case KING:
                p1value = 12;
                break;
            case QUEEN:
                p1value = 11;
                break;
            case JACK:
                p1value = 10;
                break;
            case TEN:
                p1value = 9;
                break;
            case NINE:
                p1value = 8;
                break;
            case EIGHT:
                p1value = 7;
                break;
            case SEVEN:
                p1value = 6;
                break;
            case SIX:
                p1value = 5;
                break;
            case FIVE:
                p1value = 4;
                break;
            case FOUR:
                p1value = 3;
                break;
            case THREE:
                p1value = 2;
                break;
            case TWO:
                p1value = 1;
                break; 
        }
        
        switch(player2Card) {
            case ACE:
                p2value = 13;
                break;
            case KING:
                p2value = 12;
                break;
            case QUEEN:
                p2value = 11;
                break;
            case JACK:
                p2value = 10;
                break;
            case TEN:
                p2value = 9;
                break;
            case NINE:
                p2value = 8;
                break;
            case EIGHT:
                p2value = 7;
                break;
            case SEVEN:
                p2value = 6;
                break;
            case SIX:
                p2value = 5;
                break;
            case FIVE:
                p2value = 4;
                break;
            case FOUR:
                p2value = 3;
                break;
            case THREE:
                p2value = 2;
                break;
            case TWO:
                p2value = 1;
                break; 
        }
        
        if (p1value > p2value) return 1;
        else if (p1value < p2value) return 2;
        else return 0;
        
    }
    
}
