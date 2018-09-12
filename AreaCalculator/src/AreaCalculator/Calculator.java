import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) throws Exception {

//        ArrayList<Double> arrayListOfResults = new ArrayList<>();
        double result;
        boolean guard = true;
        while (guard) {
            System.out.println("To count area, please input your selected type of calculation (write down a number): " +
                    "\n0 for Rectangle Area or" +
                    "\n1 for Square Area or" +
                    "\n2 for Triangle Area or" +
                    "\n3 for Circle Area" +
                    "\n4 for Standard Calculator" +
                    "\n5 for Exit");

            Scanner input = new Scanner(System.in);

            OperationEnum o = OperationEnum.GetOperation(Utils.ConvertToInt0_5(input.nextLine()));

            switch (o) {
                case Rectangle:
                    RectangleSelected();
                    break;
                case Square:
                    SquareSelected();
                    break;
                case Triangle:
                    TriangleSelected();
                    break;
                case Circle:
                    CircleSelected();
                    break;
                case Calculator:
                    CalculatorSelected();
                    break;
                case Exit:
                    ExitSelected();
                    break;
            }

            //Arraylist wywołanie

//            System.out.println("Your arrayList is");
//            for (int i = 0; i < arrayListOfResults.size(); i++) {
//                System.out.print(arrayListOfResults.get(i) + " ");
//            }
//
//            System.out.println();


//Quicksort-main
//                for(Double i:arrayListOfResults){
//                    int[] x = { arrayListOfResults[i] };
//                    System.out.println(Arrays.toString(x));

//            int low = 0;
//            int high = arrayListOfResults.size() - 1;
//            quickSort.quickSort(arrayListOfResults, low, high);
//
//            System.out.println("Your sorted arrayList is:");
//            for (int i = 0; i < arrayListOfResults.size(); i++) {
//                System.out.println(arrayListOfResults.get(i) + " ");
//            }
        }
    }


        public static void RectangleSelected() {
            System.out.println("Your figure is Rectangle.");

            System.out.println("Write height: ");
            Scanner height = new Scanner(System.in);

            double myheight = Double.parseDouble(height.nextLine());

            System.out.println("Write width: ");
            Scanner width = new Scanner(System.in);

            double mywidth = Double.parseDouble(width.nextLine());

            Rectangle myRectangle = new Rectangle(myheight, mywidth);
            double result = myRectangle.Area();
            System.out.println("The area of your figure is " + result);
//            arrayListOfResults.add(result);
        }

        public static void SquareSelected () {
            System.out.println("Your figure is Square.");

            System.out.println("Write length of sides: ");
            Scanner sideLength = new Scanner(System.in);
            double mysideLength = Double.parseDouble(sideLength.nextLine());

            Square mySquare = new Square(mysideLength);
            double result = mySquare.Area();
            System.out.println("The area of your figure is " + result);
//            arrayListOfResults.add(result);
        }

        public static void TriangleSelected () {
            System.out.println("Your figure is Triangle.");

            System.out.println("Write side's length: ");
            Scanner sideLength3 = new Scanner(System.in);

            double mysideLength3 = Double.parseDouble(sideLength3.nextLine());

            System.out.println("Write height: ");
            Scanner height3 = new Scanner(System.in);

            double myheight3 = Double.parseDouble(height3.nextLine());

            Triangle myTriangle = new Triangle(mysideLength3, myheight3);
            double result = myTriangle.Area();
            System.out.println("The area of your figure is " + result);
//            arrayListOfResults.add(result);
        }

        public static void CircleSelected () {
            System.out.println("Your figure is Circle.");

            System.out.println("Write radius: ");
            Scanner radius = new Scanner(System.in);
            double myRadius = Double.parseDouble(radius.nextLine());

            Circle myCircle = new Circle(myRadius);
            double result = myCircle.Area();
            System.out.println("The area of your figure is " + result);
//            arrayListOfResults.add(result);
        }

        public static void CalculatorSelected () throws Exception {
            System.out.println("Let's calculate");

            System.out.println("Write first number: ");
            Scanner number1 = new Scanner(System.in);
            double mynumber1 = Double.parseDouble(number1.nextLine());

            String myOperation = "5";

            while ((!myOperation.equals("1")) && (!myOperation.equals("2")) && (!myOperation.equals("3")) && (!myOperation.equals("4"))) {
                System.out.println("Write operation (write down a number): " +
                        "\n0 for Addition or" +
                        "\n1 for Subtraction or" +
                        "\n2 for Multiplication or" +
                        "\n3 for Division"
                );

                Scanner operation = new Scanner(System.in);
                myOperation = operation.nextLine();

                if ((myOperation.equals("1")) || (myOperation.equals("2")) || (myOperation.equals("3")) || (myOperation.equals(
                        "4"))) {
                    System.out.println("Write second number:");
                    Scanner number2 = new Scanner(System.in);
                    double mynumber2 = Double.parseDouble(number2.nextLine());

                    CalculatorEnum c = CalculatorEnum.GetOperation(Utils.ConvertToInt0_3(myOperation));

                    switch (c) {
                        case Addition:
                            SelectedAddition(mynumber1,mynumber2);
                            System.out.println("Your choice is Addition.");
                            break;
                        case Subtraction:
                            SelectedSubtraction(mynumber1,mynumber2);
                            System.out.println("Your choice is Subtraction.");
                            break;
                        case Multiplication:
                            SelectedMultiplication(mynumber1,mynumber2);
                            System.out.println("Your choice is Multiplication.");
                            break;
                        case Division:
                            SelectedDivision(mynumber1,mynumber2);
                            System.out.println("Your choice is Division.");
                            break;
                    }
                } else {
                    System.out.println("You didn't choose a number. Please write down a number from 1 to " +
                            "4.");
                }
            }
        }

        public static void ExitSelected () {
            System.out.println("Program is finished.");
            System.exit(0);
        }

        public static void SelectedAddition (double number1, double number2) {



            StandardCalculator myResult = new StandardCalculator(number1, number2);
            double result = myResult.Add();
            System.out.println("Result is " + result);
//            arrayListOfResults.add(result);
        }
        public static void SelectedSubtraction (double number1, double number2) {



            StandardCalculator myResult2 = new StandardCalculator(number1, number2);
            double result = myResult2.Subtract();
            System.out.println("Result is " + result);
//            arrayListOfResults.add(result);
        }
        public static void SelectedMultiplication (double number1, double number2) {


            StandardCalculator myResult3 = new StandardCalculator(number1, number2);
            double result = myResult3.Multiplicate();
            System.out.println("Result is " + result);
//            arrayListOfResults.add(result);
        }
        public static void SelectedDivision (double number1, double number2) {



            StandardCalculator myResult4 = new StandardCalculator(number1, number2);

//            while (number2 == 0.0) {
                try {
                    double result = myResult4.Divide();
                } catch (ArithmeticException ex) {
                    System.out.println("You can't divide by zero. Please write down a correct number.");
                }
//                System.out.println("Write second number:");
//                Scanner number3 = new Scanner(System.in);
//                double mynumber3 = Double.parseDouble(number3.nextLine());
//                number2 = mynumber3;
//            }

            double result = myResult4.Divide();
            System.out.println("Result is " + result);
//            arrayListOfResults.add(result);
        }
    }
