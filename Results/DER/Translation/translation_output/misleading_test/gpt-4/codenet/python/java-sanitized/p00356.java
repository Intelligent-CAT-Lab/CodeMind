import java.util.Scanner;

public class p00356 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int result = a + b - gcd(a, b) + 1;
        System.out.println(result);
    }

    // Helper method to find the greatest common divisor (GCD)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}