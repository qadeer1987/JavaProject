package JavaProject2;

public class Problem1 {
    /*
    Create a program that uses an array to store a list of temperatures for a week,
    and then uses a loop to find the highest and lowest temperature for the week.
     */

    public static void main(String[] args) {

        int[] temperatures = {78, 74, 86, 82, 71, 75, 80};

        int highTemp = temperatures[0];
        int lowTemp = temperatures[0];

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > highTemp) {
                highTemp = temperatures[i];
            }
            if (temperatures[i] < lowTemp) {
                lowTemp = temperatures[i];
            }
        }
        System.out.println("Highest temperature is "+ highTemp);
        System.out.println("Lowest temperature is "+ lowTemp);
    }
}
