import java.util.*;
public class p03083 {
    static int mod = 100000007;
    static long[] fact = new long[200005];
    static long[] invf = new long[200005];
    static long[] bina = new long[200005];
    static long[] invb = new long[200005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int W = sc.nextInt();
        fact[0] = 1;
        invf[0] = 1;
        for (int i = 1; i <= B + W; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
            invf[i] = inv(fact[i]);
        }
        bina[0] = 1;
        invb[0] = 1;
        for (int i = 1; i <= B + W; i++) {
            bina[i] = (bina[i - 1] * 2) % mod;
            invb[i] = inv(bina[i]);
        }
        if (B == W) {
            for (int i = 0; i < B + W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            for (int i = 0; i < W; i++) {
                System.out.println(invf[2]);
            }
            long P = invf[2];
            for (int i = W + 1; i <= B; i++) {
                long F = (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                F = (F * invb[i]) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
            for (int i = B + 1; i <= B + W; i++) {
                long F = (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                F = (F * (mod - 1)) % mod;
                F = (F * invb[i]) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
        } else {
            for (int i = 0; i < B; i++) {
                System.out.println(invf[2]);
            }
            long P = invf[2];
            for (int i = B + 1; i <= W; i++) {
                long F = (fact[i - 2] * invf[i - 1 - B] * invf[B - 1]) % mod;
                F = (F * (mod - 1)) % mod;
                F = (F * invb[i]) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
            for (int i = W + 1; i <= B + W; i++) {
                long F = (fact[i - 2] * invf[i - 1 - B] * invf[B - 1]) % mod;
                F = (F * invb[i]) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
        }
    }
    static long inv(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l!= 0) {
            long x1 = y, y1 = x - u * (k / l);
            long u1 = u, v1 = v, k1 = l, l1 = k % l;
            x = x1;
            y = y1;
            u = u1;
            v = v1;
            k = k1;
            l = l1;
        }
        return (x + mod) % mod;
    }
}