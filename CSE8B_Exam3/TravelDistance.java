/**
 * Class for TravelDistance. Only one method (with maybe a helper method).
 */
public class TravelDistance {
    private static final String ERR_MSG = "Invalid input!";
    
    /**
     * Given a distance of `n` feet, you can either take a step
     *  (which covers 1 foot) or a leap (which covers 3 feet). This
     *  method should calculate the different number of ways you can
     *  step/leap to reach the distance of `n` feet.
     * 
     * If `n` = 0, then this method should return `1`.
     * 
     * This method should gracefully handle negative numbers (by
     *  throwing an exception with message `ERR_MSG`).
     * 
     * For example, if `n = 4`, then there are 3 ways to reach
     *  the distance of 4:
     *  1. step + step + step + step = 1 + 1 + 1 + 1
     *  2. step + leap = 1 + 3
     *  3. leap + step = 3 + 1
     * 
     * HINT: You might want to create a helper method just for the
     *  recursive part.
     * 
     * @param n the distance (in feet) to reach
     * @return the number of ways to step/leap to `n`
     */
    public static int calculateWays(int n) throws Exception {
        //base cases
        if (n == 0) {
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else if (n==2) {
            return 1;
        }
        else if (n==3){
            return 2;
        }
        else if (n < 0) {
           throw new Exception(ERR_MSG);
        }
        else{
            
            int value = calculateWays(n-1) + calculateWays(n-3);
            return value;
        }
    }
}
