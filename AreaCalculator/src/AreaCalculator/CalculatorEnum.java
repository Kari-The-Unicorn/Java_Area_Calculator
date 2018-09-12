public enum CalculatorEnum {

    Addition, Subtraction, Multiplication, Division, CorrectNeeded;

    public static CalculatorEnum GetOperation(int status) {
        switch (status) {
            case 0:
                return Addition;
            case 1:
                return Subtraction;
            case 2:
                return Multiplication;
            case 3:
                return Division;
            default:
               return CorrectNeeded;
        }
    }
}
