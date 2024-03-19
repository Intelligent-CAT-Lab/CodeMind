import java.util.*;

public class p03529 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, K;
        N = sc.nextInt();
        K = sc.nextInt();
        long mod = 1000000007;
        int[] lis = new int[3300];
        Arrays.fill(lis, 0);
        lis[0] = 1;

        for (int i = N; i >= 1; i--) {
            int[] nlis = new int[3300];
            Arrays.fill(nlis, 0);

            for (int j = 1; j <= K; j++) {
                for (int last = 0; last < 3300; last++) {
                    if (i > j) {
                        nlis[last] += lis[last];
                        nlis[last] %= mod;
                    } else if ((last + j) / i + last < 3300) {
                        nlis[last + (last + j) / i] += lis[last];
                        nlis[last + (last + j) / i] %= mod;
                    }
                }
            }

            lis = nlis;
        }

        long ans = K * (K + 1) / 2 * (long) Math.pow(K + 1, N - 1) % mod * N;

        for (int i = 0; i < 3300; i++) {
            ans -= lis[i] * i;
            ans %= mod;
        }

        System.out.println(ans);
    }
}