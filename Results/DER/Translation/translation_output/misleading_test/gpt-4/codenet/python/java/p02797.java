Below is the translation of the provided Python code to Java:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        FastReader in = new FastReader();
        int N = in.nextInt();
        int K = in.nextInt();
        int S = in.nextInt();

        int[] A = new int[N];
        Arrays.fill(A, S);

        if (S == (int) Math.pow(10, 9)) {
            for (int i = 0; i < N - K; ++i) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; ++i) {
                A[i] = (int) Math.pow(10, 9);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; ++i) {
            sb.append(A[i]);
            if (i < N - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
```

Please note that `BufferedReader` is employed for faster input, similar to what is expected from `sys.stdin.readline` in the original python code. The use of `FastReader` class improves the efficiency of reading inputs in Java, making it more suitable for competitive programming scenarios, where large inputs need to be processed quickly. Also, since Java's array elements are initialized to 0 by default, `Arrays.fill(A, S)` is used to fill the array `A` with the value `S`. The solution is wrapped in a `StringBuilder` to concatenate strings efficiently, which is then printed out as the final result.
