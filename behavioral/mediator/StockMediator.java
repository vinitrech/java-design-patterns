package behavioral.mediator;

import java.util.ArrayList;

public class StockMediator implements Mediator {

    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSellOffers;

    private int colleagueCodes = 0;

    public StockMediator() {
        colleagues = new ArrayList<Colleague>();
        stockBuyOffers = new ArrayList<StockOffer>();
        stockSellOffers = new ArrayList<StockOffer>();
    }

    @Override
    public void saleOffer(String stock, int shares, int colleagueCode) {
        boolean stockSold = false;

        for (StockOffer offer : stockBuyOffers) {
            if ((offer.getStockSymbol() == stock) && (offer.getStockShares() == shares)) {
                System.out.println(shares + " shares of " + stock + " sold to " + offer.getColleagueCode());

                stockBuyOffers.remove(offer);
                stockSold = true;
            }

            if (stockSold) {
                break;
            }
        }

        if (!stockSold) {
            System.out.println(shares + " shares of " + stock + " added to inventory");

            StockOffer newOffering = new StockOffer(shares, stock, colleagueCode);
            stockSellOffers.add(newOffering);
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int colleagueCode) {
        boolean stockBought = false;

        for (StockOffer offer : stockSellOffers) {
            if ((offer.getStockSymbol() == stock) && (offer.getStockShares() == shares)) {
                System.out.println(shares + " shares of " + stock + " bought by " + offer.getColleagueCode());

                stockSellOffers.remove(offer);
                stockBought = true;
            }

            if (stockBought) {
                break;
            }
        }

        if (!stockBought) {
            System.out.println(shares + " shares of " + stock + " added to inventory");

            StockOffer newOffering = new StockOffer(shares, stock, colleagueCode);
            stockBuyOffers.add(newOffering);
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
        colleagueCodes += 1;
        colleague.setColleagueCode(colleagueCodes);
    }

    public void getStockOfferings() {
        System.out.println("\nStocks for Sale");

        for (StockOffer offer : stockSellOffers) {
            System.out.println(offer.getStockShares() + " shares of " + offer.getStockSymbol());
        }
    }

    public void getStockBuyOfferings() {
        System.out.println("\nStocks for Buying");

        for (StockOffer offer : stockSellOffers) {
            System.out.println(offer.getStockShares() + " shares of " + offer.getStockSymbol());
        }
    }

}
