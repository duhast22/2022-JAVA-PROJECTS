/**
 * Tester class for TravelDistance.
 */
public class TravelDistanceTester {
    /**
     * The `main` method to test the Task 2 class.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        // The number of ways to reach distance of 4 should be 3.
        
        try {
            if (TravelDistance.calculateWays(4) != 3) {
                System.out.println("TEST 1 FAILED.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // The number of ways to reach distance of 5 should be 5.
        try {
            if (TravelDistance.calculateWays(5) != 4) {
                System.out.println("TEST 2 FAILED.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(TravelDistance.calculateWays(3));
            //System.out.println("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        
        // You should implement more tests to ensure complete method functionality!
    }
}
