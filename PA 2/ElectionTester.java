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

/**
 * A class to run a mock election.
 *
 * Bugs: None
 *
 * @author Sophia Yermolenko
 */
import java.util.Scanner;

public class ElectionTester {
    /**
     * Execution point of testing code for the Candidate and Election class.
     */
    public static void main(String[] args) {

        Candidate first = new Candidate("Heather Sanchez", "Sixth party");
        Candidate second = new Candidate("Sandra Hui","Cool party");

        //First candidate information
        System.out.println(first.getName());
        System.out.println(first.getParty());
        System.out.println(first.getVotes());

        System.out.println();

        //Second candidate information
        System.out.println(second.getName());
        System.out.println(second.getParty());
        System.out.println(second.getVotes());
    
        //Reset party name for first candidate and increment 2 times
        first.setParty("Garbage");
        first.incrementVotes();
        first.incrementVotes();

        //Updated information about first candidate
        System.out.println(first.getName());
        System.out.println(first.getParty());
        System.out.println(first.getVotes());


        
        Scanner scan = new Scanner(System.in);

        Election election1 = new Election();
        Election election2 = new Election();

        election1.runElection(scan);
        System.out.println();
        election2.runElection(scan);

        scan.close();
        
    }
}
