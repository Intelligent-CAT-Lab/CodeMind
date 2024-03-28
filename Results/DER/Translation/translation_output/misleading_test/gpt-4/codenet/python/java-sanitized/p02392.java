import java.util.Scanner;

public class p02392 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integers from the input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Check if a < b < c and print the result
        if (a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}