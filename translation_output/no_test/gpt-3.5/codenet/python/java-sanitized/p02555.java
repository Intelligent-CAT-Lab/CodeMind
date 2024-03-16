import java.util.Scanner;

public class p02555 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s < 3) {
            System.out.println(0);
            return;
        }
        int n = s / 3;
        int mod = 1000000007;
        long[] fact = new long[2 * s + 1];
        long[] inv = new long[2 * s + 1];
        fact[0] = 1;
        for (int i = 1; i <= 2 * s; i++) {
            fact[i] = (long) i * fact[i - 1] % mod;
        }
        inv[2 * s] = pow(fact[2 * s], mod - 2, mod);
        for (int i = 2 * s - 1; i >= 0; i--) {
            inv[i] = inv[i + 1] * (long) (i + 1) % mod;
        }
        long ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1, fact, inv, mod)) % mod;
        }
        System.out.println(ans);
    }
    
    public static long pow(long base, int exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }

    public static long comb(int x, int y, long[] fact, long[] inv, int mod) {
        if (x < y || y < 0) {
            return 0;
        }
        return fact[x] * inv[y] % mod * inv[x - y] % mod;
    }
}