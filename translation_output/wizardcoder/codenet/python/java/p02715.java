Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        BigInteger P = BigInteger.valueOf(1000000007);
        int[] X = new int[K+1];
        BigInteger ans = BigInteger.ZERO;
        for (int i = 1; i <= K; i++) {
            X[i] = i;
            for (int j = i*2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans = ans.add(BigInteger.valueOf(X[i]).multiply(BigInteger.valueOf(K/i).modPow(BigInteger.valueOf(N), P)));
        }
        System.out.println(ans.mod(P));
    }
}
```<|endoftext|>
