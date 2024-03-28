import java.math.BigInteger;
import java.util.Scanner;

public class p00993 {
    public static void main(String[] args) {
        // Calculate the product of all numbers from 1 to 1500 and add 2
        BigInteger product = BigInteger.ONE; // To hold large product value
        for (int i = 1; i <= 1500; i++) {
            product = product.multiply(BigInteger.valueOf(i));
        }
        product = product.add(BigInteger.valueOf(2)); // Adding 2 to the product
        System.out.println(product);

        // Use Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= inputNumber; i++) {
            System.out.println(i + 1); // Print each number incremented by 1
        }
        scanner.close(); // Close the scanner object
    }
}