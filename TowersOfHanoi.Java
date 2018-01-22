package com.company;

/**
 * Created by Veronica Lang on 1/21/2018.
 * you know i never really figured out the pattern
 * reference: http://www.javawithus.com/programs/towers-of-hanoi
 * constructor:
 accepts total # of disks
 solve method
 move the tower
 recursive method is going to show up
 //Move the specified number of disks from one tower to another by moving a subtower of n-1 disks out of the way, moving one disk, then moving the subtower back. Base case of 1 disk
 moveOneDisk
 SOP instructions on how to move.

 Base Case - When n = 1
 Move the disc from start pole to end pole

 Recursive Case - When n > 1
 Step 1: Move (n-1) discs from start pole to auxiliary(middle) pole.
 Step 2: Move the last disc from start pole to end pole.
 Step 3: Move the (n-1) discs from auxiliary(middle) pole to end pole.
 Steps 1 and 3 are recursive invocations of the same procedure.

 */
public class TowersOfHanoi {
    public static int n;
    public static int x;
    public static int x1;

    public int TowersOfHanoi(int numOfDisks) { //call object from here
        numOfDisks = n;
        return numOfDisks;
    }

    public String solution;
    public String solveMethod(int n) {
        if (n == 1) {
            return("Move disc from Tower 1 to Tower 3.\n That's it!!"); //start + " -> " + end
        } else {
            solveMethod(n - 1); //n - 1, start, end, auxiliary
            x = n - 1;
            x1 = n - 2;
            return("Move " + x + "from Tower 1 to Tower 3\n Then move" + x1 + "to Tower two, then one and then the third");
        }
    }

 /*   public String solvemethod(int numOfDisks) {
        if (n == 1) {
            return ("Move disc to third pole.\n That's it!!");
        } else { //this part will have the recursion
            return n - 1 + solvemethod(n - 1);
        }
        */
    }
