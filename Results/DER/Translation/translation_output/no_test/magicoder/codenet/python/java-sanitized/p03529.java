import java.util.*;

public class p03529 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long mod = (long) Math.pow(10, 9) + 7;
        long[] lis = new long[3300];
        lis[0] = 1;

        for (int i = N; i > 0; i--) {
            long[] nlis = new long[3300];

            for (int j = 0; j <= K; j++) {
                for (int last = 0; last < 3300; last++) {
                    if (i > j) {
                        nlis[last] += lis[last];
                        nlis[last] %= mod;
                    } else if (last + j >= i) {
                        nlis[last + (last + j) / i] += lis[last];
                        nlis[last + (last + j) / i] %= mod;
                    }
                }
            }

            lis = nlis;
        }