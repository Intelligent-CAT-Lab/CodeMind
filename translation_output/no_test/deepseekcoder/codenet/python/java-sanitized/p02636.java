import java.util.*;

public class p02636 {
    static int mod = 998244353;
    static int N = (int)Math.pow(10, 3);
    static long[] g1 = new long[N+1];
    static long[] g2 = new long[N+1];
    static long[] inverse = new long[N+1];

    static void preprocess() {
        for (int i = 2; i <= N; i++) {
            g1[i] = (g1[i-1] * i) % mod;
            inverse[i] = (-inverse[mod % i] * (mod/i)) % mod;
            g2[i] = (g2[i-1] * inverse[i]) % mod;
        }
        inverse[0] = 0;
    }

    static long cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n-r);
        return g1[n] * g2[r] * g2[n-r] % mod;
    }

    public static void main(String[] args) {
        preprocess();
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();
        // rest of the code goes here
    }
}