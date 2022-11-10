package behavioral.template;

public class VeggieHoagie extends Hoagie {

    String[] vegetablesUsed = { "Lettuce", "Tomatoes", "Onions" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    @Override
    boolean customerWantsMeat() {
        return false;
    };

    @Override
    boolean customerWantsCheese() {
        return false;
    };

    @Override
    void addCheese() {}

    @Override
    void addCondiments() {
        System.out.println("Adding the condiments");

        for (String condiment : condimentsUsed) {
            System.out.println(condiment + " ");
        }

    }

    @Override
    void addMeat() {}

    @Override
    void addVegetables() {
        System.out.println("Adding the vegetables");

        for (String vegetable : vegetablesUsed) {
            System.out.println(vegetable + " ");
        }

    }

}
