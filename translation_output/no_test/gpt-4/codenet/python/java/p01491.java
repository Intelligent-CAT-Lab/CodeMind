Below is the equivalent Java code for the provided Python snippet:

```java
import java.io.*;
import java.util.Arrays;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
        writer.flush();
    }

    public static void solve() throws IOException {
        String[] input = reader.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int m0 = Integer.parseInt(input[2]);
        int md = Integer.parseInt(input[3]);
        int n0 = Integer.parseInt(input[4]);
        int nd = Integer.parseInt(input[5]);

        long[] S = new long[M + 1];
        long mi = m0;
        S[0] = mi;
        for (int i = 1; i < M; i++) {
            S[i] = mi = (mi * 58 + md) % (N + 1);
        }
        Arrays.sort(S);
        for (int i = 0; i < M; i++) {
            S[i + 1] += S[i];
        }

        long[] T = new long[N + 1];
        long ni = n0;
        T[0] = ni;
        for (int i = 1; i < N; i++) {
            T[i] = ni = (ni * 58 + nd) % (M + 1);
        }
        Arrays.sort(T);
        for (int i = 0; i < N; i++) {
            T[i + 1] += T[i];
        }

        long min = Long.MAX_VALUE;
        int j = N;
        for (int i = 0; i <= M; i++) {
            while (j > 0 && calc(i, j, S, T, M, N) > calc(i, j - 1, S, T, M, N)) {
                j--;
            }
            min = Math.min(min, calc(i, j, S, T, M, N));
        }
        writer.write(min + "\n");
    }

    private static long calc(int a, int b, long[] S, long[] T, int M, int N) {
        return (long) (M - a) * (N - b) + S[a] + T[b];
    }
}
```

Some key points to consider while translating Python to Java:

1. Java uses static typing, which means that you need to declare the type of each variable explicitly.
2. System input and output are typically handled using `BufferedReader` for input and `BufferedWriter` for output in Java.
3. In Java, everything goes into a class; methods should be encapsulated within a class definition.
4. The equivalent of Python's `print` function in Java would be to `write` using a `BufferedWriter`, followed by a `flush()` to ensure all data is written out.
5. In Java, arrays need to be sorted using `Arrays.sort()`.
6. I've encapsulated the `calc` function within the `solve` method, since Java doesn't support nested methods. However, if reusability is desired outside `solve`, you could define it as a static method in the class.
7. Unlike in Python, the `main` function is always static in Java and is the entry point of the program.
