import java.util.Scanner;
import java.math.BigInteger;

public class p02769 {
    static final long mod = 1000000007L;

    // Utility function to read an integer from stdin
    public static int i1() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // Utility function to read an array of integers from stdin
    public static int[] i2() {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");
        return new int[] { Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]) };
    }

    // Binary power function modulo mod
    public static long bp(long a, long n) {
        long r = 1L;
        while (n > 0) {
            if (n % 2 == 1) {
                r = r * a % mod;
            }
            a = a * a % mod;
            n >>= 1;
        }
        return r;
    }

    public static void main(String[] args) {
        int[] input = i2();
        int n = input[0];
        int k = input[1];

        if (n <= k) {
            long x = 1L;
            for (int i = 0; i < n - 1; i++) {
                x *= (2 * n - 1 - i);
                x %= mod;
            }
            long y = 1L;
            for (int i = 0; i < n - 1; i++) {
                y *= (i + 1);
                y %= mod;
            }
            System.out.println((x * bp(y, mod - 2)) % mod);
        } else {
            long x = 1L;
            long y = 1L;
            long t = 1L;
            for (int i = 0; i < k; i++) {
                t *= (i + 1);
                t %= mod;
                y *= (n - 1 - i);
                y %= mod;
                y *= (n - i);
                y %= mod;
                long c = bp(t, mod - 2);
                x += y * c % mod * c;
                x %= mod;
            }
            System.out.println(x);
        }
    }
}