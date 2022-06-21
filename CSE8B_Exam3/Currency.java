///////////////////////////////////////////////////////////////////////////////
// Main Class File:    TradingAccountTester.java
// File:               Currency.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Sophia Yermolenko
// Email:              syermolenko@ucsd.edu
// Instructor's Name:  Miranda, Gregory Joseph
//////////////////////////// 80 columns wide //////////////////////////////////
/**
 * Interface for currencies that define methods to get and
 * set the currency's name.
 */
public interface Currency {
    /**
     * Getter function for the currency's name
     * 
     * @return the currency's name
     */
    public String getName();

    /**
     * Setter function for the currency's name
     * 
     * @param str the currency's name
     */
    public void setName(String str);
}
