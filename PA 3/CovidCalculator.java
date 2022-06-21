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
 * The CovidCalculator class calculates different statistics about the dataset.
 *
 * Bugs: None
 *
 * @author Sophia Yermolenko
 */
class CovidCalculator {
    private DataPoint[] points;  // The data points to use in the calculations
    /**
     *  This constructor will initialize the member variable (the array of
     *  DataPoints) that statistics will be calculated for.
     *
     * @param DataPoint[] input 
     */
    public CovidCalculator(DataPoint[] input)
    {
        this.points = new DataPoint[input.length];

         for (int i = 0; i < input.length; i++) {
            this.points[i] = input[i];
            DataPoint currentPoint = this.points[i];
        }
    }

    
    /**
     * Return the average number of total cases/infections
     * (as a double) across all states on the specified date.
     *
     * @return average number of total cases/infections
     */
    public double findAverageCases(String currentDate) 
    {
        double totalAmountOfCases = 0.0;
        double totalNumberOfStates = 0.0;
        double average;

        for (int i = 0; i < points.length; ++i) {

            DataPoint currentPoint = this.points[i];

            if (currentDate.equals(currentPoint.getDate())) {

                totalAmountOfCases = totalAmountOfCases + currentPoint.getTotalCases();
                totalNumberOfStates += 1.0;
            }
        } 
        
        if (totalNumberOfStates == 0.0) {
            return 0.0;
        }
        else if (totalAmountOfCases == 0.0) {
            return 0.0;
        }
        average = totalAmountOfCases / totalNumberOfStates;

        return average;
    }


    
    /**
     * Return the String representing the name of the race that has the highest
     * number of infections on the given date in the given state.
     *
     * @return name of the race that has the highest number of infections
     * 
     */
    public String findRaceWithHighestCases(String date, String state)
    {
        int maxCases = -1; 
        String raceWithHighestCases = "";

        for (int index = 0; index < this.points.length; index++) {
            DataPoint currentPoint = this.points[index];
            if (date.equals(currentPoint.getDate()) && state.equals(currentPoint.getState())) {

                for (int index1 = 0; index1 < 8; index1++) {
                    if (currentPoint.getCasesByRace(index1) > maxCases){

                        maxCases = currentPoint.getCasesByRace(index1);
                        raceWithHighestCases = currentPoint.getRaceName(index1);

                    }
                }
            }
        }
        return raceWithHighestCases;
    }
    
    /**
     * The state with the fewest total cases in the data.
     *
     * @return name state with the fewest total cases in the data
     * 
     */
    public String findStateWithTheFewestCases(String date)
    {
        int minimumCases = 1000000000;
        String stateName = "";

        for (int index = 0; index < this.points.length; index++) {
            DataPoint currentPoint = this.points[index];

            if (date.equals(currentPoint.getDate()) && currentPoint.getTotalCases() < minimumCases) {
                minimumCases = currentPoint.getTotalCases();
                stateName = currentPoint.getState();
            }
        }
        return stateName;
    }
}

