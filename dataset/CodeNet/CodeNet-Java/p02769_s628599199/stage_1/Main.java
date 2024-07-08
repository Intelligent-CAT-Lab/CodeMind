import java.util.Scanner;

public class Main {
    static int mod = 1000000007;
    static long[] nFactorial;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n, k;

        n = cin.nextInt();
        k = cin.nextInt();

        if (k >= n - 1) {
            System.out.println(choose(2 * n - 1, n -1));
        } else {
            long sum = 0;
            nFactorial = new long[n];
            fill();
            for (int i = 0; i <= k; i++) {
                sum = (sum + term(n, i)) % mod;
                sum %= mod;
            }
            System.out.println(sum);
        }
    }

    public static long pow(long n, int m) {
        long prod = 1;
        while (m > 0) {
            if ((m & 1) == 1) {
                prod = (prod * n) % mod;
            }
            n = (n*n) % mod;
            m >>= 1;
        }
        return prod;
    }

    public static void fill () {
        nFactorial[0] = 1;
        for (int i = 1; i < nFactorial.length; i++) {
            nFactorial[i] = (nFactorial[i - 1] * i) % mod;
        }
    }

    public static long choose(int a, int b) {
        long numerator = 1;
        long denominator = 1;
        for (int i = 1; i <= b; i++) {
            numerator *= a - i + 1;
            denominator *= b - i + 1;
            numerator %= mod;
            denominator %= mod;
        }
        return (numerator * pow(denominator, mod - 2)) % mod;
    }

    public static long term(int n, int i) {
        long numerator = 1;
        long denominator = 1;
        numerator = (n * pow(nFactorial[n - 1], 2)) % mod;
        denominator = (((n - i) * pow(nFactorial[i], 2)) % mod * pow(nFactorial[n - i - 1], 2)) % mod;
        return (numerator * pow(denominator, mod - 2)) % mod;
    }
}
























