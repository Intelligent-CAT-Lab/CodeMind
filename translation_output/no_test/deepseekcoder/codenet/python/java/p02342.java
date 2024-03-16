<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N, K = map(int, input().split())
MOD = 10**9 + 7

D = [[0]*(K+1) for i in range(N+1)]
for i in range(1, N+1):
    D[i][1] = 1
for i in range(1, min(N, K)+1):
    D[i][i] = 1
for n in range(1, N+1):
    for k in range(2, min(n-1, K)+1):
        D[n][k] = (D[n-k][k] + D[n-1][k-1]) % MOD
print(D[N][K] % MOD)


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
        for (int i = 1; i <= N; i++) {
            D[i][1] = 1;
        }
        for (int i = 1; i <= Math.min(N, K); i++) {
            D[i][i] = 1;
        }
        for (int n = 1; n <= N; n++) {
            for (int k = 2; k <= Math.min(n-1, K); k++) {
                D[n][k] = (D[n-k][k] + D[n-1][k-1]) % MOD;
            }
        }
        System.out.println(D[N][K] % MOD);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and K from the input, and then it calculates the value of D[N][K] modulo MOD. The calculation is done using a dynamic programming approach, where D[n][k] is the number of ways to choose k elements from a set of n elements. The result is then printed to the standard output.
<|EOT|>
