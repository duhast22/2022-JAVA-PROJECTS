///////////////////////////////////////////////////////////////////////////////
// Main Class File:    TradingAccountTester.java
// File:               TradingAccountTester.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Sophia Yermolenko
// Email:              syermolenko@ucsd.edu
// Instructor's Name:  Miranda, Gregory Joseph
//////////////////////////// 80 columns wide //////////////////////////////////
import java.util.ArrayList;
import java.io.*;

/**
 * Class to test TradingAccount class (and all other related classes).
 */
public class TradingAccountTester {
    /**
     * The `main` method to test all Task 1 classes.
     * 
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {

        // APPL Stock
        String applName = "APPL";
        ArrayList<Integer> applPriceHistory = new ArrayList<>();
        applPriceHistory.add(180);
        applPriceHistory.add(160);
        applPriceHistory.add(175);
        applPriceHistory.add(170);
        applPriceHistory.add(180);
        applPriceHistory.add(190);
        applPriceHistory.add(195);
        String applDateListed = "1980-12-12";
        Stock appl = new Stock(applName, applPriceHistory, applDateListed);

        // BTC Cryptocurrency
        String btcName = "BTC";
        ArrayList<Integer> btcPriceHistory = new ArrayList<>();
        btcPriceHistory.add(42635);
        btcPriceHistory.add(38723);
        btcPriceHistory.add(42602);
        btcPriceHistory.add(42917);
        btcPriceHistory.add(37453);
        btcPriceHistory.add(38440);
        btcPriceHistory.add(38790);
        Cryptocurrency btc = new Cryptocurrency(btcName, btcPriceHistory);

        // MSFT Stock
        String msftName = "MSFT";
        ArrayList<Integer> msftPriceHistory = new ArrayList<>();
        msftPriceHistory.add(325);
        msftPriceHistory.add(244);
        msftPriceHistory.add(279);
        msftPriceHistory.add(287);
        msftPriceHistory.add(329);
        msftPriceHistory.add(293);
        String msftDateListed = "1986-03-13";
        Stock msft = new Stock(msftName, msftPriceHistory, msftDateListed);

        // Create an ArrayList of Tradable objects
        ArrayList<Tradable> tradables1 = new ArrayList<>();
        tradables1.add(appl);
        tradables1.add(btc);
        tradables1.add(msft);

        // Create a new TradingAccount object
        TradingAccount ta1 = new TradingAccount(tradables1);






        // BBC Stock
        String bbcName = "bbc";
        ArrayList<Integer> bbcPriceHistory = new ArrayList<>();
        bbcPriceHistory.add(1780);
        bbcPriceHistory.add(160);
        bbcPriceHistory.add(175);
        bbcPriceHistory.add(170);
        bbcPriceHistory.add(180);
        bbcPriceHistory.add(2222);
        bbcPriceHistory.add(195);
        String bbcDateListed = "1980-12-12";
        Stock bbc = new Stock(bbcName, bbcPriceHistory, bbcDateListed);

        // CCC Cryptocurrency
        String cccName = "ccc";
        ArrayList<Integer> cccPriceHistory = new ArrayList<>();
        cccPriceHistory.add(42635);
        cccPriceHistory.add(38723);
        cccPriceHistory.add(42602);
        cccPriceHistory.add(42917);
        cccPriceHistory.add(55555);
        cccPriceHistory.add(38440);
        cccPriceHistory.add(38790);
        Cryptocurrency ccc = new Cryptocurrency(cccName, cccPriceHistory);

        // DDD Stock
        String DDDName = "DDD";
        ArrayList<Integer> DDDPriceHistory = new ArrayList<>();
        DDDPriceHistory.add(325);
        DDDPriceHistory.add(244);
        DDDPriceHistory.add(279);
        DDDPriceHistory.add(287);
        DDDPriceHistory.add(500);
        DDDPriceHistory.add(293);
        String DDDDateListed = "1986-03-13";
        Stock DDD = new Stock(DDDName, DDDPriceHistory, DDDDateListed);

        // Create an ArrayList of Tradable objects
        ArrayList<Tradable> tradables2 = new ArrayList<>();
        tradables2.add(bbc);
        tradables2.add(ccc);
        tradables2.add(DDD);

        // Create a new TradingAccount object
        TradingAccount ta2 = new TradingAccount(tradables2);






        //Create an ArrayList of TradingAccount objects
        ArrayList<TradingAccount> newList = new ArrayList<>();
        newList.add(ta1);
        newList.add(ta2);

        System.out.println(ta2.tradableMaxProfit());
        for (int i = 0; i < 1; i++) {
            System.out.println(TradingAccount.accountsMaxProfit(newList));
        }
        
    
        // The max profit for APPL should be 35 (195 - 160)
        if (appl.getMaxProfit() != 35) {
            System.out.println("TEST 1 FAILED.");
        }

        // The max profit for MSFT should be 85 (329 - 244)
        if (msft.getMaxProfit() != 85) {
            System.out.println("TEST 2 FAILED.");
        }

        // The max profit from `invst1` should have the name "BTC".
        if (!ta1.tradableMaxProfit().getName().equals("BTC")) {
            System.out.println("TEST 3 FAILED.");
        }

        System.out.println(ta1.tradableMaxProfit().getName());

        // You should write more tests to ensure complete functionality! We suggest
        // testing the following:
        // Create a bunch of TradingAccount objects to test `accountsMaxProfit`
        //  NOTE: You would call `accountsMaxProfit` in a static context.
        //  (e.g. `TradingAccount.accountsMaxProfit(...)`)
        // Testing a Stock/Cryptocurrency that has no profit (in such cases,
        //  `getMaxProfit()` should return 0).



        // Dogecoin Cryptocurrency
        String dogecoinName = "Dogecoin";
        ArrayList<Integer> dogecoinPriceHistory = new ArrayList<>();
        dogecoinPriceHistory.add(7);
        dogecoinPriceHistory.add(2);
        dogecoinPriceHistory.add(5);
        dogecoinPriceHistory.add(1);
        dogecoinPriceHistory.add(6);
        dogecoinPriceHistory.add(9);
        Cryptocurrency dogecoin = new Cryptocurrency(dogecoinName, dogecoinPriceHistory);

        System.out.print(dogecoin.getMaxProfit());

    }
}
