///////////////////////////////////////////////////////////////////////////////
// Main Class File:    PointTester.java
// File:               Point.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             (YOUR NAME)
// Email:              (YOUR EMAIL ADDRESS)
// Instructor's Name:  (NAME OF YOUR INSTRUCTOR)
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * A class to test the Point class.
 *
 * Bugs: None known
 *
 * @author (YOUR NAME)
 */
public class PointTester {
    /**
     * Execution point of testing code for the point class.
     * DO NOT MODIFY METHOD DECLARATION.
     */
    public static void main(String[] args) {
        Point home = new Point(1, 20, "Home");
        Point store1 = new Point(55, 30, "Store");
        Point store2 = new Point(200, 10, "Store");
        Point school = new Point(32, 411, "School");

        System.out.println(store1.manhattanDistance(store2));
        System.out.println(store1.checkSameType(store2));
        System.out.println(store1.checkIfNearby(store2, 100));


    }
}       
        /*
        // Checking `home.getX()` is equal to 1.
        if (home.getX() != 1) {
            System.out.println("Test 1 Failed!");
            return; // `return` early so we do not run any subsequent tests. 
        }

        // Calculating Manhattan Distance between `store1` and `store2`.
        // Expecting 165, so fail test if result is not 165.
        if (store1.manhattanDistance(store2) != 165) {
            System.out.println("Test 2 Failed");
            return;
        }

        // You should write more tests to ensure proper functionality of your code.
    }
}
*/
