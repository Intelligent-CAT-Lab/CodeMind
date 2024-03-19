import java.util.*;

public class p03083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int W = sc.nextInt();
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
            fact[i] = (fact[i - 1] * i) % mod;
        }
        invf[B + W] = inved(fact[B + W]);
        for (int i = B + W; i >= 1; i--) {
            invf[i - 1] = (invf[i] * i) % mod;
        }
        for (int i = B + W; i >= 1; i--) {
            bina[i] = (bina[i - 1] * 2) % mod;
        }
        invb[B + W] = inved(bina[B + W]);
        for (int i = B + W; i >= 1; i--) {
            invb[i - 1] = (invb[i] * 2) % mod;
        }
        if (B == W) {
            for (int i = 1; i <= B + W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            for (int i = 1; i <= W; i++) {
                System.out.println(invf[2]);
            }
            int P = invf[2];
            for (int i = 3; i <= B + W; i++) {
                int F = (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                F *= bina[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
            for (int i = 1; i <= B; i++) {
                System.out.println(invf[i - 1 - B]);
            }
            int P = invf[1 - B];
            for (int i = 2; i <= B + W; i++) {
                int F = (fact[i - 2] * invf[i - 1 - B] * invf[B - 1]) % mod;
                F *= bina[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
        } else {
            for (int i = 1; i <= B; i++) {
                System.out.println(invf[2]);
            }
            int P = invf[2];
            for (int i = 3; i <= B + W; i++) {
                int F = (fact[i - 2] * invf[i - 1 - B] * invf[B - 1]) % mod;
                F *= bina[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
            for (int i = 1; i <= W; i++) {
                System.out.println(invf[i - 1 -