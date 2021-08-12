/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getDeck method, of class Player.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        Player instance = null;
        Card[] expResult = null;
        Card[] result = instance.getDeck();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeck method, of class Player.
     */
    @Test
    public void testSetDeck() {
        System.out.println("setDeck");
        Card[] deck = null;
        Player instance = null;
        instance.setDeck(deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDeckBottom method, of class Player.
     */
    @Test
    public void testAddDeckBottom() {
        System.out.println("addDeckBottom");
        Card card = null;
        Player instance = null;
        instance.addDeckBottom(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWinnings method, of class Player.
     */
    @Test
    public void testGetWinnings() {
        System.out.println("getWinnings");
        Player instance = null;
        Card[] expResult = null;
        Card[] result = instance.getWinnings();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWinnings method, of class Player.
     */
    @Test
    public void testSetWinnings() {
        System.out.println("setWinnings");
        Card[] winnings = null;
        Player instance = null;
        instance.setWinnings(winnings);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawCard method, of class Player.
     */
    @Test
    public void testDrawCard() {
        System.out.println("drawCard");
        Player instance = null;
        Card expResult = null;
        Card result = instance.drawCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertWinnings method, of class Player.
     */
    @Test
    public void testConvertWinnings() {
        System.out.println("convertWinnings");
        Player instance = null;
        Card[] expResult = null;
        Card[] result = instance.convertWinnings();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
