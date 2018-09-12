public class StandardCalculator {
    double Number1, Number2;

    public StandardCalculator(double Number1, double Number2) {
        this.Number1 = Number1;
        this.Number2 = Number2;
    }

    public double Add() {
        return Number1 + Number2;
    }

    public double Subtract() {
        return Number1 - Number2;
    }

    public double Multiplicate() {
        return Number1 * Number2;
    }

    public double Divide() {

        return Number1 / Number2;
    }
}
