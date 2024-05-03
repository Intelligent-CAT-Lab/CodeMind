import java.util.*;

public class p02636 {
    static int mod = 998244353;
    static int N = 2000;
    static long[] g1 = new long[N + 1]; // åãã¼ãã«
    static long[] g2 = new long[N + 1]; //éåãã¼ãã«
    static long[] inverse = new long[N + 1]; //éåãã¼ãã«è¨ç®ç¨ãã¼ãã«

    static {
        g1[0] = 1;
        for (int i = 1; i <= N; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = ((-inverse[mod % i] * (mod / i)) % mod + mod) % mod;
            g2[i] = (g2[i - 1] * inverse[i]) % mod;
        }
        inverse[0] = 0;
    }

    static int cmb(int n, int r) { //ã³ã³ããã¼ã·ã§ã³ã®é«éè¨ç®ã
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return (int) (g1[n] * g2[r] * g2[n - r] % mod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();
        if (N == 1) {
            System.out.println(1);
            return;
        }

        long[][][] dp = new long[N +