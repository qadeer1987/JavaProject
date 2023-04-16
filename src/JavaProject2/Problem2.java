package JavaProject2;

public class Problem2 {
    public static void main(String[] args) {

        /*
        Create an array of integer values. After the array is created,
        calculate the sum of all stored elements in that array.
         */

        int[] listOfNumbers = {12, 12, 13, 25, 35, 40, 34, 38, 49, 90};

        int sum = 0;
        for (int i = 0; i < listOfNumbers.length; i++) {
            sum += listOfNumbers[i];

        }
        System.out.println("The sum of numbers in the array equals to "+ sum);
    }
}
