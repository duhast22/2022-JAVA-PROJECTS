///////////////////////////////////////////////////////////////////////////////
// Main Class File:    TradingAccountTester.java
// File:               TradingAccount.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Sophia Yermolenko
// Email:              syermolenko@ucsd.edu
// Instructor's Name:  Miranda, Gregory Joseph
//////////////////////////// 80 columns wide //////////////////////////////////
import java.util.ArrayList;

/**
 * Class that represents an TradingAccount object. This object
 * contains an ArrayList of Tradable objects.
 */
public class TradingAccount {
    private ArrayList<Tradable> tradeHistory;

    /**
     * Constructor for TradingAccount
     * 
     * @param tradeHistory an ArrayList of trade history
     */
    public TradingAccount(ArrayList<Tradable> tradeHistory) {
        this.tradeHistory = tradeHistory;
    }

    /**
     * This method should return the Tradable object maximum
     *  profit out of all Tradable objects from
     * `this.tradeHistory`.
     * 
     * If there is only one element in `tradeHistory`, then
     *  you should return that single Tradable object.
     * 
     * If there are NO elements in `tradeHistory`, then you
     *  should simply return null.
     * 
     * @return the maximum profit from `tradeHistory`
     */
    public Tradable tradableMaxProfit() {
        int maximumProfit2 = -1;

        if (this.tradeHistory.size() == 0) {
            return null;
        }

        Tradable tradableObject = tradeHistory.get(0);

        if (this.tradeHistory.size() == 1) {
            return this.tradeHistory.get(0);
        }

        else {
            for (int i= 0; i < this.tradeHistory.size(); i++) {

                int currentMaxProfit = tradeHistory.get(i).getMaxProfit();

                if (currentMaxProfit > maximumProfit2) {
                    maximumProfit2 = currentMaxProfit;
                    tradableObject = tradeHistory.get(i);
                }
            }

        }
        return tradableObject;
    }

    /**
     * This method should return the Tradable object yielding the maximum
     *  profit out of all the TradingAccounts from the parameter `accounts`.
     * 
     * If there is only one element in `accounts`, then
     *  you should return the Tradable object that yields the maximum profit
     *  from the Tradable objects from that single TradingAccount.
     * 
     * If there are NO elements in `accounts`, then you
     *  should simply return null.
     * 
     * NOTE: There is a possibility that a TradingAccount within accounts is empty.
     *  Your program should NOT have an error in that case.
     * 
     * @param accounts an ArrayList of TradingAccount objects
     * @return the maximum profit from `accounts`
     */
    public static Tradable accountsMaxProfit(ArrayList<TradingAccount> accounts) {

        Tradable tradingObject;
        ArrayList<Tradable> tradeHistory = new ArrayList<>();
        int currentMaxProfit2 = -1;
        

        if (accounts.size() == 0) {
            return null;
        }

        else {
            for (int i = 0; i < accounts.size(); i++) {

                //Access the individual trading account object

                tradingObject = accounts.get(i).tradableMaxProfit();
                tradeHistory.add(tradingObject);

            }

            Tradable tradableObject = tradeHistory.get(0);

            for (int j = 0; j < tradeHistory.size(); j++) {
                int currentMaxProfit = tradeHistory.get(j).getMaxProfit();

                if (tradeHistory.get(j) == null) {
                    continue;
                }

                if (currentMaxProfit > currentMaxProfit2) {
                    currentMaxProfit2 = currentMaxProfit;
                    tradableObject = tradeHistory.get(j);
                }
            }
            return tradableObject;
        }
        
    } 
}
