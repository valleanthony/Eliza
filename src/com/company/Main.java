package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
    You will be creating an interactive chat-bot type program. Eliza is a therapist program that interacts with the user.
    Your program will need to evaluate what the user asks and turn the user's input into a question that sounds like the therapist really cares.
    Your first task is to develop a program with a running loop. If the user types in "I am feeling great" or enter "Q", the program will stop running.
    Your program should print out the last input (as an output) every time before accepting new input.
    Make sure you are accommodating for NO case-sensitivity. (Q is the same as q)
	 */
        //Making a scanner for user input
        Scanner keyboard = new Scanner(System.in);

        //declaring variables
        String userInput;
        Boolean keepOpen = true;

        //Initial user message
        System.out.println("Good day. What is your problem? Enter your response here or Q to quit: ");
        userInput= keyboard.nextLine();



        //Start the while loop
        while(keepOpen){
            if (userInput.equalsIgnoreCase("q") || userInput.equalsIgnoreCase("I am feeling great")){
                keepOpen = false;
            }
            else {
                System.out.println("Why do you say that "+ userInput + "?");
                userInput = keyboard.nextLine();
            }

        }







    }
}
