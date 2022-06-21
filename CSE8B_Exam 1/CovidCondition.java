///////////////////////////////////////////////////////////////////////////////
// Main Class File:    CovidConditionTester.java
// File:               CovidCondition.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Sophia Yermolenko
// Email:              syermolenko@ucsd.edu
// Instructor's Name:  Miranda, Gregory Joseph
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * A class to represent the current condition of a State with respect to COVID.
 *
 * Bugs: None known
 *
 * @author Sophia Yermolenko
 */
public class CovidCondition {
    // DO NOT CHANGE THE CODE FOR ANY OF THESE VARIABLES.
    private String stateName; // The name of the US State.
    private int avgCases; // The number of average cases per day (in thousands).

    /**
     * Constructor to initialize the CovidCondition of a state.
     * DO NOT MODIFY CONSTRUCTOR DECLARATION.
     *
     * @param stateName the name of the state.
     * @param avgCases the average amount of cases per day (in thousands).
     */
    public CovidCondition(String stateName, int avgCases)
    {
        this.stateName = stateName;
        this.avgCases = avgCases;
    }

    /**
     * Report the details of this object as a String.
     *
     * @return a string with the state name
     *   and the average number of cases.
     */
    public String getDetails()
    {
        return (stateName + " currently has a daily average of " + avgCases + " thousand cases");
    }

    /**
     * Update the average number of cases.
     *
     * @param numOfCases - number of cases to be updated.
     *
     */
    public void updateAvgCases(int numOfCases)
    {
        avgCases = numOfCases;
    }

    /**
     * Check which tier the state belongs to.
     * There are 4 tiers: Yellow, Orange, Red, and Purple
     *
     * @return the current tier for the state
     */
    public String checkTier()
    {
        if (avgCases < 10) {
            return "Yellow";
        }
        else if (avgCases >= 10 && avgCases <= 50) {
            return "Orange";
        }
        else if (avgCases >= 51 && avgCases <= 100) {
            return "Red";
        }
        else {
            return "Purple";
        }
    }
}