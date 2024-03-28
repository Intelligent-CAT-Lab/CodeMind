<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 2 0 0 0 5

Expected output:
1 3 3 1 0


```
import sys
readline = sys.stdin.readline
write = sys.stdout.write
def solve():
    X, Y, Z, A, B, C, N = map(int, readline().split())

    S = [0]*max(2*(X+Y+Z+1), 2*N+2)
    for k in range(N):
        S[k] = k*(k+1)//2
    for k in range(N, X+Y+Z+1):
        S[k] = k*(k+1)//2 + S[k-N]

    def calc(k, x, y, z):
        return S[k] - S[k-x] - S[k-y] - S[k-z] + S[k-(x+y)] + S[k-(y+z)] + S[k-(z+x)] - S[k-(x+y+z)]

    ans = [0]*N
    for b in range(N):
        k = (X+Y+Z - b - 1) // N * N + b
        ans[b] = (
              calc(k+1, X-A, Y-B, Z-C)
            + calc(k, A, Y-B, Z-C)
            + calc(k, X-A, B, Z-C)
            + calc(k, X-A, Y-B, C)
            + calc(k-1, A, B, Z-C)
            + calc(k-1, X-A, B, C)
            + calc(k-1, A, Y-B, C)
            + calc(k-2, A, B, C)
        )
    write(" ".join(map(str, ans)))
    write("\n")
solve()

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int nextInt() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) {
        int X = nextInt(), Y = nextInt(), Z = nextInt(), A = nextInt(), B = nextInt(), C = nextInt(), N = nextInt();

        long[] S = new long[Math.max(2 * (X + Y + Z + 1), 2 * N + 2)];
        for (int k = 0; k < N; k++)
            S[k] = k * (k + 1) / 2;
        for (int k = N; k < X + Y + Z + 1; k++)
            S[k] = k * (k + 1) / 2 + S[k - N];

        long calc = (x, y, z) -> S[(int)x+y+z] - S[(int)x-1+y+z] - S[(int)x+y-1+z] - S[(int)x+y+z-1]
                + S[(int)x-1+y-1+z] + S[(int)x+y-1+z-1] + S[(int)x+y+z-1-1] - S[(int)x-1+y-1+z-1];

        for (int b = 0; b < N; b++) {
            int k = (X + Y + Z - b - 1) / N * N + b;
            sb.append(calc(calc, k+1, X-A, Y-B, Z-C)
                    + calc(calc, k, A, Y-B, Z-C)
                    + calc(calc, k, X-A, B, Z-C)
                    + calc(calc, k, X-A, Y-B, C)
                    + calc(calc, k-1, A, B, Z-C)
                    + calc(calc, k-1, X-A, B, C)
                    + calc(calc, k-1, A, Y-B, C)
                    + calc(calc, k-2, A, B, C));
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    static long calc(IntFunction<Long> calc, long k, long x, long y, long z) {
        return calc.apply(k) - calc.apply(k-x-1) - calc.apply(k-y-1) - calc.apply(k-z-1)
                + calc.apply(k-x-y-1) + calc.apply(k-y-z-1) + calc.apply(k-z-x-1) - calc.apply(k-x-y-z-1);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the sum of the first N numbers, and then calculates the answer for each of the N numbers. The answer is then printed to the standard output.
<|EOT|>
