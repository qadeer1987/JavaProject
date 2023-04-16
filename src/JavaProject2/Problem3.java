package JavaProject2;

public class Problem3 {
    public static void main(String[] args) {

        /*
        Create a 2D array or integer type where you will store odd and even numbers.
         Develop a program which will identify/print the even numbers only.
         */

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println("List of even numbers from the 2D array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");

                }
            }
        }
    }
}