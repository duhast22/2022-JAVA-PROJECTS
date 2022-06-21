///////////////////////////////////////////////////////////////////////////////
// Main Class File:    TradingAccountTester.java
// File:               Cryptocurrency.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Sophia Yermolenko
// Email:              syermolenko@ucsd.edu
// Instructor's Name:  Miranda, Gregory Joseph
//////////////////////////// 80 columns wide //////////////////////////////////
import java.util.ArrayList;

/**
 * A class that represents a Cryptocurrency. This class extends the
 * Tradable abstract class, and this class also implements the Currency
 * interface.
 */
public class Cryptocurrency extends Tradable implements Currency {
    private String cryptoName;

    /**
     * Constructor for Cryptocurrency
     * 
     * @param cryptoName the Cryptocurrency's name
     * @param priceHistory price history
     */
    public Cryptocurrency(String cryptoName, ArrayList<Integer> priceHistory) {

        super(priceHistory);
        this.cryptoName = cryptoName;

    }

    /**
     * Getter method to return cryptoName
     * 
     * @return this.cryptoName
     */
    public String getName() {
        
        return this.cryptoName;
    }

    /**
     * Setter method for cryptoName
     * 
     * @param cryptoName cryptoName to change to
     */
    public void setName(String cryptoName) {

        this.cryptoName = cryptoName;
    }
}