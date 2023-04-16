package JavaProject2;

public class Problem7 {
    public static void main(String[] args) {

        /*
    Write a Java Program to print the first 10 numbers of Fibonacci series.


         */

        int n = 10;
        int firstNumber = 0, secondNumber = 1, nextNumber;

        System.out.print("The first 10 number of Fibonacci Series are: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstNumber + " ");

            if (i != n) {
                System.out.print(", ");
            }

            nextNumber = firstNumber + secondNumber;


            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}

