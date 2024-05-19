System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    static int mod = 100000007;
    static int bp(int a, int n) {
        int r = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                r = (int) ((long) r * a % mod);
            }
            a = (int) ((long) a * a % mod);
            n /= 2;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n <= k) {
            int x = 1;
            for (int i = 0; i < n - 1; i++) {
                x = (int) ((long) x * (2 * n - 1 - i) % mod);
            }
            int y = 1;
            for (int i = 0; i < n - 1; i++) {
                y = (int) ((long) y * (i + 1) % mod);
            }
            System.out.println((int) ((long) x * bp(y, 100000000 + 5) % mod));
        } else {
            int x = 1;
            int y = 1;
            int t = 1;
            for (int i = 0; i < k; i++) {
                t = (int) ((long) t * (i + 1) % mod);
                y = (int) ((long) y * (n - 1 - i) % mod);
                y = (int) ((long) y * (n - i) % mod);
                int c = bp(t, 100000000 + 5);
                x = (x + (int) ((long) y * c * c % mod)) % mod;
            }
            System.out.println(x);
        }
    }
}
```<|endoftext|>
