import java.util.*;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int mod = 998244353;

        int[] X = new int[2 * K - 1];
        int[] frac = new int[N + K + 1];
        int[] invf = new int[N + K + 1];

        for (int i = 0; i < 2 * K - 1; i++) {
            X[i] = 0;
        }

        frac[0] = 1;
        for (int i = 1; i <= N + K; i++) {
            frac[i] = (int)(((long)(i) * (long)(frac[i - 1])) % mod);
        }

        for (int i = 0; i <= N + K; i++) {
            invf[i] = inved(frac[i], mod);
        }

        for (int k = 2; k <= K + 1; k++) {
            int S = 0;
            int sign = 1;
            int l = k / 2;
            for (int m = 0; m <= Math.min(l, N / 2); m++) {
                long prod = (long)(sign) * ((long)(frac[l]) * (long)(frac[N + K - 2 * m - 1])) % mod;
                prod = (prod * ((long)(invf[m]) * (long)(invf[l - m])) % mod) % mod;
                prod = (prod * ((long)(invf[N - 2 * m]) * (long)(invf[K - 1])) % mod) % mod;
                S = (S + (int)(prod)) % mod;
                sign *= -1;
            }
            X[k - 2] = S;
            X[2 * K - k] = S;
        }

        for (int i = 0; i < 2 * K - 1; i++) {
            System.out.println(X[i]);
        }
    }

    public static int inved(int a, int mod) {
        int x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            int temp = l;
            int q = k / l;
            l = k % l;
            k = temp;
            
            int tempX = x;
            x = u;
            u = tempX - q * u;
            
            int tempY = y;
            y = v;
            v = tempY - q * v;
        }
        return x % mod;
    }
}