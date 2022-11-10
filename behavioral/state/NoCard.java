package behavioral.state;

public class NoCard implements ATMState{
    
    ATMMachine machine;

    public NoCard(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    public void ejectCard() {
        System.out.println("Enter a card first");
    }

    @Override
    public void insertCard() {
        System.out.println("Please enter a pin");
        machine.setATMState(machine.getYesCardState());

    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Enter a card first");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Enter a card first");
    }
}
