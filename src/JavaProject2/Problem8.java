package JavaProject2;

public class Problem8 {
    public static void main(String[] args) {

        // Maximum and minimum number in the array?

        int[][] arr = {
                {11, 21, 57},
                {55, 78, 6},
                {17, 18, 29}

        };

        int max = arr[0][0];
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        System.out.println("2D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The largest number in the array: " + max);
        System.out.println("The smallest in the array: " + min);

    }
}
