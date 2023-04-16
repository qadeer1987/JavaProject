package JavaProject2;

public class Problem10 {
    public static void main(String[] args) {

        String[] myArray = {"January", "March", "October", "March", "June", "January", "June", "December"};

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {

                if (myArray[i].equals(myArray[j])) {
                    System.out.println("Duplicate element: " + myArray[i]);
                }
            }
        }
    }
}
