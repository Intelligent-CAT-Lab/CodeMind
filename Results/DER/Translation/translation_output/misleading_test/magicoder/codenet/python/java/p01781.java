<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
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

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int N = scanner.nextInt();

        long[] S = new long[Math.max(2 * (X + Y + Z + 1), 2 * N + 2)];
        for (int k = 0; k < N; k++) {
            S[k] = k * (k + 1) / 2;
        }
        for (int k = N; k < X + Y + Z + 1; k++) {
            S[k] = k * (k + 1) / 2 + S[k - N];
        }

        long calc(int k, int x, int y, int z) {
            return S[k] - S[k - x] - S[k - y] - S[k - z] + S[k - (x + y)] + S[k - (y + z)] + S[k - (z + x)] - S[k - (x + y + z)];
        }

        long[] ans = new long[N];
        for (int b = 0; b < N; b++) {
            int k = (X + Y + Z - b - 1) / N * N + b;
            ans[b] = calc(k + 1, X - A, Y - B, Z - C) + calc(k, A, Y - B, Z - C) + calc(k, X - A, B, Z - C) + calc(k, X - A, Y - B, C) + calc(k - 1, A, B, Z - C) + calc(k - 1, X - A, B, C) + calc(k - 1, A, Y - B, C) + calc(k - 2, A, B, C);
        }
        for (int i = 0; i < N; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
```

This Java code does the same thing as the Python code. It reads the input, performs the calculations, and prints the output. The only difference is that Java uses `System.in` and `System.out` for input and output, and it uses `Scanner` for reading input and `System.out.print` for printing output.<｜end▁of▁sentence｜>
