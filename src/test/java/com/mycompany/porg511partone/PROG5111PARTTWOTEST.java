/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.porg511partone;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author stone
 */
public class PROG5111PARTTWOTEST {
    
      // ===== USERNAME TEST =====
    @Test
    public void testCheckUserName() {

        // Valid username
        assertTrue(PORG511PARTONE.checkUserName("ab_cd"));

        // Invalid username
        assertFalse(PORG511PARTONE.checkUserName("abcdef"));
    }

    // ===== PASSWORD TEST =====
    @Test
    public void testCheckPassword() {

        // Valid password
        assertTrue(PORG511PARTONE.checkPassword("Password1!"));

        // Invalid password
        assertFalse(PORG511PARTONE.checkPassword("pass"));
    }

    // ===== PHONE NUMBER TEST =====
    @Test
    public void testCheckPhoneNumber() {

        // Valid phone number
        assertTrue(PORG511PARTONE.checkPhoneNumber("+27123"));

        // Invalid phone number
        assertFalse(PORG511PARTONE.checkPhoneNumber("0712345678"));
    }

    // ===== MESSAGE ID TEST =====
    @Test
    public void testCheckMessageID() {

        PROG5111PARTTWO msg = new PROG5111PARTTWO(0, "+27123", "Hello");

        assertTrue(msg.checkMessageID());
    }

    // ===== RECIPIENT TEST =====
    @Test
    public void testCheckRecipientCell() {

        PROG5111PARTTWO msg = new PROG5111PARTTWO(0, "+27123", "Hello");

        assertTrue(msg.checkRecipientCell());
    }

    // ===== MESSAGE TOO LONG TEST =====
    @Test
    public void testMessageTooLong() {

        String longMessage = "a".repeat(251);

        PROG5111PARTTWO msg = new PROG5111PARTTWO(0, "+27123", longMessage);

        assertEquals(
                "Please enter a message of less than 250 characters.",
                msg.sentMessage()
        );
    }

    // ===== MESSAGE SENT TEST =====
    @Test
    public void testMessageSent() {

        PROG5111PARTTWO msg = new PROG5111PARTTWO(0, "+27123", "Hello");

        assertEquals("Message sent", msg.sentMessage());
    }

    // ===== TOTAL MESSAGE TEST =====
    @Test
    public void testTotalMessages() {

        int before = PROG5111PARTTWO.returnTotalMessages();

        new PROG5111PARTTWO(1, "+27123", "Test");

        int after = PROG5111PARTTWO.returnTotalMessages();

        assertEquals(before + 1, after);
    }
    
    
}
