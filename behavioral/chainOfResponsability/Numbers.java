package behavioral.chainOfResponsability;

public class Numbers {
    private int number1;
    private int number2;
    private String calculation;

    public Numbers(int number1, int number2, String calculation) {
        this.number1 = number1;
        this.number2 = number2;
        this.calculation = calculation;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getCalculation() {
        return calculation;
    }
}
