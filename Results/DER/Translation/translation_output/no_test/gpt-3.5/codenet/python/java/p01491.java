```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        solve(br, out);

        out.flush();
        out.close();
    }

    public static void solve(BufferedReader br, PrintWriter out) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int m0 = Integer.parseInt(st.nextToken());
        int md = Integer.parseInt(st.nextToken());
        int n0 = Integer.parseInt(st.nextToken());
        int nd = Integer.parseInt(st.nextToken());

        int[] S = new int[M+1];
        S[0] = m0;
        int mi = m0;
        for (int i = 1; i < M; i++) {
            S[i] = mi = (mi * 58 + md) % (N + 1);
        }
        S[M] = 0;
        Arrays.sort(S);
        for (int i = 1; i <= M; i++) {
            S[i] += S[i-1];
        }

        int[] T = new int[N+1];
        T[0] = n0;
        int ni = n0;
        for (int i = 1; i < N; i++) {
            T[i] = ni = (ni * 58 + nd) % (M + 1);
        }
        T[N] = 0;
        Arrays.sort(T);
        for (int i = 1; i <= N; i++) {
            T[i] += T[i-1];
        }

        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i <= M; i++) {
            for (int j = N; j >= 0; j--) {
                int val = (M - i) * (N - j) + S[i] + T[j];
                if (val < minVal) {
                    minVal = val;
                }
            }
        }

        out.println(minVal);
    }
}
```
```
