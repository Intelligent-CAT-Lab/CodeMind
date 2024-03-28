import java.util.Scanner;

public class p02388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int x = scanner.nextInt();

        System.out.println(x * x * x);

        scanner.close(); // Remember to close the scanner to avoid resource leaks.
    }
}