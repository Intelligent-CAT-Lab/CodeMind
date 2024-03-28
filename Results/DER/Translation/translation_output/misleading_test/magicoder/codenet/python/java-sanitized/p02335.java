import java.util.Scanner;

public class p02335 {
    static final long MOD = (long) Math.pow(10,9)+7;

    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++)
            result = (result * i) % MOD;
        return result;
    }

    static long P(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    static long C(int n, int r) {
        return P(n, r) / factorial(r);
    }

    static long H(int n, int r) {
        return C(n + r - 1, r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (n < k) {
            System.out.println(C(k, n) % MOD);
        } else if (n > k) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}