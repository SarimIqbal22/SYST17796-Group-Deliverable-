/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Work
 */
public class CardGameTest {
    
    public CardGameTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class CardGame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CardGame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of playTurn method, of class CardGame.
     */
    @Test
    public void testPlayTurn() {
        System.out.println("playTurn");
        Player p1 = null;
        Player p2 = null;
        CardGame.playTurn(p1, p2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of tiebreaker method, of class CardGame.
     */
    @Test
    public void testTiebreaker() {
        System.out.println("tiebreaker");
        Player p1 = null;
        Player p2 = null;
        ArrayList<Card> cards = null;
        CardGame.tiebreaker(p1, p2, cards);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compareCards method, of class CardGame.
     */
    @Test
    public void testCompareCards() {
        System.out.println("compareCards");
        Value player1Card = null;
        Value player2Card = null;
        int expResult = 0;
        int result = CardGame.compareCards(player1Card, player2Card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
