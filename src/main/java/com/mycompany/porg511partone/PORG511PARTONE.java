/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.porg511partone;

import java.util.Scanner;

public class PORG511PARTONE {

    // USERNAME CHECK 
    public static boolean checkUserName(String userName) {
        return userName.contains("_") && userName.length() <= 5;
    }

    //  PASSWORD CHECK
    public static boolean checkPassword(String password) {
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasCapital = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        return password.length() >= 8 && hasCapital && hasNumber && hasSpecial;
    }

    // PHONE CHECK 
    public static boolean checkPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("+") && phoneNumber.length() <= 12;
    }

    //  MAIN METHOD 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Register User");

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        //  USERNAME LOOP
        String userName;
        while (true) {
            System.out.print("Enter username: ");
            userName = input.nextLine();

            if (checkUserName(userName)) {
                System.out.println("Username successfully captured.");
                break;
            } else {
                System.out.println("Invalid username. Must contain '_' and be 5 characters or less.");
            }
        }

        // PASSWORD LOOP
        String password;
        while (true) {
            System.out.print("Enter password: ");
            password = input.nextLine();

            if (checkPassword(password)) {
                System.out.println("Password successfully captured.");
                break;
            } else {
                System.out.println("Invalid password. Must be 8+ characters with capital, number, and special character.");
            }
        }

        // PHONE LOOP
        String phoneNumber;
        while (true) {
            System.out.print("Enter phone number (+code): ");
            phoneNumber = input.nextLine();

            if (checkPhoneNumber(phoneNumber)) {
                System.out.println("Phone number successfully captured.");
                break;
            } else {
                System.out.println("Invalid phone number. Must start with '+' and be max 11 characters.");
            }
        }

        System.out.println("\nUser registered successfully!");

        // LOGIN SECTION 
        System.out.println("\nLogin ");

        System.out.print("Enter username: ");
        String enteredUserName = input.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = input.nextLine();

        if (enteredUserName.equals(userName) && enteredPassword.equals(password)) {
            System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again!");
        } else {
            System.out.println("Username or password incorrect.");
        }

        input.close();
    }
}