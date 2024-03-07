<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
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
Note that the `Math.min()` function is used to ensure that the loop variables `n` and `k` do not exceed the bounds of the arrays `D` and `D[n]`. Also, the `% MOD` operation is used to ensure that the result is within the range of the modulus.</s>
