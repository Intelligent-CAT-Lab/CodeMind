import java.util.Scanner;

public class p02335 {
    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = (int) Math.pow(10, n) % MOD;
        result = (result * factorial(n)) / factorial(n - k);
        result = (result * factorial(k)) / factorial(k);
        result = (result * factorial(n + k - 1)) / factorial(k);

        System.out.println(result);
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}