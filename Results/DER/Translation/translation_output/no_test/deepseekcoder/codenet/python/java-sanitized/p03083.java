import java.util.Scanner;

public class p03083 {
    static int B, W;
    static long mod = (long)Math.pow(10, 9) + 7;

    static long doubling(long n, long m) {
        long y = 1;
        long base = n;
        while (m != 0) {
            if (m % 2 == 1) {
                y = (y * base) % mod;
            }
            base = (base * base) % mod;
            m /= 2;
        }
        return y;
    }

    static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            long q = k / l;
            long tmp = l;
            l = k - q * l;
            k = tmp;
            tmp = u;
            u = x - q * u;
            x = tmp;
        }
        return x < 0 ? x + mod : x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        W = scanner.nextInt();

        long[] fact = new long[B+W+1];
        long[] invf = new long[B+W+1];
        long[] bina = new long[B+W+1];
        long[] invb = new long[B+W+1];

        fact[0] = 1;
        for (int i = 1; i <= B+W; i++) {
            fact[i] = (fact[i-1] * i) % mod;
        }
        invf[B+W] = inved(fact[B+W]);
        for (int i = B+W-1; i >= 0; i--) {
            invf[i] = (invf[i+1] * (i+1)) % mod;
        }
        bina[0] = 1;
        for (int i = 1; i <= B+W; i++) {
            bina[i] = (bina[i-1] * 2) % mod;
        }
        invb[B+W] = inved(bina[B+W]);
        for (int i = B+W-1; i >= 0; i--) {
            invb[i] = (invb[i+1] * 2) % mod;
        }

        if (B == W) {
            for (int i = 0; i < B+W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            for (int i = 0; i < W; i++) {
                System.out.println(invf[2]);
            }
            long P = invf[2];
            for (int i = W+1; i <= B+1; i++) {
                long F = (fact[i-2] * invf[i-1-W] * invf[W-1]) % mod;
                F = (F * invb[i]) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
            for (int i = B+2; i <= B+W+1; i++) {
                long F = (invf[i-1-B] * invf[B-1]) % mod;
                F = (F * (fact[i-2] * (mod - 1))) % mod;
                F = (F * invb[i]) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
        } else if (B < W) {
            for (int i = 0; i < B; i++) {
                System.out.println(invf[2]);
            }
            long P = invf[2];
            for (int i = B