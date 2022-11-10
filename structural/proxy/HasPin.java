package structural.proxy;

public class HasPin implements ATMState {

    ATMMachine machine;

    public HasPin(ATMMachine machine) {
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
        System.out.println("Pin entered already");
    }

    @Override
    public void requestCash(int amount) {
        if (amount > machine.cashIn) {
            System.out.println("Don't have that amount of cash available. Card ejected");
            machine.setATMState(machine.getNoCardState());
        } else {
            System.out.println(amount + "withdrawn");
            machine.setCashIn(machine.cashIn - amount);

            System.out.println("Card ejected");
            machine.setATMState(machine.getNoCardState());

            if (machine.cashIn <= 0) {
                machine.setATMState(machine.getNoCashState());
            }
        }
    }
}
