<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 5

Expected output:
-55

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

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
This code uses a dynamic programming approach to solve the problem. It first initializes a 2D array `D` with the values `0` for all indices. Then, it populates the first row of the array with the values `1` for all indices. Next, it populates the first column of the array with the values `1` for all indices.

After that, it iterates over the rows and columns of the array, using the recurrence relation `D[n][k] = (D[n-k][k] + D[n-1][k-1]) % MOD` to compute the values of the array.

Finally, it prints the value of `D[N][K] % MOD` as the solution to the problem.</s>
