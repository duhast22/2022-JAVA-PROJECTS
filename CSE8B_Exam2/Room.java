///////////////////////////////////////////////////////////////////////////////
// Main Class File:    HotelTester.java
// File:               Room.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Sophia Yermolenko
// Email:              syermolenko@ucsd.edu
// Instructor's Name:  Miranda, Gregory Joseph
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * A class that maintains an attributes of a hotel room. This includes:
 * room number, a list of guest names and whether the room is available for booking.
 *
 * Bugs: None found.
 *
 * @author Sophia Yermolenko
 */
public class Room {

    // DO NOT CHANGE THE CODE FOR THE PRIVATE MEMBER VARIABLES.
    private int roomNumber; // unique room number
    private String[] guestNames; //list of guest names, empty if room is available
    private boolean isAvailable; //parameter set to true if room is available else false

    /**
     * Constructor to initialize a free (isAvailable = true) room with the given room number
     * and list of guestNames should be empty.
     * DO NOT MODIFY CONSTRUCTOR DECLARATION.
     *
     * @param roomNumber room number to (deep) initialize with
     */
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.guestNames = new String[0];
        this.isAvailable = true;
    }

    /**
     * Constructor to initialize the Room with the given parameters.
     * You should be performing a deep copy.
     *
     * DO NOT MODIFY CONSTRUCTOR DECLARATION.
     *
     * @param roomNumber room number to (deep) initialize with
     * @param guestNames names of guests to (deep) initialize with
     * @param isAvailable isAvailable to (deep) initialize with
     */
    public Room(int roomNumber, String[] guestNames, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.isAvailable = isAvailable;
        
        this.guestNames = new String [guestNames.length];
        for (int i = 0; i < guestNames.length; i++) {
            this.guestNames[i] = guestNames[i];
        }

    }

    /**
     * (Deep) copy constructor to initialize the Room
     *      with the given Room object.
     * You should be performing a deep copy.
     *
     * DO NOT MODIFY CONSTRUCTOR DECLARATION.
     *
     * @param otherRoom room to (deep) copy from
     */
    public Room(Room otherRoom) {
        this.roomNumber = otherRoom.roomNumber;
        this.isAvailable = otherRoom.isAvailable;

        this.guestNames = new String [otherRoom.guestNames.length];
        for (int i = 0; i < otherRoom.guestNames.length; i++) {
            this.guestNames[i] = otherRoom.guestNames[i];
        }

    }

    /**
     * Getter method to return `roomNumber`.
     *
     * DO NOT MODIFY THIS METHOD.
     *
     * @return roomNumber
     */
    public int getRoomNumber() {
        return this.roomNumber;
    }

    /**
     * Getter method to return `guestNames`.
     *
     * DO NOT MODIFY THIS METHOD.
     *
     * @return guestNames
     */
    public String[] getGuestNames() {
        return this.guestNames;
    }

    /**
     * Getter method to return `isAvailable`.
     *
     * DO NOT MODIFY THIS METHOD.
     *
     * @return isAvailable
     */
    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    /**
     * Setter method to update `guestNames`.
     *
     * DO NOT MODIFY THIS METHOD.
     *
     */
    public void setGuestNames(String[] guestNames) {
        this.guestNames = new String[guestNames.length];
        System.arraycopy(guestNames, 0, this.guestNames, 0, guestNames.length);
    };

    /**
     * Setter method to update `isAvailable`.
     *
     * DO NOT MODIFY THIS METHOD.
     *
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
