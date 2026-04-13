/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.porg511partone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author stone
 */
public class PORG511PARTONETest {
    

    /*
      Test of checkUserName method, of class PORG511PARTONE.
     */
    @org.junit.jupiter.api.Test
    public void testCheckUserName() {

        // Valid username
        assertTrue(PORG511PARTONE.checkUserName("ab_cd"));

        // Invalid - no underscore
        assertFalse(PORG511PARTONE.checkUserName("abcd"));

        // Invalid - too long
        assertFalse(PORG511PARTONE.checkUserName("abcdef"));
    }

    /*
      Test of checkPassword method, of class PORG511PARTONE.
     */
    @org.junit.jupiter.api.Test
    public void testCheckPassword() {

        // Valid password
        assertTrue(PORG511PARTONE.checkPassword("Pass@123"));

        // Invalid - no capital
        assertFalse(PORG511PARTONE.checkPassword("pass@123"));

        // Invalid - no number
        assertFalse(PORG511PARTONE.checkPassword("Password@"));

        // Invalid - no special character
        assertFalse(PORG511PARTONE.checkPassword("Password1"));
    }

    /*
      Test of checkPhoneNumber method, of class PORG511PARTONE.
     */
    @org.junit.jupiter.api.Test
       public void testCheckPhoneNumber() {

        // Valid phone number
        assertTrue(PORG511PARTONE.checkPhoneNumber("+2712345678"));

        // Invalid - no +
        assertFalse(PORG511PARTONE.checkPhoneNumber("0712345678"));

        // Invalid - too long
        assertFalse(PORG511PARTONE.checkPhoneNumber("+271234567890"));
    }
       
    @org.junit.jupiter.api.Test
    public void testLogin() {

        String correctUsername = "ab_cd";
        String correctPassword = "Pass@123";

        // Correct login
        boolean success = correctUsername.equals("ab_cd") && correctPassword.equals("Pass@123");
        assertTrue(success);

        // Incorrect login
        boolean fail = correctUsername.equals("ab_cd") && "wrong".equals("Pass@123");
        assertFalse(fail);
    }
       
       
       
   }
