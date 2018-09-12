public enum OperationEnum {
    Rectangle, Square, Triangle, Circle, Calculator, Exit;

    public static OperationEnum GetOperation(int status) {
        switch (status) {
            case 0:
                return Rectangle;
            case 1:
                return Square;
            case 2:
                return Triangle;
            case 3:
                return Circle;
            case 4:
                return Calculator;
            case 5:
                return Exit;
            default:
                return Exit;
        }
    }
    }
