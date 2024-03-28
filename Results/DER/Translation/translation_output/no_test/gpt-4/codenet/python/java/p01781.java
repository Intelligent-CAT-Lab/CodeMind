Below is the translated Java code from the given Python code.

```java
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int Z = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int[] S = new int[Math.max(2 * (X + Y + Z + 1), 2 * N + 2)];
            for (int k = 0; k < N; k++) {
                S[k] = k * (k + 1) / 2;
            }
            for (int k = N; k < X + Y + Z + 1; k++) {
                S[k] = k * (k + 1) / 2 + S[k - N];
            }

            int[] ans = new int[N];
            for (int b = 0; b < N; b++) {
                int k = (X + Y + Z - b - 1) / N * N + b;
                ans[b] = (
                      calc(S, k + 1, X - A, Y - B, Z - C)
                    + calc(S, k, A, Y - B, Z - C)
                    + calc(S, k, X - A, B, Z - C)
                    + calc(S, k, X - A, Y - B, C)
                    + calc(S, k - 1, A, B, Z - C)
                    + calc(S, k - 1, X - A, B, C)
                    + calc(S, k - 1, A, Y - B, C)
                    + calc(S, k - 2, A, B, C)
                );
            }

            for (int value : ans) {
                writer.write(value + " ");
            }
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int calc(int[] S, int k, int x, int y, int z) {
        return S[k] - S[k - x] - S[k - y] - S[k - z] + S[k - (x + y)] + S[k - (y + z)] + S[k - (z + x)] - S[k - (x + y + z)];
    }
}
```

Please note that it's important to correctly handle exceptions and closing resources in Java, which may not be necessary in Python. Additionally, Java requires defining the type of each variable and does not support inferring types like in Python. So each variable is declared with its type explicitly. The `BufferedReader` and `BufferedWriter` are used in place of Python's `sys.stdin.readline` and `sys.stdout.write` to read and write from/to the console. The `StringTokenizer` is used to parse the input line since Java doesn't natively support tuple unpacking like Python does. Keep in mind that Java's arrays are zero-based, so this must match the logic expected by the original Python algorithm.
