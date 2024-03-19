<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 2 2

Expected output:
-19

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
[/INST]
```java
import java.util.Scanner;

public class Main {
    final static long mod = 1000000007;
    final static int rng = 2000100;
    static long[] fctr = new long[rng];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        long result = cmb(x2 + y2 + 2, x2 + 1) - cmb(x2 + y1 + 1, y1) - cmb(x1 + y2 + 1, x1) + cmb(x1 + y1, x1);
        System.out.println(result % mod);
    }

    public static long finv(long x) {
        return pow(fctr[x], mod - 2, mod);
    }

    public static long cmb(int n, int k) {
        if (n < 0 || k < 0)
            return 0;
        else
            return fctr[n] * finv(n - k) * finv(k) % mod;
    }

    public static long pow(long a, long b) {
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1)
                res = res * a % mod;
            a = a * a % mod;
            b = b >> 1;
        }
        return res;
    }
}
```</s>
