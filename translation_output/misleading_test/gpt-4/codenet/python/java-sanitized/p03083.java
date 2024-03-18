import java.util.Scanner;

public class p03083 {
    private static final int MOD = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int W = scanner.nextInt();
        
        long[] fact = new long[B + W + 1];
        long[] invf = new long[B + W + 1];
        long[] bina = new long[B + W + 1];
        long[] invb = new long[B + W + 1];

        fact[0] = 1;
        for (int i = 0; i < B + W; i++) {
            fact[i + 1] = (fact[i] * (i + 1)) % MOD;
        }
        
        invf[B + W] = inved(fact[B + W]);
        for (int i = B + W; i > 0; i--) {
            invf[i - 1] = (invf[i] * i) % MOD;
        }
        
        bina[0] = 1;
        for (int i = 0; i < B + W; i++) {
            bina[i + 1] = (bina[i] * 2) % MOD;
        }
        
        invb[B + W] = inved(bina[B + W]);
        for (int i = B + W; i > 0; i--) {
            invb[i - 1] = (invb[i] * 2) % MOD;
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
                long F = (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % MOD;
                F *= invb[i];
                F %= MOD;
                F += P;
                F %= MOD;
                System.out.println(F);
                P = F;
            }
            for (int i = B + 1; i <= B + W; i++) {
                long F = invf[i - 1 - B] * invf[B - 1];
                F %= MOD;
                F *= fact[i - 2];
                F %= MOD;
                F *= (MOD - 1);
                F += (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % MOD;
                F %= MOD;
                F *= invb[i];
                F %= MOD;
                F += P;
                F %= MOD;
                System.out.println(F);
                P = F;
            }
        } else {
            for (int i = 0; i < B; i++) {
                System.out.println(invf[2]);
            }
            long P = invf[2];
            for (int i = B + 1; i <= W; i++) {
                long F = (fact[i - 2] * invf[i - 1 - B] * invf[B - 1]) % MOD;
                F *= (MOD - 1);
                F %= MOD;
                F *= invb[i];
                F %= MOD;
                F += P;
                F %= MOD;
                System.out.println(F);
                P = F;
            }
            for (int i = W + 1; i <= B + W; i++) {
                long F = invf[i - 1 - B] * invf[B - 1];
                F %= MOD;
                F *= fact[i - 2];
                F %= MOD;
                F *= (MOD - 1);
                F += (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % MOD;
                F %= MOD;
                F *= invb[i];
                F %= MOD;
                F += P;
                F %= MOD;
                System.out.println(F);
                P = F;
            }
        }
        scanner.close();
    }

    private static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = MOD;
        while (l != 0) {
            long q = k / l;
            long temp = u;
            u = x - u * q;
            x = temp;
            temp = v;
            v = y - v * q;
            y = temp;
            temp = l;
            l = k % l;
            k = temp;
        }
        return (x % MOD + MOD) % MOD;
    }
}