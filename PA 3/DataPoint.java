///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Programming Assignment 3
// Files:              DataPoint.java, CovidCalculator.java, PA3Library.java,
//                     PA3Tester.java
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
 * A class to represent a data points in the COVID-19 pandemic.
 *
 * Bugs: None
 *
 * @author Sophia Yermolenko
 */
public class DataPoint {
    // The number and races represented in this data point.  DO NOT CHANGE.
    public int numRaces = 8;
    private String[] races = {"White", "Black", "LatinX", "Asian", "AIAN",
                              "NHPI", "Multiracial", "Other"};
    private String date;       //The date in the form of year month day (e.g. January 13, 2021 will be formatted as 20210113)
    private String state;      //The state abbreviation
    private int totalCases;    //Total number of cases reported that day 
    private int[] casesByRace; //The number of cases per race on a given day


     /**
     * Constructor: used to initialize all the member variables listed above.
     *
     * @param dateIn date in the form of year month day
     * @param stateIn state abbreviation
     * @param totalCasesIn total number of cases reported that day
     * @param casesByRaceIn number of cases per race on a given day
     * 
     */
    public DataPoint(String dateIn, String stateIn, int totalCasesIn,
                     int[] casesByRaceIn)
    {
        this.date = dateIn;
        this.state = stateIn;
        this.totalCases = totalCasesIn;
        this.casesByRace = casesByRaceIn;
     }

     /**
     * Return the date in the form of year month day.
     *
     * @return date in the form of year month day
     */
    public String getDate() {
        
        return this.date;
    }

    /**
     * Return the state abbreviation.
     *
     * @return the state abbreviation
     */
    public String getState() {
        
        return this.state;
    }

    /**
     * Return the number of cases per race on a given day.
     *
     * @return the number of cases per race on a given day
     */
    public int getCasesByRace(int raceIndex) {
        
        return this.casesByRace[raceIndex];
    }

    /**
     * Return the total number of cases reported that day.
     *
     * @return the total number of cases reported that day
     */
    public int getTotalCases() {
        
        return this.totalCases;
    }

    /**
    * Return the race name associated with the given index in this data point.
    * Preconditions: index is between 0 (inclusive) and numRaces (8) (exclusive)
    *
    * DO NOT CHANGE.
    *
    * @param index The index of the race.
    * @return The name of the race (e.g. "White" or "LatinX")
    */
    public String getRaceName(int index)
    {
        return this.races[index];
    }
}
