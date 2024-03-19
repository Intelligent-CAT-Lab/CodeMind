<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
-82

```
N, K = map(int, input().split())
P = 10 ** 9 + 7
X = [0] * (K + 1)
ans = 0
for i in range(1, K + 1):
    X[i] += i
    for j in range(i * 2, K+1, i):
        X[j] -= X[i]
    ans += X[i] * pow(K//i, N, P)
print(ans % P)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = 1000000007;
        int[] X = new int[K + 1];
        X[1] = 1;
        for (int i = 2; i <= K; i++) {
            X[i] = X[i - 1] + i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
        }
        long ans = 0;
        for (int i = 1; i <= K; i++) {
            ans += X[i] * Math.pow(K / i, N, P);
            ans %= P;
        }
        System.out.println(ans);
    }
}
```
'''
<|endoftext|>
