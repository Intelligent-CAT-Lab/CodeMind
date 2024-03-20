Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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
        BigInteger[] X = new BigInteger[K+1];
        BigInteger ans = BigInteger.ZERO;
        for(int i=1; i<=K; i++){
            X[i] = BigInteger.valueOf(i);
            for(int j=i*2; j<=K; j+=i){
                X[j] = X[j].subtract(X[i]);
            }
            ans = ans.add(X[i].multiply(BigInteger.valueOf(K/i).pow(N)));
        }
        System.out.println(ans.mod(P));
    }
}
```<|endoftext|>
