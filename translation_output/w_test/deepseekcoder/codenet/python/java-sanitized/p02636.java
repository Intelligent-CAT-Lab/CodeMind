import java.util.*;

public class p02636 {
    static int mod = 998244353;
    static int N = 2000;
    static long[] g1 = new long[N+1];
    static long[] g2 = new long[N+1];
    static long[] inverse = new long[N+1];

    static void init() {
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
        return g1[n] * g2[r] % mod * g2[n-r] % mod;
    }

    public static void main(String[] args) {
        init();
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = S.length();
        long ans = 1;
        Set<Pair> check = new HashSet<>();
        int one = (int) S.chars().filter(ch -> ch == '1').count();
        int zero = N - one;
        for (int i = 0; i < N; i++) {
            zero -= (S.charAt(i) == '1') ? 1 : 0;
            one += (S.charAt(i) == '0') ? 1 : 0;
            for (Pair pair : check) {
                int j = pair.getKey();
                int k = pair.getValue();