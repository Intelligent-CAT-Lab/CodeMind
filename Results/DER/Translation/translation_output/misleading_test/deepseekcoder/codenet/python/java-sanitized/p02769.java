import java.util.Scanner;

public class p02769 {
    static long mod = (long)Math.pow(10, 9) + 7;

    static long bp(long a, long n) {
        long r = 1;
        while(n > 0) {
            if(n % 2 == 1) {
                r = (r * a) % mod;
            }
            a = (a * a) % mod;
            n >>= 1;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();

        if(n <= k) {
            long x = 1;
            for(int i = 0; i < n - 1; i++) {
                x = (x * (2 * n - 1 - i)) % mod;
            }
            long y = 1;
            for(int i = 0; i < n - 1; i++) {
                y = (y * (i + 1)) % mod;
            }
            System.out.println((x * bp(y, (long)Math.pow(10, 9) + 5)) % mod);
        } else {
            long x = 1;
            long y = 1;
            long t = 1;
            for(int i = 0; i < k; i++) {
                t = (t * (i + 1)) % mod;
                y = (y * (n - 1 - i)) % mod;
                y = (y * (n - i)) % mod;
                long c = bp(t, (long)Math.pow(10, 9) + 5);
                x = (x + y * c * c) % mod;
            }
            System.out.println(x);
        }
    }
}