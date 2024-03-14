import java.util.Scanner;

public class p02335 {
    static long MOD = (long)Math.pow(10,9)+7;

    static long P(long n, long r) {
        return factorial(n) / factorial(n-r);
    }

    static long factorial(long n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * i) % MOD;
        }
        return result;
    }

    static long C(long n, long r) {
        return P(n,r) / factorial(r);
    }

    static long H(long n, long r) {
        return C(n+r-1,r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        if (n < k) {
            System.out.println(C(k,n) % MOD);
        } else if (n > k) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}