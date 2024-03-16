import java.util.Scanner;

public class p02831 {

    // Calculate Greatest Common Divisor (GCD) using the Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    // Calculate Least Common Multiple (LCM)
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");

        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);

        System.out.println(lcm(A, B));
        scanner.close();
    }
}