<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 5

Expected output:
7


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
        final int MOD = (int) Math.pow(10, 9) + 7;

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

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the binomial coefficient D[N][K] modulo 10^9 + 7, and prints the result. The binomial coefficient D[N][K] is calculated using dynamic programming, where D[n][k] is the number of ways to choose k elements from a set of n elements. The calculation is done modulo 10^9 + 7 to prevent overflow.
<|EOT|>
