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
 * A class to represent a WildPokemon.
 *
 * Bugs: None
 *
 * @author Sophia Yermolenko
 */
public class WildPokemon extends Pokemon {

    private int patience; //An integer representing the patience of a wild pokemon.
    private int speed; //An integer representing the move speed of a wild pokemon.
    private int timesEscapedFromBall; //After your ball hits a wild pokemon, there will be two outcomes.
                                      //1. The Pokemon is caught, or 2. The Pokemon escapes from the ball.

    /**
     * Constructor: used to initialize the member variables listed above
     *              and calls the parent class default constructor
     *
     * @param patience An integer representing the patience of a wild pokemon.
     * @param speed An integer representing the move speed of a wild pokemon.
     * @param timesEscapedFromBall After your ball hits a wild pokemon, there will be two outcomes.
     *                             1. The Pokemon is caught, or 2. The Pokemon escapes from the ball.
     * 
     */
    public WildPokemon () {
        super();
        this.patience = 100;
        this.speed = 0;
        this.timesEscapedFromBall = 0;
    }

    /**
     * Constructor: used to initialize the member variables listed above
     *              and calls the parent class constructor
     *
     * @param patience An integer representing the patience of a wild pokemon.
     * @param speed An integer representing the move speed of a wild pokemon.
     * @param timesEscapedFromBall After your ball hits a wild pokemon, there will be two outcomes.
     *                             1. The Pokemon is caught, or 2. The Pokemon escapes from the ball.
     * 
     */
    public WildPokemon (String pokemonName, String pokemonSound, String pokemonType, int patienceIn, int speedIn) {
       super(pokemonName, pokemonSound, pokemonType);
       this.patience = patienceIn;
       this.speed = speedIn;
       this.timesEscapedFromBall = 0;
    }

    /**
     * Return the patience of the WildPokemon.
     *
     * @return patience of the WildPokemon
     */
    public int getPatience() {
        return this.patience;
    }

    /**
     * Return the speed of the WildPokemon.
     *
     * @return speed of the WildPokemon
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Return the number of times escaped from the ball of the WildPokemon.
     *
     * @return the number of times escaped from the ball of the WildPokemon
     */
    public int getTimesEscapedFromBall() {
        return this.timesEscapedFromBall;
    }

    /**
     * 
     * This method sets the WildPokemon's patience value to newPatience.
     */
    public void setPatience(int newPatience) {
        this.patience = newPatience;
    }

    /**
     * 
     * This method sets the WildPokemon's speed to newSpeed.
     */
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    /**
     * 
     * This method increments the timesEscapedFromBall by one.
     */
    public void incrementTimeEscapedFromBall() {
        this.timesEscapedFromBall += 1;
    }
    
    /**
     * 
     * This method will print a message.
     * You encounter a wild [pokemonName]!
     * Then, use the parent class method speak() to make your pokemon speak. 
     *
     */
    public void appear() {
        System.out.println("You encounter a wild " + super.getName() + "!");
        super.speak();
    }

    /**
     * Return the number of times escaped from the ball of the WildPokemon.
     *
     * @return the number of times escaped from the ball of the WildPokemon
     */
    public boolean disappear() {
        if (this.getPatience() <= 0 || this.getTimesEscapedFromBall() > 3) {
            System.out.println(super.getName() + "disappears...");
            return true;
        }
        return false;
    }

    /**
     * This method should simply return true
     *
     * @return true
     */
    public boolean isCaught(Berry berry, Pokeball pokeball) {
        return true;
    }

    /**
     * Returns the objects as String representation
     *
     * @return name of the Pal Pokemon, the type of the pokemon,
     * patience, speed, and timeEscapedFromBall values
     */
    @Override
    public String toString() {
        String outputString;

        outputString = super.getName() + ", WildPokemon" + "\n" + "type: " + super.getType() +
               "\n" + "patience: " + this.getPatience() + "\n" + "speed: " + this.getSpeed() +
               "\n" + "timeEscapedFromBall: " + this.getTimesEscapedFromBall() + "\n"; 
        return outputString;
    }
}
