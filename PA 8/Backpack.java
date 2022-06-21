///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Programming Assignment 8
// Files:              Assignment8.java, Backpack.java
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

import java.util.ArrayList;

/**
 * This is Backpack class that you can add items which are berries and
 * pokeballs. You can display your backpack with display() method
 *
 * Bugs: None known
 * @author : Sophia Yermolenko
 *
 */

public class Backpack {

    // ArrayList for items (berries, pokeballs)
    private ArrayList<Item> myItems;

    /**
     * Creates a resizable-array ArrayLists of Items
     * 
     */
    public Backpack() {

        this.myItems = new ArrayList<>();

    }

    /**
     * Adds the item to myItems
     * 
     */
    public void add(Item item) {
        this.myItems.add(item);
    }

    /**
     * Displays the elements in the myItems ArrayList
     * 
     */
    public void display() {
        System.out.println("Items in the backpack: ");

        if (this.myItems.isEmpty()) {
            System.out.print("None");
        }
        else {
            for (int i=0; i < this.myItems.size(); i++) {
                System.out.println(this.myItems.get(i).toString());
                System.out.println();
            }
        }
    }
}
