import java.util.*;

public class p03529 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = (int) 1e9 + 7;
        int[] lis = new int[3300];
        Arrays.fill(lis, 0);
        lis[0] = 1;

        for (int i = N; i >= 0; i--) {
            int[] nlis = new int[3300];
            Arrays.fill(nlis, 0);

            for (int j = 1; j <= K; j++) {
                for (int last = 0; last < 3300; last++) {
                    if (i < j) {
                        nlis[last] += lis[last];
                        nlis[last] %= mod;
                    } else if ((last + j) / i + last < 3300) {
                        nlis[last + (last + j) / i] += lis[last];
                        nlis[last + (last + j) / i] %= mod;
                    }
                }
            }

            lis = nlis;
            // System.out.println(Arrays.toString(lis));

            int ans = K * (K + 1) / 2 * (int) Math.pow(K + 1, N - 1, mod) * N;
            for (int i = 0; i < 3300; i++) {
                ans -= lis[i] * i;
                ans %= mod;
            }
            System.out.println(ans);
        }
    }
}