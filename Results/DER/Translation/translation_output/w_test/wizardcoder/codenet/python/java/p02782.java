Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 2 2

Expected output:
14


```
mod = 10**9+7
rng = 2000100
fctr = [1]+[0]*(rng-1)
for i in range(1,rng):
  fctr[i] = fctr[i-1]*i%mod
def finv(x):
  return pow(fctr[x],mod-2,mod)
def cmb(n,k):
  if n<0 or k<0:
    return 0
  else:
    return fctr[n]*finv(n-k)*finv(k)%mod

x1,y1,x2,y2 = map(int,input().split())
print((cmb(x2+y2+2,x2+1)-cmb(x2+y1+1,y1)-cmb(x1+y2+1,x1)+cmb(x1+y1,x1))%mod)
```

### Response:
```java
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1000000007;
        int rng = 2000100;
        BigInteger[] fctr = new BigInteger[rng];
        fctr[0] = BigInteger.ONE;
        for (int i = 1; i < rng; i++) {
            fctr[i] = fctr[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(mod));
        }
        BigInteger finv(int x) {
            return fctr[x].modInverse(BigInteger.valueOf(mod));
        }
        BigInteger cmb(int n, int k) {
            if (n < 0 || k < 0) {
                return BigInteger.ZERO;
            } else {
                return fctr[n].multiply(finv(n - k)).multiply(finv(k)).mod(BigInteger.valueOf(mod));
            }
        }

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(cmb(x2 + y2 + 2, x2 + 1).subtract(cmb(x2 + y1 + 1, y1)).subtract(cmb(x1 + y2 + 1, x1)).add(cmb(x1 + y1, x1)).mod(BigInteger.valueOf(mod)));
    }
}
```<|endoftext|>
