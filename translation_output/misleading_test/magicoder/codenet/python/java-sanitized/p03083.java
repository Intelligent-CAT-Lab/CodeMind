import java.util.*;

public class p03083 {
    static long mod = (long) Math.pow(10, 9) + 7;
    static long[] fact, invf, bina, invb;

    static long doubling(long n, long m) {
        long y = 1;
        long base = n;
        while (m != 0) {
            if (m % 2 == 1) {
                y *= base;
                y %= mod;
            }
            base *= base;
            base %= mod;
            m /= 2;
        }
        return y;
    }

    static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            long t = k / l;
            x -= u * t;
            y -= v * t;
            k -= t * l;
            long temp = u;
            u = x;
            x = temp;
            temp = v;
            v = y;
            y = temp;
            l = k % l;
        }
        return x % mod;
    }

    static void preprocess(int B, int W) {
        fact = new long[B + W + 1];
        invf = new long[B + W + 1];
        bina = new long[B + W + 1];
        invb = new long[B + W + 1];
        fact[0] = 1;
        invf[B + W] = inved(fact[B + W]);
        for (int i = B + W; i > 0; i--) {
            invf[i - 1] = (invf[i] * i) % mod;
        }
        bina[0] = 1;
        invb[B + W] = inved(bina[B + W]);
        for (int i = B + W; i > 0; i--) {
            invb[i - 1] = (invb[i] * 2) % mod;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int W = sc.nextInt();
        preprocess(B, W);
        for (int i = 1; i <= B + W; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
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
            for (int i = W + 1; i <= B + 1; i++) {
                long F = (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                F = (F * invb[i]) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
            for (int i = B + 2; i <= B + W + 1; i++) {
                long F = (invf[i - 1 - B] * invf[B - 1]) % mod;
                F = (F * fact[i - 2]) % mod;
                F = (F * (mod - 1)) % mod;
                F = (F + (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod) % mod;
                F = (F * inv