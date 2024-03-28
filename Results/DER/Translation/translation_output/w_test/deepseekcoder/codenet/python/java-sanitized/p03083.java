import java.util.Scanner;

public class p03083 {
    static int B, W;
    static long mod = (long)Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        W = scanner.nextInt();
        solve();
    }

    static void solve() {
        if (B == W) {
            for (int i = 0; i < B + W; i++) {
                System.out.println(inved(2));
            }
        } else if (B > W) {
            long P = inved(2);
            for (int i = 0; i < W; i++) {
                System.out.println(P);
            }
            for (int i = W + 1; i <= B; i++) {
                long F = (fact(i - 2) * invf(i - 1 - W) * invf(W - 1)) % mod;
                F = (F * invb(i)) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
            for (int i = B + 1; i <= B + W; i++) {
                long F = (invf(i - 1 - B) * invf(B - 1)) % mod;
                F = (F * fact(i - 2)) % mod;
                F = (F * (mod - 1)) % mod;
                F = (F * invb(i)) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
        } else if (B < W) {
            long P = inved(2);
            for (int i = 0; i < B; i++) {
                System.out.println(P);
            }
            for (int i = B + 1; i <= W; i++) {
                long F = (fact(i - 2) * invf(i - 1 - B) * invf(B - 1)) % mod;
                F = (F * (mod - 1)) % mod;
                F = (F * invb(i)) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
            for (int i = W + 1; i <= B + W; i++) {
                long F = (invf(i - 1 - B) * invf(B - 1)) % mod;
                F = (F * fact(i - 2)) % mod;
                F = (F * (mod - 1)) % mod;
                F = (F * invb(i)) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
        }
    }

    static long fact(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = (result * i) % mod;
        }
        return result;
    }

    static long invf(int n) {
        return inved(fact(n));
    }

    static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k, l = a;
        while (l != 0) {
            k = (mod / l);
            l = mod % l;
            x -= (u * k);
            y -= (v * k);
            u = x;
            v = y;
        }
        return x < 0 ? x + mod : x;