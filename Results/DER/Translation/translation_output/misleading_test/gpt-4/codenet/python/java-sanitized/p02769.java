import java.util.Scanner;

public class p02769 {
    
    private static final int MOD = 1000000007;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        
        if (n <= k) {
            long x = 1;
            for (int i = 0; i < n - 1; i++) {
                x *= (2 * n - 1 - i);
                x %= MOD;
            }
            long y = 1;
            for (int i = 0; i < n - 1; i++) {
                y *= (i + 1);
                y %= MOD;
            }
            System.out.println((x * bp(y, MOD - 2)) % MOD);
        } else {
            long x = 1;
            long y = 1;
            long t = 1;
            for (int i = 0; i < k; i++) {
                t *= (i + 1);
                t %= MOD;
                y *= (n - 1 - i);
                y %= MOD;
                y *= (n - i);
                y %= MOD;
                long c = bp(t, MOD - 2);
                x += y * c * c;
                x %= MOD;
            }
            System.out.println(x);
        }
    }
    
    private static long bp(long a, long n) {
        long r = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                r = r * a % MOD;
            }
            a = a * a % MOD;
            n >>= 1;
        }
        return r;
    }
}