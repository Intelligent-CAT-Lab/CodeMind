<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();
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
                    S[k+1] - S[k-X] - S[k-Y] - S[k-Z] + S[k-(X+Y)] + S[k-(Y+Z)] + S[k-(Z+X)] - S[k-(X+Y+Z)]
                + S[k] - S[k-A] - S[k-B] - S[k-C] + S[k-(A+B)] + S[k-(B+C)] + S[k-(C+A)] - S[k-(A+B+C)]
                + S[k-1] - S[k-X-A] - S[k-Y-B] - S[k-Z-C] + S[k-(X+Y+A)] + S[k-(Y+Z+B)] + S[k-(Z+X+C)] - S[k-(X+Y+Z+A+B+C)]
                + S[k-2] - S[k-X-A-B] - S[k-Y-B-C] - S[k-Z-C-A] + S[k-(X+Y+A+B)] + S[k-(Y+Z+B+C)] + S[k-(Z+X+C+A)] - S[k-(X+Y+Z+A+B+C+A+B)]
            );
        }
        for (int b : ans) {
            System.out.print(b + " ");
        }
    }
}
```

'''
<|endoftext|>
