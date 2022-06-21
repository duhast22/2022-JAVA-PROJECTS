///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Programming Assignment 8
// Files:              RecursionWarmup.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Sophia Yermolenko
// Email:              syermolenko@ucsd.edu
// Instructor's Name:  Miranda, Gregory Joseph
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
//                  CHECK ASSIGNMENT PAGE TO see IF PAIR-PROGRAMMING IS ALLOWED
//                  If pair programming is allowed:
//                  1. Read PAIR-PROGRAMMING policy
//                  2. Choose a partner wisely
//                  3. Complete this section for each program file
//
// Pair Partner:        (name of your pair programming partner)
// Email:               (email address of your programming partner)
// Instructors's Name:  (name of your partner's instructor)
// Lab Section:         (your partner's lab section number)
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   must fully acknowledge and credit those sources of help.
//                   Instructors and TAs do not have to be credited here,
//                   but roommates, relatives, strangers, etc do.
//
// Persons:          Identify persons by name, relationship to you, and email.
//                   Describe in detail the the ideas and help they provided.
//
// Online sources:   Avoid web searches to solve your problems, but if you do
//                   search, be sure to include Web URLs and description of
//                   of any information you find.
//////////////////////////// 80 columns wide //////////////////////////////////
import java.util.*;
/**
 * A class to represent recursion methods.
 *
 * Bugs: None
 *
 * @author Sophia Yermolenko
 */
public class RecursionWarmup {

    public static String binaryString(int n) {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") +s;
            n = n / 2;
        }
        return s;
    }

    public static boolean isSubSetSum(ArrayList<Integer> set, int targetNumber) {

        ArrayList<Integer> updatedList = new ArrayList<Integer>();

        if (targetNumber == 0) {
            return true;
        }

        if (targetNumber < 0) {
            return false;
        }
        if (set.size() == 0 && targetNumber != 0) {
            return false;
        }

        ArrayList<Integer> newSet = new ArrayList<>(set);
        newSet.remove(0);

        updatedList.add(set.get(0));

        if (isSubSetSum(newSet, targetNumber - set.get(0))) {
            return true;
        }

        updatedList.remove(updatedList.size()-1);
        if (isSubSetSum(newSet,targetNumber)) {
            return true;
        }

        return false;

    }

    public static void main (String[] args) {

        System.out.println("Testing binaryString(6): ");
        System.out.println(binaryString(6));
        System.out.println("Answer should be '110'");

        System.out.println("Testing binaryString(12): ");
        System.out.println(binaryString(12));
        System.out.println("Answer should be '1110'");

        System.out.println("Testing binaryString(17): ");
        System.out.println(binaryString(17));
        System.out.println("Answer should be '10001'");

        ArrayList<Integer> set = new ArrayList<Integer>();
        set.add(3);
        set.add(7);
        set.add(1);
        set.add(8);
        set.add(-3);
        System.out.println(isSubSetSum(set, 4));

        ArrayList<Integer> otherSet = new ArrayList<Integer>();
        otherSet.add(3);
        otherSet.add(7);
        otherSet.add(1);
        otherSet.add(8);
        otherSet.add(-3);
        System.out.println(isSubSetSum(otherSet, 2));
    }

}