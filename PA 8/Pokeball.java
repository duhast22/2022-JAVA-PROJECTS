///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Programming Assignment 8
// Files:              Berry.java, Backpack.java, Item.java, PA8Tester.java, 
//                     PalPokemon.java, Pokeball.java, Pokedex.java,
//                     Pokemon.java, WildPokemon.java
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

/**
 * A class to represent a Pokeball.
 *
 * Bugs: None
 *
 * @author Sophia Yermolenko
 */
public class Pokeball extends Item {
    
    private int performance; // This field will do with the catch rate.
                             // Higher performance will increase the catch
                             // rate more.

    /**
     * Constructor: used to initialize the member variables listed above
     *              and calls the parent class default constructor
     *
     * @param performance This field will do with the catch rate. Higher 
     *                    performance will increase the carch rate more.
     * 
     */
    public Pokeball() {

        super();
        this.performance = 0;

    }

    /**
     * Constructor: used to initialize the member variables listed above
     *              and calls the parent class constructor
     *
     * @param performance This field will do with the catch rate. Higher 
     *                    performance will increase the carch rate more.
     * 
     */
    public Pokeball(String pokeballName, int performanceIn) {
        super(pokeballName);
        this.performance = performanceIn;

    }

    /**
     * Return the catch rate.
     *
     * @return performance
     */
    public int getPerformance() {

        return this.performance;

    }

    /**
     * Returns the objects as String representation
     *
     * @return name and performance of a Pokeball
     */
    @Override
    public String toString() {
        String outputString;

        outputString = super.getName() + "\n" + "performance: " + this.getPerformance() + "\n";
        
        return outputString;
    }


}