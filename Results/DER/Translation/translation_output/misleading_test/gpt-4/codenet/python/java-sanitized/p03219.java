import java.util.Scanner;

public class p03219 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading two integer inputs from the user
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();
        
        // Calculating the fare based on the provided logic
        int fare = (int) (ab + bc / 2.0);
        
        // Printing the result
        System.out.println(fare);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}