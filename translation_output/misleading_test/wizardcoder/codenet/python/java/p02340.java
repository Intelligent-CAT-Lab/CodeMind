Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
83

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
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = 1000000007;

        int[][] D = new int[N+1][K+1];
        for(int i=0; i<=N; i++) {
            D[i][1] = 1;
        }
        for(int i=1; i<=K; i++) {
            D[0][i] = 1;
        }
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=K; j++) {
                if(i >= j) {
                    D[i][j] = (D[i-j][j] + D[i][j-1]) % MOD;
                } else {
                    D[i][j] = D[i][i];
                }
            }
        }
        System.out.println(D[N][K]);
    }
}
```<|endoftext|>
