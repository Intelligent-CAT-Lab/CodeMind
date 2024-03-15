import java.util.Scanner;

public class p03740 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading two integers separated by a space
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Checking the condition and printing the result
        if (Math.abs(x - y) <= 1) {
            System.out.println("Brown");
        } else {
            System.out.println("Alice");
        }

        scanner.close();
    }
}