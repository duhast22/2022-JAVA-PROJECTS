///////////////////////////////////////////////////////////////////////////////
// Main Class File:    TradingAccountTester.java
// File:               Tradable.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Sophia Yermolenko
// Email:              syermolenko@ucsd.edu
// Instructor's Name:  Miranda, Gregory Joseph
//////////////////////////// 80 columns wide //////////////////////////////////
import java.util.ArrayList;

/**
 * Abstract class that defines an object that is tradable. Tradable
 * objects will have a price history (as an ArrayList). We also provide
 * a set of getter/setter methods.
 */
public abstract class Tradable implements Currency {
    private ArrayList<Integer> priceHistory;

    /**
     * Constructor for a Tradable object.
     * 
     * @param priceHistory priceHistory to set `this.priceHistory` to.
     */
    public Tradable(ArrayList<Integer> priceHistory) {
        this.priceHistory = priceHistory;
    }


    /**
     * Finds the maximum amount of profit that can be gained from
     *  `priceHistory`. If there is no profit to be gained, then
     *  you should just return 0.
     * 
     * @return the maximum profit if possible. Otherwise, return 0.
     */
    public int getMaxProfit() {
        int minPrice = getPriceHistory().get(0);
        int maximumProfit = -1;

        for (int i=0; i < getPriceHistory().size(); i++) {


            if (getPriceHistory().get(i) < minPrice) {

                minPrice = getPriceHistory().get(i);

            }

            if ((getPriceHistory().get(i) - minPrice) > maximumProfit) {

                maximumProfit = (getPriceHistory().get(i) - minPrice);
                
            }
        }

        if (maximumProfit < 0){
            return 0;
        }
        else {
            return maximumProfit;

        }
    }

    /**
     * Getter method to return priceHistory
     * 
     * @return this.priceHistory
     */
    public ArrayList<Integer> getPriceHistory() {
        return this.priceHistory;
    }

    /**
     * Setter method for priceHistory
     * 
     * @param priceHistory priceHistory to change to
     */
    public void setPriceHistory(ArrayList<Integer> priceHistory) {
        this.priceHistory = priceHistory;
    }
}
