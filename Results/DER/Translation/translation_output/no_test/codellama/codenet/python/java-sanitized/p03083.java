import java.util.Scanner;

public class p03083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int W = scanner.nextInt();
        int mod = (int) (1e9 + 7);

        int[] fact = new int[B + W + 1];
        int[] invf = new int[B + W + 1];
        for (int i = 0; i <= B + W; i++) {
            fact[i] = 1;
            invf[i] = 1;
        }

        for (int i = 1; i <= B + W; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
            invf[i] = (invf[i - 1] * (mod - i)) % mod;
        }

        int[] bina = new int[B + W + 1];
        int[] invb = new int[B + W + 1];
        for (int i = 0; i <= B + W; i++) {
            bina[i] = 1;
            invb[i] = 1;
        }

        for (int i = 1; i <= B + W; i++) {
            bina[i] = (bina[i - 1] * 2) % mod;
            invb[i] = (invb[i - 1] * (mod - 2)) % mod;
        }

        if (B == W) {
            for (int i = 0; i <= B + W; i++) {
                System.out.println(invf[2]);
            }
        } else if (B > W) {
            for (int i = 0; i < W; i++) {
                System.out.println(invf[2]);
            }
            int P = invf[2];
            for (int i = W + 1; i <= B; i++) {
                int F = (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                F = (F * invb[i]) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
            for (int i = B + 1; i <= B + W; i++) {
                int F = (invf[i - 1 - B] * invf[B - 1]) % mod;
                F = (F * fact[i - 2]) % mod;
                F = (F * mod - 1) % mod;
                F = (F + (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod) % mod;
                F = (F * invb[i]) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
        } else if (B < W) {
            for (int i = 0; i < B; i++) {
                System.out.println(invf[2]);
            }
            int P = invf[2];
            for (int i = B + 1; i <= W; i++) {
                int F = (fact[i - 2] * invf[i - 1 - B] * invf[B - 1]) % mod;
                F = (F * mod - 1) % mod;
                F = (F * invb[i]) % mod;
                F = (F + P) % mod;
                System.out.println(F);
                P = F;
            }
            for (int i = W + 1; i <= B + W; i++) {
                int F = (invf[i - 1 - B] * invf[B - 1]) % mod;
                F = (F * fact[i - 2]) % mod;
                F = (F * mod - 1) % mod;
                F =