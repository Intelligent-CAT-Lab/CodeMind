import java.util.Scanner;

public class p02769 {
    private static final int mod = 1_000_000_007;

    private static int i1() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] i2() {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");
        int[] nums = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            nums[i] = Integer.parseInt(tokens[i]);
        }
        return nums;
    }

    private static long bp(long a, long n) {
        long r = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                r = (r * a) % mod;
            }
            a = (a * a) % mod;
            n >>= 1;
        }
        return r;
    }

    public static void main(String args[]) {
        int[] input = i2();
        int n = input[0];
        int k = input[1];
        if (n <= k) {
            long x = 1;
            for (int i = 0; i < n - 1; i++) {
                x *= (2L * n - 1 - i);
                x %= mod;
            }
            long y = 1;
            for (int i = 0; i < n - 1; i++) {
                y *= (i + 1);
                y %= mod;
            }
            // 10**9+5 in Python is equivalent to modular inverse mod-2 in Java
            System.out.println((x * bp(y, mod - 2)) % mod);
        } else {
            long x = 1;
            long y = 1;
            long t = 1;
            for (int i = 0; i < k; i++) {
                t *= (i + 1);
                t %= mod;
                y *= (n - 1 - i);
                y %= mod;
                y *= (n - i);
                y %= mod;
                long c = bp(t, mod - 2);
                x += (y * c * c) % mod;
                x %= mod;
            }
            System.out.println(x);
        }
    }
}