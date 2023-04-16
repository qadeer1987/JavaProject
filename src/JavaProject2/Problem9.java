package JavaProject2;

public class Problem9 {
    public static void main(String[] args) {

        int[][] arr = {
                {11, 21, 57},
                {55, 78, 6},
                {17, 18, 29}

        };

        int largest = arr[0][0];
        int secondLargest = arr[0][0];
        for (int[] row : arr) {
            for (int num : row) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }
        }

        System.out.println("2D array:");
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("Second largest number in the array: " + secondLargest);
    }

    }

