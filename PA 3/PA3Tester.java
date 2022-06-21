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

import java.util.Scanner;
import java.io.File;

/**
 * PA3Tester class tests the CovidCalculator
 *
 * Bugs: None known
 *
 * @author Sophia Yermolenko
 */
public class PA3Tester {

    /**
    * Method that tests the DataPoint class.  It creates two fake points
    * and then prints out the expected values and actual values stored in each.
    *
    * Takes no parameters and returns nothing.  Point values are hard-coded.
    *
    */
    private static void testDataPoints()
    {
        System.out.println("***Running Data Point tests***");
        System.out.println("");

        // Create a made up data point for testing
        int[] testRaceData1 = {20, 3000, 463, 28, 900, 100, 400, 100};
        String testDate1 = "20210113";
        String testState1 =  "CA";
        int testTotalCases1 = 5011;
        DataPoint test1 = new DataPoint(testDate1, testState1,
                                        testTotalCases1, testRaceData1);

        // Run tests on the first data PointTester
        System.out.println("Testing DataPoint 1");
        System.out.println("Expected Date: " + testDate1);
        System.out.println("Actual Date: " + test1.getDate());
        System.out.println("");

        System.out.println("Expected State: " + testState1);
        System.out.println("Actual State: " + test1.getState());
        System.out.println("");

        System.out.println("Expected Total Cases: " + testTotalCases1);
        System.out.println("Actual Total Cases: " + test1.getTotalCases());
        System.out.println("");

        System.out.println("Expected Cases by Race: " +
        "[20, 3000, 463, 28, 900, 100, 400, 100]");
        System.out.print("Actual Cases by Race: [");
        for (int index = 0; index < test1.numRaces; index++) {
            System.out.print(test1.getCasesByRace(index) + ", ");
        }
        System.out.println("]");
        System.out.println("");

        // Create a made up data point for testing
        int[] testRaceData2 = {49, 329, 555, 100000, 99, 765, 34, 4, 9, 2};
        String testDate2 = "20220122";
        String testState2 =  "NY";
        int testTotalCases2 = 2222222;
        DataPoint test2 = new DataPoint(testDate2, testState2,
                                        testTotalCases2, testRaceData2);

        // Run tests on the second data PointTester
        System.out.println("Testing DataPoint 2");
        System.out.println("Expected Date: " + testDate2);
        System.out.println("Actual Date: " + test2.getDate());
        System.out.println("");

        System.out.println("Expected State: " + testState2);
        System.out.println("Actual State: " + test2.getState());
        System.out.println("");

        System.out.println("Expected Total Cases: " + testTotalCases2);
        System.out.println("Actual Total Cases: " + test2.getTotalCases());
        System.out.println("");

        System.out.println("Expected Cases by Race: " +
        "[49, 329, 555, 100000, 99, 765, 34, 4]");
        System.out.print("Actual Cases by Race: [");
        for (int index = 0; index < test2.numRaces; index++) {
            System.out.print(test2.getCasesByRace(index) + ", ");
        }
        System.out.println("]");
        System.out.println("");

    }

