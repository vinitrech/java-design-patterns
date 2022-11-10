package behavioral.template;

public class ItalianHoagie extends Hoagie{

    String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String[] cheeseUsed = {"Provolone", "Pepperoni", "Capicola Ham"};
    String[] vegetablesUsed = {"Lettuce", "Tomatoes", "Onions"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    @Override
    void addCheese() {
        System.out.println("Adding the cheeses");

        for(String cheese: cheeseUsed){
            System.out.println(cheese + " ");
        }
    }

    @Override
    void addCondiments() {
        System.out.println("Adding the condiments");

        for(String condiment: condimentsUsed){
            System.out.println(condiment + " ");
        }
        
    }

    @Override
    void addMeat() {
        System.out.println("Adding the meats");

        for(String meat: meatUsed){
            System.out.println(meat + " ");
        }
        
    }

    @Override
    void addVegetables() {
        System.out.println("Adding the vegetables");

        for(String vegetable: vegetablesUsed){
            System.out.println(vegetable + " ");
        }
        
    }
    
}
