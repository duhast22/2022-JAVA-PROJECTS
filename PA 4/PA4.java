///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              Programming Assignment 4
// Files:              MazePoint.java
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

import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * PA4 focuses on reading files and solving mazes.
 *
 * Bugs: None
 *
 * @author Sophia Yermolenko
 */
public class PA4 {

    /**
    * This method will read the maze file and parse the maze to a
    * 2D array of MazePoint objects.
    *
    * @param (fileToRead) The input fileToRead is the filename of the maze to be read.
    * @return maze
    */
    public MazePoint[][] readMaze(String fileToRead) throws IOException
    {
        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;

        fileByteStream = new FileInputStream(fileToRead);
        inFS = new Scanner(fileByteStream);

        int row = inFS.nextInt();
        int col = inFS.nextInt();

        MazePoint[][] maze = new MazePoint[row][col];

        int i;
        int j;


        while (inFS.hasNext()) {
           for (i = 0; i < maze.length; i++) {
            
                for (j = 0; j < maze[i].length; j++) {
                    String line = inFS.next();


                    if (line.equals("X")) {
                        maze[i][j] = new MazePoint(true);
                    }
                    else {
                        maze[i][j] = new MazePoint(false);
                    }
                }
            }

           
        }
        fileByteStream.close();
        inFS.close();
        return maze;
    }

    /**
    * This method solves a maze
    *
    * @param maze (2D array)
    */
    public void escapeFromMaze(MazePoint [][] maze){
        int row = 0;
        int col = 0;

        int numberOfRows = maze.length;
        int numberOfCols = maze[row].length;

        maze[0][0].setToPath();

        while (row != (numberOfRows - 1) || col != (numberOfCols - 1)) {

            maze[row][col].setToPath();

            if ((row > (numberOfRows - 1) || col > (numberOfCols - 1))) {
                System.out.println("Invalid maze!");
                break;
            }
            
            if (row < (numberOfRows - 1) && col < (numberOfCols - 1) && maze[row + 1][col].isWall() && maze[row][col + 1].isWall()) {
                System.out.println("Invalid maze!");
                break;
            }

            else if (row < (numberOfRows - 1) && maze[row + 1][col].isWall()) {
                col += 1;
                continue;
            }

            else if (col < (numberOfCols - 1) && maze[row][col + 1].isWall()) {
                row += 1;
                continue;
            }

            else if (col < (numberOfCols - 1) && maze[row][col + 1].isEmpty()) {
                col += 1;
                continue;
            }

            else if (col < (numberOfCols - 1) && maze[row + 1][col].isEmpty()) {
                row += 1;
                continue;
            }

            else if (col == (numberOfCols - 1) && (row < (numberOfRows - 1))) {
                row += 1;
                continue;
            }

            else if (row == (numberOfRows - 1) && (col < (numberOfCols - 1))) {
                col += 1;
                continue;
            }

        
        }

        maze[row][col].setToPath();
    }

