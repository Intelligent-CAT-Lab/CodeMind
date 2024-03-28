<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
6


```
N, K = map(int, input().split())
MOD = 10**9 + 7

if K < N:
    print(0)
else:
    ans = 1
    for v in range(K, K-N, -1):
        ans = ans * v % MOD
    print(ans)


```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long MOD = 1000000007;

        if (K < N) {
            System.out.println(0);
        } else {
            long ans = 1;
            for (int v = K; v >= K - N; v--) {
                ans = ans * v % MOD;
            }
            System.out.println(ans);
        }
    }
}
```</s>
