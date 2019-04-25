package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
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
        int indexOfMyArr = myArr.size();
        String holder = " ";


        //Now going to make the hash map to replace certain words.
        HashMap<String,String> myMap = new HashMap<String,String>();
        /*
        The values entered in the hash map are predetermined.
         */
        myMap.put("i","you");
        myMap.put("me", "you");
        myMap.put("my","your");
        myMap.put("am","are");


        //Initial user message
        System.out.println("Good day. What is your problem? Enter your response here or Q to quit: ");
        userInput= keyboard.nextLine(); // take user input and store it in the var userInput


        //Start the while loop
        while(keepOpen){
            if (userInput.equalsIgnoreCase("q") || userInput.equalsIgnoreCase("I am feeling great")){
                keepOpen = false;
            }
            else {
//                System.out.println("Why do you say that "+ userInput + "?");
//                userInput = keyboard.nextLine();
                String words[] = userInput.split(" "); // This splits up the words in a string and stores them in an array.
                wordsInArray = words.length;//This outputs the qty of words in the array created by the split function.

                for (int i =0; i<wordsInArray; i++){ //This for loop takes all the values in the array made above and stores them in a new array list.
                    //System.out.println(i); // This prints the index of the array words[]
                    //System.out.println(words[i]); // This prints the word at the index i (the number above)
                    //myArr.add(words[i]);// This adds the values from the first array into the arrayList.
                    //System.out.println(myArr); // this just displays the items inside of the new arraylist.
                    String answer = "";
                    if(words[i].equalsIgnoreCase("i")){
                        words[i]= "you";
                        System.out.println(words[i]);
                    }else {

                    }
                }
                break;
                }

            }

        }







    }

