import java.util.Scanner;

public class p02439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the inputs
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Implementing the logic similar to the provided Python code
        if (a < b) {
            if (c < a) {
                System.out.println(c + " " + b);
            } else if (b < c) {
                System.out.println(a + " " + c);
            } else {
                System.out.println(a + " " + b);
            }
        } else {
            if (c < b) {
                System.out.println(c + " " + a);
            } else if (a < c) {
                System.out.println(b + " " + c);
            } else {
                System.out.println(b + " " + a);
            }
        }
        
        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}