Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 4

Expected output:
7


```
n,k=map(int,input().split());p=998244353
r=range
f=[1]
for i in r(k):f+=[-~i*f[i]%p]
print(sum(f[-2]*pow(f[i]*f[-2-i],-1,p)for i in r(n-1,k))%p)
```

### Response:
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = 998244353;
        BigInteger[] f = new BigInteger[k+1];
        f[0] = BigInteger.ONE;
        for (int i = 1; i <= k; i++) {
            f[i] = f[i-1].negate().mod(BigInteger.valueOf(p)).multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(p));
        }
        BigInteger ans = BigInteger.ZERO;
        for (int i = k; i >= n; i--) {
            ans = ans.add(f[i].multiply(f[i-n].modInverse(BigInteger.valueOf(p))).mod(BigInteger.valueOf(p)));
        }
        System.out.println(ans.mod(BigInteger.valueOf(p)));
    }
}
```<|endoftext|>
