package behavioral.state;

public class ATMMachine {
    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState outOfMoney;
    ATMState state;
    int cashIn = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasCorrectPin = new HasPin(this);
        this.outOfMoney = new NoCash(this);

        state = noCard;

        if(cashIn <= 0){
            state = outOfMoney;
        }
    }

    void setATMState(ATMState state) {
        this.state = state;
    }

    public void setCashIn(int cashIn){
        this.cashIn = cashIn;
    }

    public void insertCard(){
        state.insertCard();
    }

    public void ejectCard(){
        state.ejectCard();
    }

    public void requestCash(int amount){
        state.requestCash(amount);
    }

    public void insertPin(int pin){
        state.insertPin(pin);
    }

    public ATMState getYesCardState() {return hasCard;}
    public ATMState getNoCardState() {return noCard;}
    public ATMState getHasPin() {return hasCorrectPin;}
    public ATMState getNoCashState() {return outOfMoney;}

}
