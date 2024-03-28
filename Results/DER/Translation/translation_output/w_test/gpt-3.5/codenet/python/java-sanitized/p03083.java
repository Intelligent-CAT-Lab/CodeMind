import java.util.Scanner;

public class p03083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int W = scanner.nextInt();
        int mod = (int) 1e9 + 7;

        long[] fact = new long[B + W + 1];
        long[] invf = new long[B + W + 1];
        long[] bina = new long[B + W + 1];
        long[] invb = new long[B + W + 1];

        for (int i = 0; i < B + W + 1; i++) {
            fact[i] = 1;
            invf[i] = 1;
            bina[i] = 1;
            invb[i] = 1;
        }

        for (int i = 1; i <= B + W; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }

        invf[B + W] = inved(fact[B + W], mod);
        for (int i = B + W - 1; i >= 0; i--) {
            invf[i] = (invf[i + 1] * (i + 1)) % mod;
        }

        for (int i = 1; i <= B + W; i++) {
            bina[i] = (bina[i - 1] * 2) % mod;
        }

        invb[B + W] = inved(bina[B + W], mod);
        for (int i = B + W - 1; i >= 0; i--) {
            invb[i] = (invb[i + 1] * 2) % mod;
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
                long F = ((fact[i - 2] * invf[i - 1 - W] % mod) * invf[W - 1]) % mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
            for (int i = B + 1; i <= B + W; i++) {
                long F = (invf[i - 1 - B] * invf[B - 1]) % mod;
                F *= fact[i - 2];
                F %= mod;
                F *= (mod - 1);
                F += ((fact[i - 2] * invf[i - 1 - W] % mod) * invf[W - 1]) % mod;
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
        } else {
            for (int i = 0; i < B; i++) {
                System.out.println(invf[2]);
            }
            long P = invf[2];
            for (int i = B + 1; i <= W; i++) {
                long F = (fact[i - 2] * invf[i - 1 - B]) % mod;
                F *= (mod - 1);
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
            for (int i = W + 1; i <= B + W; i++) {
                long F = (invf[i - 1 - B] * invf[B - 1]) % mod;
                F *= fact[i - 2];
                F %= mod;
                F *= (mod - 1);
                F += ((fact[i - 2] * invf[i - 1 - W] % mod) * invf[W - 1]) % mod;
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
        }
    }

    public static long inved(long a, int mod) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            long temp1 = x, temp2 = y;
            x = u;
            y = v;
            u = temp1 - u * (k / l);
            v = temp2 - v * (k / l);
            long temp3 = k;
            k = l;
            l = temp3 % l;
        }
        return (x % mod + mod) % mod;
    }
}