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
 * A class to represents a pokemon you caught.
 *
 * Bugs: None
 *
 * @author Sophia Yermolenko
 */
public class PalPokemon extends Pokemon {

    private String pokeballName; // This field represents the name of the ball
                                 // that caught the pokemon.

    /**
     * Constructor: used to initialize the member variables listed above
     *              and calls the parent class default constructor
     *
     * @param pokeballName This field represents the name of the ball
     *                     that caught the pokemon.
     */
    public PalPokemon(){
        super();
        this.pokeballName = "undefined";
    }

    /**
     * Constructor: used to initialize the member variables listed above
     *              and calls the parent class default constructor
     *
     * @param pokeballName This field represents the name of the ball
     *                     that caught the pokemon.
     * 
     */
    public PalPokemon(String pokemonName, String pokemonSound, String pokemonType, String pokeballName) {
        
        super(pokemonName, pokemonSound, pokemonType);
        this.pokeballName = pokeballName;

    }

    /**
     * Return the name of the Pokeball.
     *
     * @return name of Pokeball
     */
    public String getPokeballName() {
        return this.pokeballName;
    }

    /**
     * Void method that will print this Pokeball's information. 
     * Then, it will use the parent class method speak() to make pokemon speak.
     *
     */
    public void comesOutFromBall() {
        
        System.out.println(super.getName() + " in " + this.getPokeballName() + ", " + super.getType() + " type pokemon.");
        super.speak();

    }

    /**
     * Returns the objects as String representation
     *
     * @return name of the Pal Pokemon, pokeball name,
     * and the type of the pokemon
     */
    @Override
    public String toString() {
        String outputString;

        outputString = super.getName() + ", PalPokemon" + "\n" + "pokeballName: " + this.getPokeballName() + "\n" +
            "type: " + super.getType() + "\n"; 
        return outputString;
    }
    
}
