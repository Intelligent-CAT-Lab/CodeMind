import java.util.Scanner;

public class p02389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Using scanner to get input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        // Performing calculations
        int product = a * b;
        int perimeter = (a + b) * 2;

        // Printing the results
        System.out.println(product + " " + perimeter);
    }
}