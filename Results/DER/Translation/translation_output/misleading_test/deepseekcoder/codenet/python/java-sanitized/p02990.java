import java.util.*;

public class p02990 {
    private static final long MOD = (long)Math.pow(10,9)+7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        for (int i = 1; i <= K; i++) {
            if (i > K || i > N-K+1) {
                System.out.println(0);
            } else {
                long ans = comb(N-K+1,i) * between(N,K,i);
                ans %= MOD;
                System.out.println(ans);
            }
        }
    }

    private static long comb(long n, long r) {
        r = Math.min(r, n-r);
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) / (i+1);
            res %= MOD;
        }
        return res;
    }

    private static long between(int n, int k, int i) {
        if (i == 1) {
            return 1;
        }
        return comb(k-1,i-1);
    }
}