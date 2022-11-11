package behavioral.mediator;

/* ***************************** Mediator design pattern *****************************
 * Lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.
 * 
 * PROS:
 * - Single Responsibility Principle. You can extract the communications between various components into a single place, making it easier to comprehend and maintain.
 * - Open/Closed Principle. You can introduce new mediators without having to change the actual components.
 * - You can reduce coupling between various components of a program.
 * - You can reuse individual components more easily.
 * 
 * CONS: 
 * - Over time a mediator can evolve into a God Object.
 */

public class Main {
    public static void main(String[] args) {
       StockMediator nyse = new StockMediator();
       GormanSlacks broker = new GormanSlacks(nyse);
       JTPoorman broker2 = new JTPoorman(nyse);

       broker.saleOffer("MSFT", 100);
       broker.saleOffer("GOOGL", 50);

       broker2.buyOffer("MSFT", 100);
       broker2.saleOffer("NRG", 10);

       broker.buyOffer("NRG", 10);

       nyse.getStockOfferings();
    }
}
