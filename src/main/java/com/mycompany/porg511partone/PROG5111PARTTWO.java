/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.porg511partone;
import java.util.Random;
/**
 *
 * @author stone
 */
public class PROG5111PARTTWO {
    
    private String messageID;
    private int messageNumber;
    private String recipient;
    private String message;
    private String messageHash;

    private static int totalMessages = 0;

    // CONSTRUCTOR
    public PROG5111PARTTWO(int messageNumber, String recipient, String message) {

        this.messageID = generateMessageID();
        this.messageNumber = messageNumber;
        this.recipient = recipient;
        this.message = message;
        this.messageHash = createMessageHash();

        totalMessages++;
    }

    //  GENERATE MESSAGE ID 
    private String generateMessageID() {

        Random random = new Random();

        String id = "";

        for (int i = 0; i < 12; i++) {
            id += random.nextInt(12);
        }

        return id;
    }

    // CHECK MESSAGE ID 
    public boolean checkMessageID() {
        return messageID.length() <= 12;
    }

    //  CHECK RECIPIENT 
    public boolean checkRecipientCell() {
        return recipient.startsWith("+") && recipient.length() <= 12;
    }

    //  CREATE HASH 
    public String createMessageHash() {

        String[] words = message.split(" ");

        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        String hash =
                messageID.substring(0, 2)
                + ":"
                + messageNumber
                + ":"
                + firstWord
                + lastWord;

        return hash.toUpperCase();
    }

    //  SENT MESSAGE 
    public String sentMessage() {

        if (message.length() > 250) {
            return "Please enter a message of less than 250 characters.";
        } else {
            return "Message sent";
        }
    }

    //  PRINT MESSAGE 
    public String printMessages() {

        return
                "Message ID: " + messageID
                + "\nMessage Hash: " + messageHash
                + "\nRecipient: " + recipient
                + "\nMessage: " + message;
    }

    // TOTAL MESSAGES 
    public static int returnTotalMessages() {
        return totalMessages;
    }
    
}
