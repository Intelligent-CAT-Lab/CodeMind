System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
9


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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long P = (long)Math.pow(10, 9) + 7;
        long[] X = new long[K+1];
        long ans = 0;
        
        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans += X[i] * pow(K/i, N, P);
        }
        
        System.out.println(ans % P);
    }
    
    public static long pow(long x, int n, long mod) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            long half = pow(x, n/2, mod);
            return half * half % mod;
        } else {
            return x * pow(x, n-1, mod) % mod;
        }
    }
}
```<|endoftext|>
