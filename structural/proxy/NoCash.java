package structural.proxy;

public class NoCash implements ATMState {

    ATMMachine machine;

    public NoCash(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    public void ejectCard() {
        System.out.println("You didn't enter a card");
    }

    @Override
    public void insertCard() {
        System.out.println("We don't have money");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("We don't have money");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("We don't have money");
    }

}