    /**
    * Print the maze as a 2D grid.  You should call this method from
    * testRead and testEscape, as well as from main.
    *
    * Precondition: The maze is not null.
    * Postcondition: The maze has been printed and is unmodified.
    *
    * @param maze The maze to be printed.
    */
    private void printMaze(MazePoint[][] maze)
    {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j].printSymbol();
                System.out.print(" ");
            }
            System.out.println("");
        }
    }


    /**
    * Compare two maze arrays.  Return true if they have .  You should call
    * this method from testRead and testEscape.
    *
    * Precondition: The mazes are not null and have the same size.
    * Postcondition: The mazes are not modified.
    *
    * @param maze1 the first maze to compare.
    * @param maze2 the second maze to compare.
    * @return true if the mazes contain all the same symbols and false otherwise
    */
    private boolean mazeMatch(MazePoint[][] maze1, MazePoint[][] maze2)
    {
        for (int r = 0; r < maze1.length; r++){
            for (int c = 0; c < maze1[r].length; c++) {

                if (!maze1[r][c].symbolMatch(maze2[r][c])) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
    * The function will print out the expected array (expected)
    * and the array returned by readMaze.
    *
    * @param (fileToRead) file name
    * @param (expected) 2D array of MazePoint objects
    * @return a boolean value - true if these two arrays are matched,
    * and false otherwise
    *
    */
    public boolean testRead(String fileToRead, MazePoint[][] expected) throws
                            IOException
    {   
        System.out.println("Expected maze:");
        printMaze(expected);

        System.out.println("Maze read from readMaze");

        MazePoint[][] maze = readMaze(fileToRead);
        printMaze(maze);

        if (!mazeMatch(maze, expected) ){
            
            System.out.println("The file maze and expected maze do not match!");
            return false;
        }
        return true;
    }

    /**
    * The function will print out the expected array (expected)
    * and the array returned by readMaze.
    *
    * @param (maze) 2D array of MazePoint objects
    * @param (expectedSolution) 2D array of MazePoint objects
    * @return a boolean value - true if these two arrays are matched,
    * and false otherwise
    */
    public boolean testEscape(MazePoint[][] maze,
                              MazePoint[][] expectedSolution)
    {
        this.escapeFromMaze(maze);
        
        System.out.println("Expected maze:");
        printMaze(expectedSolution);

        System.out.println("Test maze solution from readMaze");
        printMaze(maze);

        if (!mazeMatch(maze, expectedSolution)) {
            
            System.out.println("The file maze and expected maze do not match!");
            return false;
        }
        return true;
    }

    /**
    * Run unit tests.  You will add to this method.
    * Prints a message indicating whether all tests passed or failed.
    * The method will abort on the first failed test.
    * @return true if all unit tests pass.  false if at least one test fails.
    */
    public boolean unitTests() throws IOException {
        // Manually create the expected maze to match file input1
        MazePoint[][] expected = new MazePoint[3][3];
        expected[0][0] = new MazePoint(false);
        expected[0][1] = new MazePoint(false);
        expected[0][2] = new MazePoint(true);
        expected[1][0] = new MazePoint(true);
        expected[1][1] = new MazePoint(false);
        expected[1][2] = new MazePoint(false);
        expected[2][0] = new MazePoint(true);
        expected[2][1] = new MazePoint(true);
        expected[2][2] = new MazePoint(false);

        if (!this.testRead("input1", expected)) {
            System.out.println("Read test 1 failed.");
            return false;
        }
        else {
          System.out.println("Read test 1 passed!");
        }

        // Manually create the expected maze to match file input2
        MazePoint[][] expected2 = new MazePoint[4][8];
        expected2[0][0] = new MazePoint(false);
        expected2[0][1] = new MazePoint(true);
        expected2[0][2] = new MazePoint(true);
        expected2[0][3] = new MazePoint(false);
        expected2[0][4] = new MazePoint(true);
        expected2[0][5] = new MazePoint(true);
        expected2[0][6] = new MazePoint(true);
        expected2[0][7] = new MazePoint(true);                                  

        expected2[1][0] = new MazePoint(false);
        expected2[1][1] = new MazePoint(false);
        expected2[1][2] = new MazePoint(false);
        expected2[1][3] = new MazePoint(false);
        expected2[1][4] = new MazePoint(true);
        expected2[1][5] = new MazePoint(false);
        expected2[1][6] = new MazePoint(true);
        expected2[1][7] = new MazePoint(false); 

        expected2[2][0] = new MazePoint(true);
        expected2[2][1] = new MazePoint(true);
        expected2[2][2] = new MazePoint(true);
        expected2[2][3] = new MazePoint(false);
        expected2[2][4] = new MazePoint(true);
        expected2[2][5] = new MazePoint(true);
        expected2[2][6] = new MazePoint(true);
        expected2[2][7] = new MazePoint(false); 

        expected2[3][0] = new MazePoint(false);
        expected2[3][1] = new MazePoint(true);
        expected2[3][2] = new MazePoint(false);
        expected2[3][3] = new MazePoint(false);
        expected2[3][4] = new MazePoint(false);
        expected2[3][5] = new MazePoint(false);
        expected2[3][6] = new MazePoint(false);
        expected2[3][7] = new MazePoint(false); 

        if (!this.testRead("input2", expected2)) {
            System.out.println("Read test 2 failed.");
            return false;
        }
        else {
          System.out.println("Read test 2 passed!");
        }

        // Manually create the expected maze to match file input3
        MazePoint[][] expected3 = new MazePoint[5][3];
        expected3[0][0] = new MazePoint(false);
        expected3[0][1] = new MazePoint(false);
        expected3[0][2] = new MazePoint(true);                                

        expected3[1][0] = new MazePoint(true);
        expected3[1][1] = new MazePoint(false);
        expected3[1][2] = new MazePoint(false);

        expected3[2][0] = new MazePoint(true);
        expected3[2][1] = new MazePoint(false);
        expected3[2][2] = new MazePoint(false);

        expected3[3][0] = new MazePoint(true);
        expected3[3][1] = new MazePoint(true);
        expected3[3][2] = new MazePoint(false);

        expected3[4][0] = new MazePoint(true);
        expected3[4][1] = new MazePoint(true);
        expected3[4][2] = new MazePoint(false);

        if (!this.testRead("input3", expected3)) {
            System.out.println("Read test 3 failed.");
            return false;
        }
        else {
          System.out.println("Read test 3 passed!");
        }

        // Manually create the expected maze to match file input3
        MazePoint[][] expected4 = new MazePoint[4][4];
        expected4[0][0] = new MazePoint(false);
        expected4[0][1] = new MazePoint(true);
        expected4[0][2] = new MazePoint(false); 
        expected4[0][3] = new MazePoint(false);                               

        expected4[1][0] = new MazePoint(true);
        expected4[1][1] = new MazePoint(false);
        expected4[1][2] = new MazePoint(false);
        expected4[1][3] = new MazePoint(false);

        expected4[2][0] = new MazePoint(true);
        expected4[2][1] = new MazePoint(false);
        expected4[2][2] = new MazePoint(false);
        expected4[2][3] = new MazePoint(true);

        expected4[3][0] = new MazePoint(true);
        expected4[3][1] = new MazePoint(false);
        expected4[3][2] = new MazePoint(true);
        expected4[3][3] = new MazePoint(false);


        if (!this.testRead("input4", expected4)) {
            System.out.println("Read test 4 failed.");
            return false;
        }
        else {
          System.out.println("Read test 4 passed!");
        }




        // At this point readMaze is working, so we can use it.
        MazePoint[][] maze1 = this.readMaze("input1");

        // Modify the expected maze from above to have the path
        expected[0][0].setToPath();
        expected[0][1].setToPath();
        expected[1][1].setToPath();
        expected[1][2].setToPath();
        expected[2][2].setToPath();

        System.out.println("Expected solution:");
        printMaze(expected);

        System.out.println("Solution obtained from escapeFromMaze:");
        printMaze(maze1);

        if (!this.testEscape(maze1, expected)) {
            System.out.println("Escape test 1 failed.");
            return false;
        }
        else {
          System.out.println("Escape test 1 passed!");
        }

        // At this point readMaze is working, so we can use it.
        MazePoint[][] maze2 = this.readMaze("input2");

        // Modify the expected maze from above to have the path
        expected2[0][0].setToPath();
        expected2[1][0].setToPath();
        expected2[1][1].setToPath();
        expected2[1][2].setToPath();
        expected2[1][3].setToPath();
        expected2[2][3].setToPath();
        expected2[3][3].setToPath();
        expected2[3][4].setToPath();
        expected2[3][5].setToPath();
        expected2[3][6].setToPath();
        expected2[3][7].setToPath();

        System.out.println("Expected solution:");
        printMaze(expected2);

        System.out.println("Solution obtained from escapeFromMaze:");
        printMaze(maze2);

        if (!this.testEscape(maze2, expected2)) {
            System.out.println("Escape test 2 failed.");
            return false;
        }
        else {
          System.out.println("Escape test 2 passed!");
        }


        // At this point readMaze is working, so we can use it.
        MazePoint[][] maze3 = this.readMaze("input3");

        // Modify the expected maze from above to have the path
        expected3[0][0].setToPath();
        expected3[0][1].setToPath();
        expected3[1][1].setToPath();
        expected3[1][2].setToPath();
        expected3[2][2].setToPath();
        expected3[3][2].setToPath();
        expected3[4][2].setToPath();

        System.out.println("Expected solution:");
        printMaze(expected3);

        System.out.println("Solution obtained from escapeFromMaze:");
        printMaze(maze3);

        if (!this.testEscape(maze3, expected3)) {
            System.out.println("Escape test 3 failed.");
            return false;
        }
        else {
          System.out.println("Escape test 3 passed!");
        }


        // At this point readMaze is working, so we can use it.
        MazePoint[][] maze4 = this.readMaze("input4");

        // Modify the expected maze from above to have the path

        expected[0][0].setToPath();

        System.out.println("Expected solution:");
        printMaze(expected);

        System.out.println("Solution obtained from escapeFromMaze:");
        printMaze(maze4);

        if (!this.testEscape(maze4, expected)) {
            System.out.println("Escape test 4 failed.");
            return false;
        }
        else {
          System.out.println("Escape test 4 passed!");
        }

        return true;
    }


    /**
    * Main method runs the program
    *
    */
    public static void main(String[] args) throws IOException
    {
        PA4 solver = new PA4();

        // Perform unitTest first
        if(solver.unitTests()) {
            System.out.println("All unit tests passed.\n");
        } else {
            System.out.println("Failed test.\n");
            return;
        }

        Scanner newObj = new Scanner(System.in);

        System.out.println("Enter file to read:");

        String fileToRead = newObj.nextLine();

        while (!fileToRead.equals("end")) {

            MazePoint[][] maze = solver.readMaze(fileToRead);

            System.out.println("Maze read from file is:");
            solver.printMaze(maze);

            System.out.println("Solved maze:");
            solver.escapeFromMaze(maze);
            solver.printMaze(maze);

            System.out.println("Enter file to read:");
            fileToRead = newObj.nextLine();
        }
        newObj.close();
    }
}
