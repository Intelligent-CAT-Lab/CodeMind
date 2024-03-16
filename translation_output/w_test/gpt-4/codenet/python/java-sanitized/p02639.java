import java.util.Scanner;

public class p02639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] xList = new int[5];

        // Read integers from input
        for (int i = 0; i < 5; i++) {
            xList[i] = scanner.nextInt();
        }

        // Look for the zero and output its position
        for (int i = 0; i < 5; i++) {
            if (xList[i] == 0) {
                System.out.println(i + 1);
                break; // Stop after finding the first zero.
            }
        }
        
        scanner.close(); // Close the scanner
    }
}