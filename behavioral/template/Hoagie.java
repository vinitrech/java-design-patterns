package behavioral.template;

public abstract class Hoagie {
    final void makeSandwich(){
        cutBun();

        if(customerWantsMeat()){
            addMeat();
        }

        if(customerWantsCheese()){
            addCheese();
        }

        if(customerWantsVegetables()){
            addVegetables();
        }
        if(customerWantsCondiments()){
            addCondiments();
        }

        wrapThehoagie();
    }

    public void cutBun(){
        System.out.println("The hoagie is cut");
    }

    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();

    boolean customerWantsMeat(){
        return true;
    };


    boolean customerWantsCheese(){
        return true;
    };

    boolean customerWantsVegetables(){
        return true;
    };

    boolean customerWantsCondiments(){
        return true;
    };

    public void wrapThehoagie(){
        System.out.println("Wrap the hoagie\n");
    }
}
