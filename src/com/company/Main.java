package com.company;
/*
//// - completed/successful
**** - it won't work/ I really tried but I don't know how to make it work
I'll look at this later again to see if I can fix anything...

The Need for Representation
 - Need a scanner system to input strings ////

 - generate a random number that correlates to where you'll begin your representation
    random number from 1-5
           Method taken from: https://stackoverflow.com/questions/5887709/getting-random-numbers-in-java
        I forgot how ////

 - Find starting position in string by random percent; .stringlength * generated percent --> num truncated
    --> starting position in string ////

 - order: binary, octal, decimal, hexadecimal, and Ascii; conversions:
        - Binary: .toBinaryString(); (in () put the value/string)
        - Octal: .toOctalString();
        - Decimal: binary to decimal; Integer.parseInt();
            (https://beginnersbook.com/2014/07/java-program-for-binary-to-decimal-conversion/)
        - Hexadecimal: .toHexString();
        - ASCII: Just print out the character

 - how to make it go into a cycle ****
    assign the starting position a special thing? by using the substring method --> set as limit
    do a loop; do while?
 - (o, starting p), and (starting p, .length)
 - count++? until it equals starting p
 - .char isn't really helpful with this assignment??
 */


import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//Input from the user; the word
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input a word");
        String word = userInput.next();
        int wlength = word.length();

//Finding percent/starting position in word

        double decimalpercent = Math.random(); //making 0 not inclusive
        if (decimalpercent == 0) {
            decimalpercent = decimalpercent + 1;
        }

        double startPword = wlength * decimalpercent;
        int startingPword = (int) startPword; //STARTING POSITION
        System.out.println(startingPword); //comment out later; the number position


//random starting position for the conversion numbers
        Random startingPconversion = new Random();
        int n = startingPconversion.nextInt(5) + 1;
        ///System.out.println(n); <--checking to see if this works
        int i;
        int a;

        for (i = 0; i < startingPword; i++) {
            word.substring(i, i + 1);
            System.out.println(word.substring(i, i + 1));

            for (a = startingPword + 1; a > wlength; a++) { //how come this won't work?? This is nested so shouldn't it??
                word.substring(startingPword + a, a + 1);
                System.out.println(word.substring(startingPword + a, a + 1));
            }
        }
    }
}


    /* to assign the things binary and stuff/the conversions:
    do{
    System.out.println(word.substring(0,1).toBinaryString());
    System.out.println(word.substring(1,2).toOctalString());
    System.out.println(word.substring(2,3).toDecimal());
    System.out.println(word.substring(3,4).toHexString());
    System.out.println(word.substring(4,5));

    ...
    }while (word.substring();!=startingPword-1, startingPword); //the starting letter
     */
