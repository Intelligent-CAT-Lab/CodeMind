<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]

Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n <= k) {
            int x = 1;
            for (int i = 0; i < n - 1; i++) {
                x = (x * (2 * n - 1 - i)) % 1000000007;
            }
            int y = 1;
            for (int i = 0; i < n - 1; i++) {
                y = (y * (i + 1)) % 1000000007;
            }
            System.out.println((x * bp(y, 1000000005)) % 1000000007);
        } else {
            int x = 1;
            int y = 1;
            int t = 1;
            for (int i = 0; i < k; i++) {
                t = (t * (i + 1)) % 1000000007;
                y = (y * (n - 1 - i)) % 1000000007;
                y = (y * (n - i)) % 1000000007;
                int c = bp(t, 1000000005);
                x = (x + y * c * c) % 1000000007;
            }
            System.out.println(x);
        }
    }

    public static int bp(int a, int n) {
        int r = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                r = (r * a) % 1000000007;
            }
            a = (a * a) % 1000000007;
            n /= 2;
        }
        return r;
    }
}
```
Note that the `bp` function is the same as the `pow` function in Python, but it has been modified to work with the modulo 1000000007.</s>
