Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X, Y, Z, A, B, C, N;
        String[] input = br.readLine().split(" ");
        X = Integer.parseInt(input[0]);
        Y = Integer.parseInt(input[1]);
        Z = Integer.parseInt(input[2]);
        A = Integer.parseInt(input[3]);
        B = Integer.parseInt(input[4]);
        C = Integer.parseInt(input[5]);
        N = Integer.parseInt(input[6]);

        int[] S = new int[Math.max(2*(X+Y+Z+1), 2*N+2)];
        for (int k = 0; k < N; k++) {
            S[k] = k*(k+1)/2;
        }
        for (int k = N; k < X+Y+Z+1; k++) {
            S[k] = k*(k+1)/2 + S[k-N];
        }

        int[] ans = new int[N];
        for (int b = 0; b < N; b++) {
            int k = (X+Y+Z - b - 1) / N * N + b;
            ans[b] = (
                  S[k+1] - S[k-X+A] - S[k-Y+B] - S[k-Z+C] + S[k-(X+Y+A)] + S[k-(Y+Z+B)] + S[k-(Z+X+C)] - S[k-(X+Y+Z+A+B+C)]
                + S[k] - S[k-A] - S[k-B] - S[k-C] + S[k-(A+B)] + S[k-(B+C)] + S[k-(C+A)] - S[k-(A+B+C)]
                + S[k] - S[k-X] - S[k-Y] - S[k-Z] + S[k-(X+Y)] + S[k-(Y+Z)] + S[k-(Z+X)] - S[k-(X+Y+Z)]
                + S[k-1] - S[k-X+B] - S[k-Y+C] - S[k-Z+A] + S[k-(X+B+A)] + S[k-(Y+C+B)] + S[k-(Z+A+C)] - S[k-(X+B+C+Y+A)]
                + S[k-1] - S[k-X+A] - S[k-Y+B] - S[k-Z+C] + S[k-(X+Y+A)] + S[k-(Y+Z+B)] + S[k-(Z+X+C)] - S[k-(X+Y+Z+A+B+C)]
                + S[k-1] - S[k-X+B] - S[k-Y+C] - S[k-Z+A] + S[k-(X+B+A)] + S[k-(Y+C+B)] + S[k-(Z+A+C)] - S[k-(X+B+C+Y+A)]
                + S[k-2] - S[k-X+B] - S[k-Y+C] - S[k-Z+A] + S[k-(X+B+A)] + S[k-(Y+C+B)] + S[k-(Z+A+C)] - S[k-(X+B+C+Y+A)]
            );
        }

        bw.write(Arrays.toString(ans).replaceAll("[\\[\\],]", ""));
        bw.newLine();

        br.close();
        bw.close();
    }
}
```<|endoftext|>
