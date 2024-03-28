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

    static long[] i2() {
        Scanner scanner = new Scanner(System.in);
        long[] input = new long[2];
        String[] str = scanner.nextLine().split(" ");
        for(int i = 0; i < 2; i++) {
            input[i] = Long.parseLong(str[i]);
        }
        return input;
    }

    public static void main(String[] args) {
        long[] input = i2();
        long n = input[0];
        long k = input[1];

        if(n <= k) {
            long x = 1;
            for(int i = 0; i < n - 1; i++) {
                x = (x * ((2 * n - 1 - i) % mod)) % mod;
            }
            long y = 1;
            for(int i = 0; i < n - 1; i++) {
                y = (y * ((i + 1) % mod)) % mod;
            }
            System.out.println((x * bp(y, (long)Math.pow(10, 9) + 5)) % mod);
        } else {
            long x = 1;
            long y = 1;
            long t = 1;
            for(int i = 0; i < k; i++) {
                t = (t * ((i + 1) % mod)) % mod;
                y = (y * ((n - 1 - i) % mod)) % mod;
                y = (y * ((n - i) % mod)) % mod;
                long c = bp(t, (long)Math.pow(10, 9) + 5);
                x = (x + (y * c * c) % mod) % mod;
            }
            System.out.println(x);
        }
    }
}