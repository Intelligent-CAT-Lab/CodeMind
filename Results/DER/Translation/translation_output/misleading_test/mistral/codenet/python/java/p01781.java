<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 2 0 0 0 5

Expected output:
-22 -44 72 33 -78

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
[/INST]
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int[] input = new int[7];
        String line = br.readLine();
        String[] split = line.split(" ");
        for (int i = 0; i < split.length; i++) {
            input[i] = Integer.parseInt(split[i]);
        }
        int[] S = new int[input[6] + 1];
        Arrays.fill(S, 0);
        for (int i = 0; i < input[4]; i++) {
            S[i] = (i * (i + 1)) / 2;
        }
        for (int i = input[4]; i <= input[6]; i++) {
            S[i] = (i * (i + 1)) / 2 + S[i - input[4]];
        }
        int[] ans = new int[input[4]];
        for (int i = 0; i < input[4]; i++) {
            int k = ((input[6] - i - 1) / input[4] * input[4] + i);
            ans[i] = (
                    calc(k + 1, input[5] - input[0], input[4] - input[1], input[3] - input[2])
                    + calc(k, input[5] - input[0], input[4] - input[1], input[3] - input[2])
                    + calc(k, input[5] - input[0], input[4] - input[1], input[3])
                    + calc(k, input[5] - input[0], input[4] - input[1], input[2])
                    + calc(k - 1, input[5] - input[0], input[4] - input[1], input[2])
                    + calc(k - 1, input[5] - input[0], input[4] - input[1], input[1])
                    + calc(k - 1, input[5] - input[0], input[4] - input[1], input[0])
                    + calc(k - 2, input[5] - input[0], input[4] - input[1], input[0])
            );
        }
        out.println(Arrays.toString(ans));
        out.println();
    }
    public static int calc(int k, int x, int y, int z) {
        return (k * (k + 1) / 2 - k * x - k * y - k * z + k * (x + y) + k * (y + z) + k * (z + x) - k * (x + y + z));
    }
}
```</s>
