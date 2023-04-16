package JavaProject2;

public class Problem5 {
    public static void main(String[] args) {

        //Write a program to swap 2 numbers without a temporary variable.

        int x = 15;
        int y = 30;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("- - - - - - - - - - ");

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
