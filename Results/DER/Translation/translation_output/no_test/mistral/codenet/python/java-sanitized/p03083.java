import java.util.*;

public class p03083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B, W;
        B = sc.nextInt();
        W = sc.nextInt();
        int mod = (int) 1e9 + 7;
        int fact[] = new int[B + W + 1];
        int invf[] = new int[B + W + 1];
        int bina[] = new int[B + W + 1];
        int invb[] = new int[B + W + 1];
        Arrays.fill(fact, 1);
        Arrays.fill(invf, 1);
        Arrays.fill(bina, 1);
        Arrays.fill(invb, 1);
        for (int i = 1; i <= B + W; i++) {
            fact[i] = (fact[i - 1] * (i + 1)) % mod;
            invf[i] = inved(fact[i]);
            bina[i] = (bina[i - 1] * 2) % mod;
            invb[i] = inved(bina[i]);
        }
        int invp = inved(fact[B + W - 2]);
        int p = invp * 2;
        int q = mod - 1;
        int r = 0;
        if (B == W) {
            for (int i = 1; i <= B + W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            for (int i = 1; i <= W; i++) {
                System.out.println(invf[2]);
            }
            for (int i = 1; i <= B + W - W; i++) {
                int f = (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                f *= bina[i];
                f %= mod;
                f += p;
                f %= mod;
                System.out.println(f);
                p = f;
            }
            for (int i = 1; i <= B + W; i++) {
                int f = invf[i - 1 - B] * invf[B - 1];
                f %= mod;
                f *= fact[i - 2];
                f %= mod;
                f *= q;
                f += (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                f %= mod;
                f *= bina[i];
                f %= mod;
                f += p;
                f %= mod;
                System.out.println(f);
                p = f;
            }
        } else {
            for (int i = 1; i <= B; i++) {
                System.out.println(invf[2]);
            }
            for (int i = 1; i <= B + W - B; i++) {
                int f = (fact[i - 2] * invf[i - 1 - B] * invf[B - 1]) % mod;
                f *= bina[i];
                f %= mod;
                f += p;
                f %= mod;
                System.out.println(f);
                p = f;
            }
            for (int i = 1; i <= W + B; i++) {
                int f = invf[i - 1 - B] * invf[B - 1];
                f %= mod;
                f *= fact[i - 2];
                f %= mod;
                f *= q;
                f += (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                f %= mod;
                f *= bina[i];
                f %= mod;
                f += p;
                f