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
 * Tests written to check if other classes work as intended
 *
 * Bugs: None known
 *
 */
public class PA8Tester {
    public static void main (String[] args) {
        System.out.println("\n-------------------------------------------\n");

        /* PART 1 */

        Pokeball regularBall = new Pokeball("Regular Ball", 0);
        Pokeball greatBall = new Pokeball("Great Ball", 10);

        //First object test
        System.out.println("Testing Regular Ball...");
        System.out.println("Name: " + regularBall.getName());
        System.out.println("Performance: " + regularBall.getPerformance());

        //Second object test
        System.out.println("Testing Great Ball...");
        System.out.println("Name: " + greatBall.getName());
        System.out.println("Performance: " + greatBall.getPerformance());




        System.out.println("\n-------------------------------------------\n");
        
        /* PART 2 */

        Berry razzBerry = new Berry("Razz Berry", 10, 0);
        Berry nanapBerry = new Berry("Nanap Berry", 0, 10);

        //First object test
        System.out.println("Testing Razz Berry...");
        System.out.println("Name: " + razzBerry.getName());
        System.out.println("patienceIncrement: " + razzBerry.getPatienceIncrement());
        System.out.println("speedDecrement: " + razzBerry.getSpeedDecrement());

        //Second object test
        System.out.println("Testing Nanap Berry...");
        System.out.println("Name: " + nanapBerry.getName());
        System.out.println("patienceIncrement: " + nanapBerry.getPatienceIncrement());
        System.out.println("speedDecrement: " + nanapBerry.getSpeedDecrement());


        System.out.println("\n-------------------------------------------\n");

        /* PART 3 */

        PalPokemon pikachu = new PalPokemon("Pikachu", "pikapika", "electric", "Nest ball");
        PalPokemon squirtle = new PalPokemon("Squirtle", "squir", "water", "Level ball");

        //First object test
        System.out.println("Testing Pikachu...");
        System.out.println("Name: " + pikachu.getName());
        System.out.println("Sound: " + pikachu.getSound());
        System.out.println("Type: " + pikachu.getType());
        System.out.println("PokeBall Name: " + pikachu.getPokeballName());

        pikachu.comesOutFromBall();


        //Second object test
        System.out.println("Testing Squirtle...");
        System.out.println("Name: " + squirtle.getName());
        System.out.println("Sound: " + squirtle.getSound());
        System.out.println("Type: " + squirtle.getType());
        System.out.println("PokeBall Name: " + squirtle.getPokeballName());

        squirtle.comesOutFromBall();

        System.out.println("\n-------------------------------------------\n");

        /* PART 4 */

        WildPokemon bulbasaur = new WildPokemon("Bulbasaur", "bulb", "grass", 50, 5);
        WildPokemon charmander = new WildPokemon("Charmander", "char", "fire", 50, 20);

        //First object test
        System.out.println("Testing Bulbasaur...");
        System.out.println("Name: " + bulbasaur.getName());
        System.out.println("Sound: " + bulbasaur.getSound());
        System.out.println("Type: " + bulbasaur.getType());
        System.out.println("Patience: " + bulbasaur.getPatience());
        System.out.println("Speed: " + bulbasaur.getSpeed());
        System.out.println("Times escaped from ball: " + bulbasaur.getTimesEscapedFromBall());

        bulbasaur.appear();
        bulbasaur.disappear();


        //Second object test
        System.out.println("Testing Charmander...");
        System.out.println("Name: " + charmander.getName());
        System.out.println("Sound: " + charmander.getSound());
        System.out.println("Type: " + charmander.getType());
        System.out.println("Patience: " + charmander.getPatience());
        System.out.println("Speed: " + charmander.getSpeed());
        System.out.println("Times escaped from ball: " + charmander.getTimesEscapedFromBall());

        charmander.appear();
        charmander.disappear();



        System.out.println("\n-------------------------------------------\n");

        /* PART 5 */
        
        Backpack newBackpack = new Backpack();

        //Display empty backpack
        System.out.println("Displaying an empty backpack...");
        newBackpack.display();
        System.out.println();

        //Adding 2 pokeballs
        
        newBackpack.add(regularBall);
        newBackpack.add(greatBall);
        System.out.println("Displaying updated backpack...");
        newBackpack.display();
        System.out.println();

        //Adding 2 berries

        newBackpack.add(razzBerry);
        newBackpack.add(nanapBerry);
        System.out.println("Displaying second time updated backpack...");
        newBackpack.display();
        System.out.println();

        // TODO4: Create an display the empty pokedex

        Pokedex newPokedex = new Pokedex();

        //Display empty pokedex
        System.out.println("Displaying an empty pokedex...");
        newPokedex.display();
        System.out.println();

        //Adding 2 pal pokemons

        newPokedex.add(pikachu);
        newPokedex.add(squirtle);
        System.out.println("Displaying updated pokedex...");
        newPokedex.display();
        System.out.println();

        //Adding 2 wild pokemons

        newPokedex.add(bulbasaur);
        newPokedex.add(charmander);
        System.out.println("Displaying second time updated pokedex...");
        newPokedex.display();
        System.out.println();

    }
}
