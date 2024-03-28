import java.util.Scanner;

public class p02765 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting input from the user
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        // Condition and output
        if (n < 10) {
            int result = r + 100 * (10 - n);
            System.out.println(result);
        } else {
            System.out.println(r);
        }

        // Close the scanner
        scanner.close(); 
    }
}