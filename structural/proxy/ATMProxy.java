package structural.proxy;

public class ATMProxy implements GetATMData{

    @Override
    public ATMState getATMData() {
        ATMMachine realMachine = new ATMMachine();

        return realMachine.getATMData();
    }

    @Override
    public int getCashIn() {
        ATMMachine realMachine = new ATMMachine();
        return realMachine.getCashIn();
    }
    
}
