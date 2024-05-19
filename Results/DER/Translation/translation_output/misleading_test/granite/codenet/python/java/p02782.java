System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    static long mod = (long)Math.pow(10,9)+7;
    static long rng = 2000100;
    static long[] fctr = new long[(int)rng];
    static {
        fctr[0] = 1;
        for(int i=1;i<rng;i++) {
            fctr[i] = (fctr[i-1]*i)%mod;
        }
    }
    static long finv(long x) {
        return pow(fctr[(int)x],mod-2,mod);
    }
    static long cmb(long n, long k) {
        if(n<0 || k<0) {
            return 0;
        } else {
            return (fctr[(int)n]*finv(n-k)%mod)*finv(k)%mod;
        }
    }
    static long pow(long a, long b, long m) {
        a %= m;
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1)
                res = res * a % m;
            a = a * a % m;
            b /= 2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y2 = sc.nextLong();
        long ans = (cmb(x2+y2+2,x2+1)-cmb(x2+y1+1,y1)-cmb(x1+y2+1,x1)+cmb(x1+y1,x1))%mod;
        System.out.println(ans);
    }
}
```<|endoftext|>
