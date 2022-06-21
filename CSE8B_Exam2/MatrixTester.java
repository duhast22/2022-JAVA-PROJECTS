///////////////////////////////////////////////////////////////////////////////
// Title:              Matrix
// Files:              MatrixTester.java, Matrix.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Sophia Yermolenko
// Email:              syermolenko@ucsd.edu
// Instructor's Name:  Miranda, Gregory Joseph
//////////////////////////// 80 columns wide //////////////////////////////////

import java.io.IOException;
import java.util.*;

/**
 * A class to test the Matrix class.
 *
 * Bugs: None known
 *
 * @author Sophia Yermolenko
 */
public class MatrixTester {

    /**
     * Method that checks if two matrices are identical or not.
     *
     * Preconditions: matrix1 and matrix2 each contain an integer 2D array.
     *
     * @param matrix1 First matrix that will be compared with matrix2
     * @param matrix2 Second matrix that will be compared with matrix1
     *
     * @return A boolean value, true if the two matrices are identical, false
     *  otherwise.
     *
     * DO NOT MODIFY METHOD THIS METHOD.
     */
    private static boolean matrixMatch(int[][] matrix1, int[][] matrix2)
    {
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length))
            return false;
        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                if(!(matrix1[i][j] == matrix2[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Execution point of testing code for the Matrix class.
     *
     * DO NOT MODIFY METHOD DECLARATION.
     */
    public static void main(String[] args) throws IOException {
        int[][] input1 =    {{1, 5, 23, 4},
                            {6, 2, 85, 5},
                            {3, 76, 13, 6}};
        Matrix matrix1 = new Matrix(input1);
        int[][] transpose1 = {  {1, 6, 3},
                                {5, 2, 76},
                                {23, 85, 13},
                                {4, 5, 6}};

        String file1 = "input1";
        Matrix matrix2 = new Matrix(file1);
        int[][] transpose2 = { {1, 2, 5},
                                {7, 4, 3},
                                {3, 2, 4},
                                {6, 8, 9}};

        // Testing for simple assignment within constructor.
        // We do NOT want a shallow copy - we want a deep copy.
        // As such, if both matrices have the same reference, then this test fails.
        if (matrix1.getMyMatrix() == input1) {
            System.out.println("Test Failed! Shallow copy detected.");
        }

        // Testing `findTranspose()` for `matrix1`.
        // The transpose should be same as transpose1, if not, this test fails.
        if (!(matrixMatch(matrix1.findTranspose(), transpose1))) {
            System.out.println("Test Failed! `matrix1.findTranspose()` returns incorrect o/p.");
        }

        String fileString = "input3";
        Matrix matrix3 = new Matrix(fileString);

        int[][] array = matrix3.getMyMatrix();
        System.out.println("This is the original array");
        System.out.println(Arrays.deepToString(array));

        int[][] arrayTransposed = matrix3.findTransposeWrong();
        System.out.println("This is the transposed array");
        System.out.println(Arrays.deepToString(arrayTransposed));


        /*
        String fileString2 = "input2";
        Matrix matrix4 = new Matrix(fileString2);

        int[][] array2 = matrix4.getMyMatrix();
        System.out.print(Arrays.deepToString(array2));
        */

        // Testing `findTranspose()` for `matrix2`.
        // The transpose should be same as transpose2, if not, this test fails.
        if (!(matrixMatch(matrix2.findTranspose(), transpose2))) { 
            System.out.println("Test Failed! `matrix2.findTranspose()` returns incorrect o/p.");
        }

        // You should write more tests to ensure constructor functionality (and deep copy),
        // and to test `findTranspose()`.
        
    }
}