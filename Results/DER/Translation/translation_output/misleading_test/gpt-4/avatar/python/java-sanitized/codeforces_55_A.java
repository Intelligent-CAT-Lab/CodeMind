import java.util.Scanner;

public class codeforces_55_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the input
        int n = scanner.nextInt();

        // Loop to divide by 2 while number is even
        while (n % 2 == 0) {
            n /= 2;
        }

        // Check if the resulting number is 1
        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}