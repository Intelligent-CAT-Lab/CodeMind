import java.util.Scanner;

public class p03083 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int W = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;

        int[] fact = new int[B + W + 1];
        int[] invf = new int[B + W + 1];
        for (int i = 0; i <= B + W; i++) {
            fact[i] = (i == 0) ? 1 : (fact[i - 1] * i) % mod;
            invf[i] = (i == 0) ? 1 : (invf[i - 1] * i) % mod;
        }

        int[] bina = new int[B + W + 1];
        int[] invb = new int[B + W + 1];
        for (int i = 0; i <= B + W; i++) {
            bina[i] = (i == 0) ? 1 : (bina[i - 1] * 2) % mod;
            invb[i] = (i == 0) ? 1 : (invb[i - 1] * 2) % mod;
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
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
            for (int i = B + 1; i <= B + W; i++) {
                int F = invf[i - 1 - B] * invf[B - 1];
                F %= mod;
                F *= fact[i - 2];
                F %= mod;
                F *= mod - 1;
                F += (fact[i - 2] * invf[i - 1 - W] * invf[W - 1]) % mod;
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
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
                F *= mod - 1;
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
            for (int i = W + 1; i <= B + W; i++) {
                int F = invf[i - 1 - B] * invf[B - 1];