<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    static long mod = (long)Math.pow(10, 9) + 7;

    static long bp(long a, long n) {
        long r = 1;
        while(n > 0) {
            if(n % 2 == 1) {
                r = (r * a) % mod;
            }
            a = (a * a) % mod;
            n >>= 1;
        }
        return r;
    }

    static long[] i2() {
        Scanner scanner = new Scanner(System.in);
        long[] input = new long[2];
        String[] str = scanner.nextLine().split(" ");
        for(int i = 0; i < 2; i++) {
            input[i] = Long.parseLong(str[i]);
        }
        return input;
    }

    public static void main(String[] args) {
        long[] input = i2();
        long n = input[0];
        long k = input[1];

        if(n <= k) {
            long x = 1;
            for(int i = 0; i < n - 1; i++) {
                x = (x * ((2 * n - 1 - i) % mod)) % mod;
            }
            long y = 1;
            for(int i = 0; i < n - 1; i++) {
                y = (y * ((i + 1) % mod)) % mod;
            }
            System.out.println((x * bp(y, (long)Math.pow(10, 9) + 5)) % mod);
        } else {
            long x = 1;
            long y = 1;
            long t = 1;
            for(int i = 0; i < k; i++) {
                t = (t * ((i + 1) % mod)) % mod;
                y = (y * ((n - 1 - i) % mod)) % mod;
                y = (y * ((n - i) % mod)) % mod;
                long c = bp(t, (long)Math.pow(10, 9) + 5);
                x = (x + (y * c * c) % mod) % mod;
            }
            System.out.println(x);
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads two integers from the input, and then calculates and prints the result based on the conditions in the Python code. The `bp` function is a binary power function that calculates `a` to the power of `n` under modulo `mod`. The `i2` function reads two integers from the input and returns them as an array. The `main` function is the entry point of the program, which calls `i2` to read the input, and then calculates and prints the result based on the conditions in the Python code.
<|EOT|>
