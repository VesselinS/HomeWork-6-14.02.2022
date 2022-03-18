package qa.automation;

public class Methods {

    public static void main(String[] args) {

    positiveNumbers(10,-20,0);
    equalNumbers(10,10,5);
    averageValue(8, 6);
    totalSum(10, 20);
    }

    public static void positiveNumbers(int number1, int number2, int number3) {
        if (number1 > 0) System.out.println("The number is positive.");
        if (number1 < 0) System.out.println("The number is negative.");
        if (number1 == 0) System.out.println("The number is not positive nor negative.");
        if (number2 > 0) System.out.println("The number is positive.");
        if (number2 < 0) System.out.println("The number is negative.");
        if (number2 == 0) System.out.println("The number is not positive nor negative.");
        if (number3 > 0) System.out.println("The number is positive.");
        if (number3 < 0) System.out.println("The number is negative.");
        if (number3 == 0) System.out.println("The number is not positive nor negative.");
    }

    public static void equalNumbers(int number1, int number2, int number3) {
        if (number1 == number2) System.out.println("Number 1 is equal to number 2.");
        if (number1 == number3) System.out.println("Number 1 is equal to number 3.");
        if (number2 == number3) System.out.println("Number 2 is equal to number 3.");
    }

    public static void averageValue(int number1, int number2) {
        int result = (number1 + number2) / 2;
        System.out.println("The average value is: " + result);
    }
    public static void totalSum(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("The total sum is: " + result);
    }


    {

    }

}