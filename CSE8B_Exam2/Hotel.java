///////////////////////////////////////////////////////////////////////////////
// Main Class File:    HotelTester.java
// File:               Hotel.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Sophia Yermolenko
// Email:              syermolenko@ucsd.edu
// Instructor's Name:  Miranda, Gregory Joseph
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * A class that maintains the attributes of a hotel room. This includes the name
 * of the hotel and a list of rooms.
 *
 * Bugs: None found.
 *
 * @author Sophia Yermolenko
 */
public class Hotel {
    // DO NOT CHANGE THE CODE FOR THE PRIVATE MEMBER VARIABLES.
    private String name;
    private Room[] rooms;

    /**
     * Constructor to initialize the Hotel object.
     * You should be performing a deep copy.
     *
     * DO NOT MODIFY THE CONSTRUCTOR DECLARATION.
     *
     * @param name the name to (deep) initialize with
     * @param rooms the rooms to (deep) copy from
     */
    public Hotel(String name, Room[] rooms) {
        this.name = name;

        this.rooms = new Room[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            this.rooms[i] = rooms[i];
        }
    }

    /**
     * Getter method to return `name`.
     *
     * DO NOT MODIFY THIS METHOD.
     *
     * @return this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter method to return `rooms`.
     *
     * DO NOT MODIFY THIS METHOD.
     *
     * @return this.rooms
     */
    public Room[] getRooms() {
        return this.rooms;
    }

    /**
     * This method should book the first available room in the list of rooms,
     * returning the roomNumber of the room that was booked. If no room is available
     * for booking, then the method should return -1.
     *
     * NOTE 1: If the rooms array is empty, then this method should just return -1.
     *
     * DO NOT MODIFY THE METHOD DECLARATION.
     *
     * @return the roomNumber booked if any, else -1.
     */

     //The guestNames argument should be used while booking to set the names of guests the room is being booked for 
    public int bookRoom(String[] guestNames) {

        if (this.getRooms() == null) {
            return -1;
        }
        else {
            for (int i = 0; i < this.getRooms().length; i++){

                if (this.getRooms()[i].getIsAvailable() != false) {
                    this.getRooms()[i].setGuestNames(guestNames);
                    return this.getRooms()[i].getRoomNumber();
                }
            }
            return -1;
        }
    }

    /**
     * This method books the room specified by 'roomNumber', if it's available.
     * If the booking is successful, the method should return true.
     * If the hotel room is already booked (not available for booking), the method should return false.
     *
     * DO NOT MODIFY THE METHOD DECLARATION.
     *
     * @return the status of booking as described above
     */
    public boolean bookRoom(int roomNumber, String[] guestNames) {
        if (roomNumber < 0) {
            return false;
        }
        else {
            for (int i = 0; i < this.getRooms().length; i++){

                if (this.getRooms()[i].getIsAvailable() != true) {
                    return false;
                }
                else {
                    this.getRooms()[i].setGuestNames(guestNames);
                }
            }
            return true;
        }
    }
}
