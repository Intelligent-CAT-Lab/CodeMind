import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the input
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        scanner.close(); // Close the scanner
        
        // Printing the result of ceiling division
        System.out.println((int) Math.ceil((double) h / a));
    }
}