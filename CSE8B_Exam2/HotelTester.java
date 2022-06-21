///////////////////////////////////////////////////////////////////////////////
// Title:              HotelTester
// Files:              HotelTester.java, Hotel.java, Room.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Sophia Yermolenko
// Email:              syermolenko@ucsd.edu
// Instructor's Name:  Miranda, Gregory Joseph
//////////////////////////// 80 columns wide //////////////////////////////////
import java.io.*;
import java.util.Arrays;

/**
 * A class to test the Hotel and Room class.
 *
 * Bugs: None known
 *
 * @author (YOUR NAME)
 */
public class HotelTester {
    /**
     * Execution point of testing code for the Hotel and Room class.
     *
     * DO NOT MODIFY METHOD DECLARATION.
     */
    public static void main(String[] args) {
        Room room1 = new Room(1, new String[] {"John", "Mary"}, false);
        Room room2 = new Room(2); //creates a free room
        Room room3 = new Room(room1);

        Room[] roomList = new Room[] {room1, room2, room3};

        Hotel hotel1 = new Hotel("Hotel California", roomList);

        // Testing for simple assignment within constructor.
        // We do NOT want a shallow copy - we want a deep copy.
        // As such, if both arrays have the same reference, then this test fails.
        if (hotel1.getRooms() == roomList) {
            System.out.println("Test Failed! Shallow copy detected.");
        }

        // Testing `bookRoom()` for `hotel1`.
        int output = hotel1.bookRoom(new String[] {"Paul", "Mark"});
        int expected = 2;
        if (output != expected) {
            System.out.println("Test Failed! Booking status does not match.");
        }

        // You should write more tests to ensure deep copy (and copy constructor) work properly,
        // and to test `bookRoom()` and `bookRoom(int roomNumber)`.
        /*
        //Testing if bookRoom(String[] guestNames) will return -1 if roomList is empty
        Room [] roomListTest = new Room [] {};
        Hotel hotelTest1 = new Hotel("Hotel California", roomListTest);
        String [] guestNames = {"John", "Mary"};
        System.out.println("Result should be -1");
        System.out.println(hotelTest1.bookRoom(guestNames));

        //Testing if bookRoom(String[] guestNames) will return -1 if room in roomList is unavailable
        Room r4 = new Room(4, new String[] {"John", "Mary"}, false);
        Room r5 = new Room(5, new String[] {"John", "Mary"}, false); //creates a free room
        Room r6 = new Room(6, new String[] {"John", "Mary"}, false);
        Room [] roomListTest2 = new Room [] {r4, r5, r6};
        Hotel hotelTest2 = new Hotel("Hotel California", roomListTest2);
        String [] guestNames2 = {"John", "Mary"};
        System.out.println("Result should be -1");
        System.out.println(hotelTest2.bookRoom(guestNames2));
        */

        //Use for part 2 of video
        Room r1 = new Room(101, new String[] {"Benson", "Jack"}, false);
        Room r2 = new Room(121, new String[] {"Prajwala", "Sasya"},true);
        Room r3 = new Room(90);
        Room[] roomList2 = new Room[] {r1, r2, r3};
        Hotel h1 = new Hotel("Marriott", roomList2);
        String[] guestList = new String[] {"Bao", "James"};

        String[] guestListForRoom2Old = r2.getGuestNames();
        System.out.println("Before implementing h1.bookRoom(guestList), r2 had guests " +
                            "(represented by an array) " +  Arrays.toString(guestListForRoom2Old));
        
        System.out.println("Booked room number is " + h1.bookRoom(guestList));
        String[] guestListForRoom2 = r2.getGuestNames();
        System.out.println("The new guests for room " + h1.bookRoom(guestList) + " (represented by an array) are " + Arrays.toString(guestListForRoom2));


        //Task 3 questions
        //Room r1 = new Room(101, new String[] { "Benson", "Jack"}, false);
        //Room r2 = new Room(121, new String[] {"Prajwala", "Sasya"},true);
        //Room r3 = new Room(90);



    }
}
