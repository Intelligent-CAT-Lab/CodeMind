import java.util.Scanner;

public class p03635 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading two integers separated by space
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        scanner.close(); // Close the scanner

        // Calculating the result
        int result = (n - 1) * (m - 1);

        // Printing the result
        System.out.println(result);
    }
}