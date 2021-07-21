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
        
        Scanner input= new Scanner(System.in);
        Card[] hand=CardHandGenerator.generateHand(7);
        
        //print entire hand
        System.out.println("Hand of 7 cards:");
        
        for(Card card:hand)
        {
            System.out.println(card.getValue()+" of "+ card.getSuit());
        }
        
        //user input for a card
        
        System.out.println("Enter suit for your card: ");
        for(int i=0; i<Suit.values().length;i++)
        {
            System.out.println((i+1)+": "+ Suit.values()[i]);
        }
        int suitPos=input.nextInt()-1;
        
        System.out.println("Enter a value : " );
      //  int value=input.nextInt();
         for(int i=0; i<Value.values().length;i++)
        {
            System.out.println((i+1)+": "+ Value.values()[i]);
        }
         
         int valuePos=input.nextInt()-1;
         
        Card userCard=new Card(Value.values()[valuePos],Suit.values()[suitPos]);
        
        
        //match user card within hand of 7 cards
        
        boolean flag=false;
        for(Card card:hand)
        {
            if(card.getValue()==userCard.getValue() && card.getSuit().equals(userCard.getSuit()))
            {
               flag=true;
                
                break;
            }
          
            
        }
        if(flag==true)
            System.out.println("your card is matched!!");
        else
             System.out.println("Sorry no match found..");
        
        
        
    }

}
