package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
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

        ArrayList<String> myArr = new ArrayList<String>();

        //declaring variables
        String userInput;
        Boolean keepOpen = true;
        int wordsInArray;

        //Initial user message
        System.out.println("Good day. What is your problem? Enter your response here or Q to quit: ");
        userInput= keyboard.nextLine(); // take user input and store it in the var userInput

        String words[] = userInput.split(" "); // This splits up the words in a string and stores them in an array.
        System.out.println(words.length);//This out puts the qty of words in the array created by the split function.

        for (){


        }






        /*
        //Start the while loop
        while(keepOpen){
            if (userInput.equalsIgnoreCase("q") || userInput.equalsIgnoreCase("I am feeling great")){
                keepOpen = false;
            }
            else {
                System.out.println("Why do you say that "+ userInput + "?");
                userInput = keyboard.nextLine();
                //if (userInput.split(" ") ==  )
            }

        }
        */







    }
}
