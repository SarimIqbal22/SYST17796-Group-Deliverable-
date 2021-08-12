/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cardgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class CardGame {

   
    public static void main(String[] args) {
        Player p1 = new Player(CardHandGenerator.generateHand(26));
        Player p2 = new Player(CardHandGenerator.generateHand(26));
        
       System.out.println(p1.toString());
       //System.out.println(p2.toString());
       
       System.out.println("");
       
       System.out.println(p1.drawCard());
       System.out.println(p1.drawCard());
       System.out.println(p1.drawCard());
       System.out.println(p1.drawCard());
       
       System.out.println("");
       
       System.out.println(p1.toString());
       
       //Start game
       
       //Loop through rounds
       
           //check for tiebreaker
           
           //convert winnings to each player
    }
    
    public static void playTurn(){
        
    }
    
    // In the event of a tie, this method will be called to resolve it. 
    // It will loop through the next cards in each players' deck until two cards that do not have the same value have been pulled. 
    //When that happens, the winner will take all cards played in the tiebreaker.
    public static void tiebreaker(Player p1, Player p2) {
        int i = 1;
        while (true) {
            i++;
           //p1 Wins
           if (compareCards(p1.drawCard().getValue(), p2.drawCard().getValue()) == 1) {
               break;
           }
           //p2 Wins
           else if (compareCards(p1.drawCard().getValue(), p2.drawCard().getValue()) == 2) {
               break;
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
