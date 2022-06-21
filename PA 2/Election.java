///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Programming Assignment 2
// Files:              Candidate.java; Election.java; ElectionTester.java
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
// Online sources:   // Online sources:   
//                   https://www.delftstack.com/howto/java/java-how-to-close-
//                   scanner/#:~:text=English%20Maths%20Science-,Use%20the%20
//                   close()%20Method%20to%20Close%20Scanner%20in%20Java,which
//                   %20is%20not%20in%20use.
//                   I used this website to find out how to close a scanner.
//
//////////////////////////// 80 columns wide //////////////////////////////////
import java.util.Scanner;

/**
 * A class to represent a mock election.
 *
 * Bugs: None
 *
 * @author Sophia Yermolenko
 */
public class Election {
    
    private Candidate candidate1; // cadidate 1 (from Cadidate class)
    private Candidate candidate2; // candidate 2 (from Cadidate class)
    private Candidate candidate3; // candidate 3 (from Cadidate class)

    public int userInput; // user input from the scanner (as an int)
    public int winner;    // amount of votes cast for the winner (as an int)

    /**
     * Constructor: creates a Candidate object.  It assigns each member variable
     * to a new Candidate object.
     *
     */
    public Election() {

        this.candidate1 = new Candidate("Heather Sanchez", "Sixth party");
        this.candidate2 = new Candidate("Sandra Hui","Cool party");
        this.candidate3 = new Candidate("Jasper Jones","Birthday party");
    }

    /**
     * This method, which takes a Scanner as an argument, runs the election
     * via the command line.
     */
    public void runElection(Scanner scan) {

        System.out.println("Welcome to the election.  We have 3 candidates:");

        System.out.println("1. " + candidate1.getName() + " from the " + candidate1.getParty());
        System.out.println("2. " + candidate2.getName() + " from the " + candidate2.getParty());
        System.out.println("3. " + candidate3.getName() + " from the " + candidate3.getParty());
        System.out.println();
        System.out.println("Enter the next vote (by candidate number).  Enter -1 if there are no more votes.");
        userInput = scan.nextInt();

        while (userInput != -1) {

            if (userInput == 1) {
                candidate1.incrementVotes();
            }
            else if (userInput == 2) {
                candidate2.incrementVotes();
            }
            else if (userInput == 3) {
                candidate3.incrementVotes();
            }
            System.out.println("Enter the next vote (by candidate number).  Enter -1 if there are no more votes.");
            userInput = scan.nextInt();
        }


        System.out.println("The vote count is as follows:");
        System.out.println(candidate1.getName() + ": " + candidate1.getVotes());
        System.out.println(candidate2.getName() + ": " + candidate2.getVotes());
        System.out.println(candidate3.getName() + ": " + candidate3.getVotes());
        
        winner = Math.max(candidate1.getVotes(), candidate2.getVotes());
        winner = Math.max(winner, candidate3.getVotes());

        if ((candidate1.getVotes() == candidate2.getVotes()) && (candidate1.getVotes() >= winner)) {
            System.out.println("It's a tie!");
        }
        else if (candidate1.getVotes() == candidate3.getVotes() && (candidate1.getVotes() >= winner)) {
            System.out.println("It's a tie!");
        }
        else if (candidate2.getVotes() == candidate3.getVotes() && (candidate2.getVotes() >= winner)) {
            System.out.println("It's a tie!");
        }
        else if (winner == candidate1.getVotes()) {
            System.out.println("The winner is " + candidate1.getName() + "!");
        }
        else if (winner == candidate2.getVotes()) {
            System.out.println("The winner is " + candidate2.getName() + "!");
        }
        else if (winner == candidate3.getVotes()) {
            System.out.println("The winner is " + candidate3.getName() + "!");
        }
    }
}
