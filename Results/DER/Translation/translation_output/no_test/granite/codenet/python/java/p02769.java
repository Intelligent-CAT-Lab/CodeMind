System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
import java.io.*;

public class Main {
    static long mod = (long)1e9 + 7;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        if (n <= k) {
            long x = 1;
            for (int i = 1; i < n; i++) {
                x = (x * (2 * n - 1 - i)) % mod;
            }
            long y = 1;
            for (int i = 1; i < n; i++) {
                y = (y * i) % mod;
            }
            long ans = (x * power(y, mod - 2)) % mod;
            System.out.println(ans);
        } else {
            long x = 1;
            long y = 1;
            long t = 1;
            for (int i = 1; i <= k; i++) {
                t = (t * i) % mod;
                y = (y * (n - 1 - i + mod)) % mod;
                y = (y * (n - i + mod)) % mod;
                long c = power(t, mod - 2);
                x = (x + (y * c * c) % mod) % mod;
            }
            System.out.println(x);
        }
    }

    static long power(long x, long y) {
        long res = 1;
        x = x % mod;
        while (y > 0) {
            if (y % 2 == 1)
                res = (res * x) % mod;
            y = y >> 1;
            x = (x * x) % mod;
        }
        return res;
    }
}
```<|endoftext|>
