Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 1 3

Expected output:
7


```
n,a,b = map(int, input().split())
MOD = 10**9 + 7

def modcomb(n,a,mod):
    cnt = 1
    for i in range(a):
        cnt *= (n-i)
        cnt *= pow(i+1,mod-2,mod)
        cnt %= mod
    # print(cnt)
    return cnt
    


X = pow(2,n,MOD)-1
A = modcomb(n,a,MOD)
B = modcomb(n,b,MOD)
ans = (X-A-B)%MOD
print(ans)
```

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MOD = 1000000007;

        BigInteger X = BigInteger.valueOf(2).pow(n).subtract(BigInteger.ONE);
        BigInteger A = modcomb(n, a, MOD);
        BigInteger B = modcomb(n, b, MOD);
        BigInteger ans = X.subtract(A).subtract(B).mod(BigInteger.valueOf(MOD));
        System.out.println(ans);
    }

    public static BigInteger modcomb(int n, int a, int mod) {
        BigInteger cnt = BigInteger.ONE;
        for (int i = 0; i < a; i++) {
            cnt = cnt.multiply(BigInteger.valueOf(n-i)).multiply(BigInteger.valueOf(pow(i+1, mod-2, mod))).mod(BigInteger.valueOf(mod));
        }
        return cnt;
    }

    public static int pow(int a, int b, int mod) {
        int res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }
}
```<|endoftext|>
