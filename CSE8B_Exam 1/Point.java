///////////////////////////////////////////////////////////////////////////////
// Main Class File:    PointTester.java
// File:               Point.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Sophia Yermolenko
// Email:              syermolenko@ucsd.edu
// Instructor's Name:  Miranda, Gregory Joseph
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * A class to represent a Point on a 2D coordinate plane.
 *
 * Bugs: None known
 *
 * @author Sophia Yermolenko
 */
public class Point {
    // DO NOT CHANGE THE CODE FOR ANY OF THESE VARIABLES.
    private int x; // The point's x coordinate (as an int)
    private int y; // The point's y coordinate (as an int)
    private String type; // The point's type (e.g. Home, Store, School)

    /**
     * Constructor: creates a point object.
     * DO NOT MODIFY CONSTRUCTOR DECLARATION.
     *
     * @param x the x coordinate of the point
     * @param y the y coordinate of the point
     * @param type the location type of the point
     */
    public Point(int x, int y, String type)
    {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    /**
     * Return the x coordinate of the point.
     * DO NOT CHANGE THIS METHOD.
     *
     * @return the x coordinate of the point
     */
    public int getX()
    {
        return this.x;
    }

    /**
     * Return the y coordinate of the point.
     * DO NOT CHANGE THIS METHOD.
     *
     * @return the y coordinate of the point
     */
    public int getY()
    {
        return this.y;
    }

    /**
     * Return the type of the point.
     * DO NOT CHANGE THIS METHOD.
     *
     * @return the type of the point
     */
    public String getType()
    {
        return this.type;
    }
    int mDistance;
    int subtractX;
    int subtractY;
    /**
     * Returns the Manhattan distance from "this" point to
     * parameter point "p".
     * The Manhattan distance is given by: |x_1 - x_2| + |y_1 - y_2|
     *
     * YOU ARE NOT ALLOWED TO USE `Math` OR ANY SIMILAR CLASSES/PACKAGES
     * TO PERFORM THE ABSOLUTE VALUE CALCULATIONS.
     *
     * @return the Manhattan distance (as an int)
     */
    public int manhattanDistance(Point p){
        subtractX = (this.getX() - p.getX());
        if (subtractX < 0) {
            subtractX = -(subtractX);
        }
        subtractY = (this.getY() - p.getY());
        if (subtractY < 0) {
            subtractY = -(subtractY);
        }
        mDistance = subtractX + subtractY;
        return mDistance;
    }

    /**
     * Returns a boolean that determines if "this"
     * has the same type parameter point "p".
     *
     * @return true if type is same, false otherwise.
     */
    /** */
    public boolean checkSameType(Point p) {
        if (this.type.equals(p.getType())) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Returns a boolean that determines if the Manhattan distance from
     * "this" to parameter point "p" is less than or equal to distance.
     *
     * @return true if nearby, false otherwise.
     */
    public boolean checkIfNearby(Point p, int distance) {
        if (mDistance <= distance) {
            return true;
        }
        else {
            return false;
        }
    }
}
