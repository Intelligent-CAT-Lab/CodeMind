import java.util.Scanner;
import java.math.BigInteger;

public class p00993 {
    public static void main(String[] args) {
        // Calculate the factorial of 1500 and add 2, then print the result
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= 1500; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial.add(BigInteger.valueOf(2)));

        // Reading input from the user
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Print i+1 for each i in range 1 to n (inclusive)
        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
        scanner.close();
    }
}