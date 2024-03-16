import java.util.Scanner;

public class p03529 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = 1000000007;
        int[] lis = new int[3300];
        lis[0] = 1;

        for (int i = N; i > 0; i--) {
            int[] nlis = new int[3300];
            for (int j = K + 1; j > 0; j--) {
                for (int last = 3300 - 1; last >= 0; last--) {
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
        }

        long ans = K * (K + 1) / 2 * (long) Math.pow(K + 1, N - 1) * N;
        for (int i = 0; i < 3300; i++) {
            ans -= lis[i] * i;
            ans %= mod;
        }
        System.out.println(ans);
    }
}