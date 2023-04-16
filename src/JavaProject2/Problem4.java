package JavaProject2;

public class Problem4 {
    public static void main(String[] args) {

        /*

        Create a 2D array of integers. Develop a program which will calculate the sum of even
        and odd numbers for that array.
         */

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };

        int evenS = 0;
        int oddS = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    evenS += numbers[i][j];
                } else {
                    oddS += numbers[i][j];
                }
            }
        }
        System.out.println("Even numbers: "+ evenS);
        System.out.println("Odd number: "+ oddS);

    }
}
