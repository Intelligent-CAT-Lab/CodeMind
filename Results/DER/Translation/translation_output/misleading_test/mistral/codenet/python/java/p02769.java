<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
-18

```
def i1():
 return int(input())
def i2():
 return [int(i) for i in input().split()]
mod=10**9+7
def bp(a,n):
        r=1
        while(n):
           if n%2:
              r=r*a%mod
           a=a*a%mod
           n>>=1
        return r
[n,k]=i2()
if n<=k:
   x=1
   for i in range(n-1):
      x*=2*n-1-i
      x%=mod
   y=1
   for i in range(n-1):
      y*=i+1
      y%=mod
   print((x*bp(y,10**9+5))%mod)   
   
else:
   x=1
   y=1
   t=1
   for i in range(k):
      t*=i+1
      t%=mod
      y*=n-1-i
      y%=mod
      y*=n-i
      y%=mod
      c=bp(t,10**9+5)
      x+=y*c*c
      x%=mod
   print(x)   
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = (int) 1e9 + 7;
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int x = 1;
        int y = 1;
        int t = 1;
        for (int i = 0; i < k; i++) {
            t *= (i + 1);
            t %= mod;
            y *= (n - 1 - i);
            y %= mod;
            y *= (n - i);
            y %= mod;
            int c = bp(t, mod);
            x += y * c * c;
            x %= mod;
        }
        if (n <= k) {
            x = 1;
            for (int i = 1; i < n; i++) {
                x *= (2 * n - 1 - i);
                x %= mod;
            }
            y = 1;
            for (int i = 1; i < n; i++) {
                y *= (i + 1);
                y %= mod;
            }
            System.out.println((x * y) % mod);
        } else {
            x = 1;
            for (int i = 1; i < k; i++) {
                x *= (2 * k - 1 - i);
                x %= mod;
            }
            y = 1;
            for (int i = 1; i < k; i++) {
                y *= (k - 1 - i);
                y %= mod;
            }
            y *= (k - i);
            y %= mod;
            int c = bp(t, mod);
            x += y * c * c;
            x %= mod;
            System.out.println(x);
        }
    }

    public static int bp(int a, int n) {
        int r = 1;
        while (n != 0) {
            if (n % 2 == 1) {
                r = r * a % mod;
            }
            a = a * a % mod;
            n /= 2;
        }
        return r;
    }
}
```</s>
