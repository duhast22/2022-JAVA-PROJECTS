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
 * A class to represent a Berry.
 *
 * Bugs: None
 *
 * @author Sophia Yermolenko
 */
public class Berry extends Item {
    
    private int patienceIncrement; // This field will also help the catch
                                   // rate.
                                   // Higher patienceIncrement will increase
                                   // catch rate more.

    private int speedDecrement;    // This field will help the catch rate from
                                   // another perspective. Higher
                                   // speedDecrement will decrease the 
                                   // moving speed of a wild Pokemon to make
                                   // easier for a Pokeball to hit.

    /**
     * Constructor: used to initialize the member variables listed above
     *              and calls the parent class default constructor
     *
     * @param patienceIncrement This field will also help the catch rate. Higher 
     *                          patienceIncrement will increase the carch rate more.
     * @param speedDecrement This field will help the catch rate from another perspective. Higher 
     *                       Higher speedDecrement will decrease the moving speed of a 
     *                       wild Pokemon to make easier for a Pokeball to hit.
     * 
     */
    public Berry () {
        super();
        this.patienceIncrement = 0;
        this.speedDecrement = 0;
    }

    /**
     * Constructor: used to initialize the member variables listed above
     *              and calls the parent class constructor
     *
     * @param patienceIncrement This field will also help the catch rate. Higher 
     *                          patienceIncrement will increase the carch rate more.
     * @param speedDecrement This field will help the catch rate from another perspective. Higher 
     *                       Higher speedDecrement will decrease the moving speed of a 
     *                       wild Pokemon to make easier for a Pokeball to hit.
     * 
     */
    public Berry (String berryName, int patienceInc, int speedDec) {
        super(berryName);
        this.patienceIncrement = patienceInc;
        this.speedDecrement = speedDec;

    }

    /**
     * Return the patienceIncrement.
     *
     * @return patienceIncrement
     */
    public int getPatienceIncrement() {
        return this.patienceIncrement;
    }

    /**
     * Return the speedDecrement.
     *
     * @return speedDecrement
     */
    public int getSpeedDecrement() {
        return this.speedDecrement;
    }

    /**
     * Returns the objects as String representation
     *
     * @return name, patienceIncrement, and speedDecrementof a Berry
     */
    @Override
    public String toString() {
        String outputString;

        outputString = super.getName() + "\n" + "patienceIncrement: " + this.getPatienceIncrement() + "\n" +
            "speedDecrement: " + this.getSpeedDecrement() + "\n"; 
        return outputString;
    }
    
}
