```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int m0 = Integer.parseInt(st.nextToken());
        int md = Integer.parseInt(st.nextToken());
        int n0 = Integer.parseInt(st.nextToken());
        int nd = Integer.parseInt(st.nextToken());

        int[] S = new int[M + 1];
        S[0] = m0;
        int mi = m0;
        for (int i = 1; i < M; i++) {
            S[i] = mi = (mi * 58 + md) % (N + 1);
        }
        Arrays.sort(S);
        for (int i = 0; i < M; i++) {
            S[i + 1] += S[i];
        }

        int[] T = new int[N + 1];
        T[0] = n0;
        int ni = n0;
        for (int i = 1; i < N; i++) {
            T[i] = ni = (ni * 58 + nd) % (M + 1);
        }
        Arrays.sort(T);
        for (int i = 0; i < N; i++) {
            T[i + 1] += T[i];
        }

        int result = Integer.MAX_VALUE;
        for (int a = 0; a <= M; a++) {
            int j = N;
            int prevCalc = Integer.MAX_VALUE;
            for (int b = 0; b <= N; b++) {
                int currentCalc = (M - a) * (N - b) + S[a] + T[b];
                if (currentCalc > prevCalc) {
                    j--;
                } else {
                    prevCalc = currentCalc;
                    result = Math.min(result, currentCalc);
                }
            }
        }

        pw.println(result);

        pw.close();
    }
}
```
```