    /**
    * Method that tests the CovidCalculator class.  It takes an array of
    * all available DataPoints from the file "COVID_19_Data.CSV".
    * It then creates two smaller arrays using a subset of those points and
    * uses those smaller arrays to test the methods in CovidCalculator.
    *
    * Preconditions: allPoints contains the data from COVID_19_Data.CSV.
    *
    */
    private static void testCovidCalculator(DataPoint[] allPoints)
    {
        System.out.println("");
        System.out.println("*** First CovidCalculator Tests ***");
        DataPoint[] testSubset1 = new DataPoint[5];
        // Copy 5 points into the testSubset1 array.
        // Choose points such that we get two states that are repeated.
        // Points 0, 6, and 13 are from CA, and 1 and 7 are from CO
        testSubset1[0] = allPoints[0];
        testSubset1[1] = allPoints[1];
        testSubset1[2] = allPoints[6];
        testSubset1[3] = allPoints[7];
        testSubset1[4] = allPoints[13];

        CovidCalculator ccTest1 = new CovidCalculator(testSubset1);

        // Test each method.  We have hand-calculated the expected values.
        System.out.println("");
        System.out.println("First test set:");

        // Tests of findAverageCases
        // Test where the average is not an integer
        System.out.println("Average Cases on 20210113: ");
        System.out.println("\tExpected: 1,573,906.5");
        System.out.println("\tActual: " + ccTest1.findAverageCases("20210113"));
        System.out.println("");

        // Test a date that is not in the subset
        System.out.println("Average Cases on 20201215: ");
        System.out.println("\tExpected: 0.0");
        System.out.println("\tActual: " + ccTest1.findAverageCases("20201215"));
        System.out.println("");
        

        // Tests of findRaceWithHighestCases
        System.out.println("Race in CA with highest cases on 20210110:");
        System.out.println("\tExpected: LatinX");
        System.out.println("\tActual: " +
                            ccTest1.findRaceWithHighestCases("20210110", "CA"));

        System.out.println("Race in CO with highest cases on 20210110:");
                            System.out.println("\tExpected: White");
                            System.out.println("\tActual: " +
                            ccTest1.findRaceWithHighestCases("20210110", "CO"));

        // Test of myStat
        System.out.println("State with fewest cases on 20210113:");
        System.out.println("\tExpected: CO");
        System.out.println("\tActual: " +
                            ccTest1.findStateWithTheFewestCases("20210113"));
                            
                            
        System.out.println("State with fewest cases on 20210106:");
        System.out.println("\tExpected: CO");
        System.out.println("\tActual: " +
                            ccTest1.findStateWithTheFewestCases("20210106"));



        System.out.println("");
        System.out.println("*** Second CovidCalculator Tests ***");
        DataPoint[] testSubset2 = new DataPoint[5];
        // Copy 5 points into the testSubset1 array.
        // Choose points such that we get two states that are repeated.
        // Points 3, 9, and 15 are from NH, and 5 and 11 are from WA
        testSubset2[0] = allPoints[3];
        testSubset2[1] = allPoints[5];
        testSubset2[2] = allPoints[6];
        testSubset2[3] = allPoints[11];
        testSubset2[4] = allPoints[15];

        CovidCalculator ccTest2 = new CovidCalculator(testSubset2);

        // Test each method.  We have hand-calculated the expected values.
        System.out.println("");
        System.out.println("Second test set:");

        // Tests of findAverageCases
        // Test where the average is not an integer
        System.out.println("Average Cases on 20210113: ");
        System.out.println("\tExpected: 167,663.5");
        System.out.println("\tActual: " + ccTest2.findAverageCases("20210113"));
        System.out.println("");

        // Test a date that is not in the subset
        System.out.println("Average Cases on 20210104: ");
        System.out.println("\tExpected: 0.0");
        System.out.println("\tActual: " + ccTest2.findAverageCases("20210104"));
        System.out.println("");
        

        // Tests of findRaceWithHighestCases
        System.out.println("Race in WA with highest cases on 20210113:");
        System.out.println("\tExpected: White");
        System.out.println("\tActual: " +
                            ccTest2.findRaceWithHighestCases("20210113", "WA"));

        System.out.println("Race in NH with highest cases on 20210106:");
                            System.out.println("\tExpected: White");
                            System.out.println("\tActual: " +
                            ccTest2.findRaceWithHighestCases("20210106", "NH"));

        // Test of myStat
        System.out.println("State with fewest cases on 20210113:");
        System.out.println("\tExpected: NH");
        System.out.println("\tActual: " +
                            ccTest2.findStateWithTheFewestCases("20210113"));
                            
                            
        System.out.println("State with fewest cases on 20210110:");
        System.out.println("\tExpected: WA");
        System.out.println("\tActual: " +
                            ccTest2.findStateWithTheFewestCases("20210110"));
    }


    /**
    * Run the tests of DataPoint and CovidCalculator.
    * Then run each of the CovidCalculator methods on the full data
    * from COVID_19_Data.CSV.
    *
    * Preconditions: The file COVID_19_Data.CSV contains all of the data
    *   and is in the directory where this code is run.
    *
    * @param args Command line arguments (not used)
    */
    public static void main(String[] args) {
        // Run the data point tester
        testDataPoints();

        // Read in the data from the file
        int numCSVRows = 310;
        PA3Library lib = new PA3Library();
        DataPoint[] points = lib.readFile("COVID_19_Data.CSV");

        // Run the Covid Calculator tester
        testCovidCalculator(points);

        // Finally, read the data from the file and compute the statistics for
        // the full file.  You may modify the code below to explore the data.
        CovidCalculator calculator = new CovidCalculator(points);

        System.out.print("The average number of cases across all states ");
        System.out.print("on 20210106 is ");
        System.out.println(calculator.findAverageCases("20210106"));

        System.out.print("The race with the highest number of cases in CO ");
        System.out.print(" on 20200524 was ");
        System.out.println(calculator.findRaceWithHighestCases("20200524", "CO"));


        System.out.print("The state with the fewest cases");
        System.out.print(" on 20200524 was ");
        System.out.println(calculator.findStateWithTheFewestCases("20200524"));



    }
}