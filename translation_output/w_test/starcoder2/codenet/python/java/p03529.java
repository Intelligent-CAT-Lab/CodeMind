

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = 1000000007;
        int[] lis = new int[3300];
        lis[0] = 1;
        for (int i = N; i > 0; i--) {
            int[] nlis = new int[3300];
            for (int j = 0; j <= K; j++) {
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
        }
        long ans = (long) K * (K + 1) / 2 * pow(K + 1, N - 1, mod) * N;
        for (int i = 0; i <
