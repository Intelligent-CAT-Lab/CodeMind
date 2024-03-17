<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
5


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
This code is a solution to the problem of finding the number of ways to climb a staircase with N steps, where you can climb either 1, 2, or 3 steps at a time, and you want to find the number of ways to climb the staircase with exactly K steps.

The code uses a 2D array `D` to store the number of ways to climb the staircase with `n` steps and `k` steps taken. The array is initialized with `D[0][1] = 1` and `D[0][k] = 1` for `k = 1, 2, 3`.

The code then iterates over the values of `n` and `k` and calculates the number of ways to climb the staircase with `n` steps and `k` steps taken using the recurrence relation:

`D[n][k] = (D[n-k][k] + D[n][k-1]) % MOD`

where `MOD` is a large prime number used to ensure that the results are within the range of a 32-bit integer.

Finally, the code prints the number of ways to climb the staircase with `N` steps and `K` steps taken, which is stored in `D[N][K]`.</s>
