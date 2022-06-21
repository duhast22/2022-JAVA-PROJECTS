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
 * A class to represent a candidate in an election.
 *
 * Bugs: None
 *
 * @author Sophia Yermolenko
 */
public class Candidate {

    private String name; // The candidate's name (as a String)
    private String party; // The candidate's party (as a String)
    private int voteCount; // The candidate's vote count (as an int)

    /**
     * Constructor: creates a Candidate object.
     *
     * @param candidateName the candidate's name
     * @param candidateParty the candidate's party
     */
    public Candidate(String candidateName, String candidateParty) {
        
        this.name = candidateName;
        this.party = candidateParty;
        this.voteCount = 0;

    }

    /**
     * Return the name of candidate.
     *
     * @return the name of candidate
     */
    public String getName() {
        return this.name;
    }

    /**
     * Return the party of candidate.
     *
     * @return the party of candidate
     */
    public String getParty() {
        return this.party;
    }

    /**
     * Return the votes for a given candidate.
     *
     * @return the votes for a given candidate
     */
    public int getVotes() {
        return this.voteCount;
    }

    /**
     * Sets a candidate to a new party.
     */
    public void setParty(String newParty) {
        party = newParty;
    }

    /**
     * Increments votes by one.
     */
    public void incrementVotes() {
        voteCount += 1;
    }
}
