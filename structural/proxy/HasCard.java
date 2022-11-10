package structural.proxy;

public class HasCard implements ATMState {

    ATMMachine machine;

    public HasCard(ATMMachine machine) {
        this.machine = machine;
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        machine.setATMState(machine.getNoCardState());
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card");

    }

    @Override
    public void insertPin(int pin) {
        if (pin == 1234) {
            System.out.println("Correct pin");
            machine.correctPinEntered = true;
            machine.setATMState(machine.getHasPin());
        }else{
            System.out.println("Wrong pin");
            machine.correctPinEntered = false;
            System.out.println("Card ejected pin");
            machine.setATMState(machine.getNoCardState());
        }

    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Enter pin first");
    }

}
