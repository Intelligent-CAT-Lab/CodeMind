```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int m0 = sc.nextInt();
        int md = sc.nextInt();
        int n0 = sc.nextInt();
        int nd = sc.nextInt();

        int[] S = new int[M+1];
        S[0] = m0;
        int mi = m0;
        for (int i = 1; i < M; i++) {
            S[i] = mi = (mi * 58 + md) % (N + 1);
        }
        Arrays.sort(S);
        for (int i = 0; i < M; i++) {
            S[i+1] += S[i];
        }

        int[] T = new int[N+1];
        T[0] = n0;
        int ni = n0;
        for (int i = 1; i < N; i++) {
            T[i] = ni = (ni * 58 + nd) % (M + 1);
        }
        Arrays.sort(T);
        for (int i = 0; i < N; i++) {
            T[i+1] += T[i];
        }

        long result = Long.MAX_VALUE;
        for (int i = 0; i <= M; i++) {
            int j = N;
            long curr = 10_000_000_000_000L;
            while (j > 0) {
                long calc = (M - i) * (N - j) + S[i] + T[j];
                if (calc < curr) {
                    curr = calc;
                } else {
                    break;
                }
                j--;
            }
            if (curr < result) {
                result = curr;
            }
        }

        System.out.println(result);
    }
}
```
```
