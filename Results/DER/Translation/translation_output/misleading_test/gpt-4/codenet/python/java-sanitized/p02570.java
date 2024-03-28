import java.util.Scanner;

public class p02570 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading integers from a single line of input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Calculating the result and printing "Yes" or "No"
        if ((double) a / b <= c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}