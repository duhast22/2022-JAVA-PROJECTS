///////////////////////////////////////////////////////////////////////////////
// Main Class File:    PA3Tester.java
// File:               PA3Library.java
// Quarter:            CSE 8B Winter 2021
//
// Author:             Sachin Deshpande
//
//  DO NOT MODIFY ANY METHODS IN THIS FILE
//////////////////////////// 80 columns wide //////////////////////////////////

import java.util.Scanner;
import java.io.*;

/**
 * Read data from a CSV file into an array of DataPoints.
 * This library is to be used only in PA3 of CSE8B in Winter 2021.
 * You may use these methods, but you should not have to add any calls
 * to any methods in this library unless you want to use a different
 * dataset.  Calls to these library methods are already provided in the starter
 * code.
 *
 * Do not modify any methods in this class.
 * If you would like to do the star point and read in the raw data,
 * you may add additional methods to this class.
 *
 * Bugs: None known
 *
 * @author Sachin Deshpande
 */
class PA3Library {

    /**
    * Count the number of lines in the given file.
    *
    * @param filename The name of the file
    * @return The number of lines in filename
    */
    public int numFileLines(String filename){
        int fileLines = 0;
        // count file lines
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            while (reader.readLine() != null){
                fileLines++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("File not found.");
        }
        return fileLines;
    }

    /**
     * Read the contents of the file datasetName into an array of DataPoints
     *
     * Precondition: datasetName is a csv file in the format expected by
     *  CSE8B Winter 2021 PA3.
     *
     * @param datasetName A CSV file with the following fields:
     *   Date, State, Cases_Total, Cases_White, Cases_Black, Cases_LatinX,
     *   Cases_Asian, Cases_AIAN, Cases_NHPI, Cases_Multiracial, Cases_Other
     *
     * @return An array of DataPoint objects containing all of the data
     *  from the given file.
     */
    public DataPoint[] readFile(String datasetName) {
        File data = new File(datasetName);

        // find number of lines in file
        int numCSVRows = numFileLines(datasetName) - 1;
        DataPoint [] points = new DataPoint[numCSVRows];

        // read in CSV file
        try {
            Scanner dataScanner = new Scanner(data);
            dataScanner.nextLine(); // skip header

            // put all CSV rows in DataPoint array
            int DataPointIndex = 0;
            // create DataPoint object, add it to the array,
            // and increment the counter for the next iteration
            while(dataScanner.hasNextLine()){
                String line = dataScanner.nextLine();
                points[DataPointIndex] = parseLine(line);
                DataPointIndex++;
            }
            dataScanner.close();
        } catch (Exception e) {
            System.out.println("File not found.");
        }
        return points;
    }

    /**
    * Helper method to parse a line from the file.
    *
    * @param csvRow A single line from the file
    * @return A DataPoint object containing the data from the line.
    */
    private DataPoint parseLine(String csvRow)
    {
        String[] lineData = csvRow.split(",");
        String date = lineData[0];
        String state = lineData[1];
        int totalCases = Integer.parseInt(lineData[2]);

        int[] cByRace = new int[lineData.length - 3];
        int count = 0;
        for (int idx = 3; idx < lineData.length; idx++){
          cByRace[count] = Integer.parseInt(lineData[idx]);
          count++;
        }

        // make and return the new DataPoint
        return new DataPoint(date, state, totalCases, cByRace);
    }
}
