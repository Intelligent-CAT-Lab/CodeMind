<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N, K = map(int, input().split())
MOD = 10**9 + 7

D = [[0]*(K+1) for i in range(N+1)]
for n in range(0, N+1):
    D[n][1] = 1
for k in range(1, K+1):
    D[0][k] = 1
for n in range(1, N+1):
    for k in range(1, K+1):
        if n >= k:
            D[n][k] = (D[n-k][k] + D[n][k-1]) % MOD
        else:
            D[n][k] = D[n][n]
print(D[N][K])


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        final int MOD = (int)Math.pow(10, 9) + 7;

        int[][] D = new int[N+1][K+1];
        for (int n = 0; n <= N; n++) {
            D[n][1] = 1;
        }
        for (int k = 1; k <= K; k++) {
            D[0][k] = 1;
        }
        for (int n = 1; n <= N; n++) {
            for (int k = 1; k <= K; k++) {
                if (n >= k) {
                    D[n][k] = (D[n-k][k] + D[n][k-1]) % MOD;
                } else {
                    D[n][k] = D[n][n];
                }
            }
        }
        System.out.println(D[N][K]);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and K from the input, and then it calculates the value of D[N][K] modulo MOD using a dynamic programming approach. The result is printed to the standard output.
<|EOT|>
