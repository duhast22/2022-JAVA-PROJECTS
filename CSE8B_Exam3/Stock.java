///////////////////////////////////////////////////////////////////////////////
// Main Class File:    TradingAccountTester.java
// File:               Stock.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Sophia Yermolenko
// Email:              syermolenko@ucsd.edu
// Instructor's Name:  Miranda, Gregory Joseph
//////////////////////////// 80 columns wide //////////////////////////////////
import java.util.ArrayList;

/**
 * A class that represents a Stock. This class extends the
 * Tradable abstract class, and this class also implements the Currency
 * interface.
 */
public class Stock extends Tradable implements Currency {
    private String stockName;
    private String dateListed;

    /**
     * Constructor for Stock
     * 
     * @param stockName the Stock's name
     * @param priceHistory price history
     */
    public Stock(String stockName, ArrayList<Integer> priceHistory,
        String dateListed) {

        super(priceHistory);
        this.stockName = stockName;
        this.dateListed = dateListed;
    }

    /**
     * Getter method to return stockName
     * 
     * @return this.stockName
     */
    public String getName() {
        
        return this.stockName;
    }

    /**
     * Getter method to return dateListed
     * 
     * @return this.dateListed
     */
    public String getDateListed() {
        return this.dateListed;
    }

    /**
     * Setter method for stockName
     * 
     * @param stockName stockName to change to
     */
    public void setName(String stockName) {

        this.stockName = stockName;
        
    }

    /**
     * Setter method for dateListed
     * 
     * @param dateListed dateListed to change to
     */
    public void setDateListed(String dateListed) {
        this.dateListed = dateListed;
    }
}