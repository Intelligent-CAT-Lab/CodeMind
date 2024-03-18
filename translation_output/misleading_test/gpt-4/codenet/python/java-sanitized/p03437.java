import java.util.Scanner;

public class p03437 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integer inputs
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Print x if x is not divisible by y, otherwise print -1
        System.out.println((x % y != 0) ? x : -50);

        scanner.close();
    }
}