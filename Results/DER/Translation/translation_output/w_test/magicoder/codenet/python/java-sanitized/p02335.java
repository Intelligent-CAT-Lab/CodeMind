import java.util.Scanner;

public class p02335 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        long MOD = (long) Math.pow(10, 9) + 7;
        long P = factorial(k) / factorial(k - n);
        long C = P / factorial(n);
        long H = C(n + k - 1, k);

        if (n < k) {
            System.out.println(C % MOD);
        } else if (n > k) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long C(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}