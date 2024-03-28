<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
10


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

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    static final long mod = 1000000007;

    static long bp(long a, long n) {
        long r = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                r = (r * a) % mod;
            }
            a = (a * a) % mod;
            n >>= 1;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        if (n <= k) {
            long x = 1;
            for (int i = 0; i < n - 1; i++) {
                x = (x * (2 * n - 1 - i)) % mod;
            }
            long y = 1;
            for (int i = 0; i < n - 1; i++) {
                y = (y * (i + 1)) % mod;
            }
            System.out.println((x * bp(y, 1000000005)) % mod);
        } else {
            long x = 1;
            long y = 1;
            long t = 1;
            for (int i = 0; i < k; i++) {
                t = (t * (i + 1)) % mod;
                y = (y * (n - 1 - i)) % mod;
                y = (y * (n - i)) % mod;
                long c = bp(t, 1000000005);
                x = (x + (y * c * c)) % mod;
            }
            System.out.println(x);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, and then it calculates the result based on the conditions in the Python code. The `bp` function is used to calculate the power of a number modulo `mod`.<｜end▁of▁sentence｜>
