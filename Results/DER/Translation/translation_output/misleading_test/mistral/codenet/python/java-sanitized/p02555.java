import java.util.*;

public class p02555 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s < 3) {
            System.out.println(0);
            return;
        }
        int n = s / 3;
        long mod = 1000000007;
        int[] fact = new int[(2 * s + 1)];
        Arrays.fill(fact, 1);
        int[] inv = new int[(2 * s + 1)];
        Arrays.fill(inv, 1);
        for (int i = 2; i <= 2 * s; i++) {
            fact[i] = i * fact[i - 1] % mod;
        }
        inv[fact.length - 1] = pow(fact[fact.length - 1], -1, mod);
        for (int i = fact.length - 1; i >= 1; i--) {
            inv[i - 1] = inv[i] * i % mod;
        }
        long ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1)) % mod;
        }
        System.out.println(ans);
    }

    public static long comb(int x, int y) {
        return (fact[x] * inv[y] * inv[x - y] % mod) % mod;
    }

    public static long pow(long a, long b, long mod) {
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b = b >> 1;
        }
        return res;
    }
}