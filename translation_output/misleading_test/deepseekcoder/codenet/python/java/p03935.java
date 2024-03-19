<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 7

Expected output:
81

```
def f(n):
	i=e=[1,0,0,1];z=[1,1,1,0]
	while n:e=[e,g(e,z)][n%2];z=g(z,z);n//=2
	return e[1]
M=998244353;g=lambda a,b:[(a[0]*b[0]+a[1]*b[2])%M,(a[0]*b[1]+a[1]*b[3])%M,(a[2]*b[0]+a[3]*b[2])%M,(a[2]*b[1]+a[3]*b[3])%M];n,m=map(int,input().split());I=[1,1];r=f(m+2*n-2);c=1
for i in range(2,n):I+=[(M-M//i)*I[M%i]%M]
for i in range(n-1):r=(r+c*(M-f(2*n-2-2*i)))%M;c=c*(m+i)*I[i+1]%M
print(r)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    static final long M = 998244353;
    static long[] g(long[] a, long[] b) {
        return new long[]{
                (a[0]*b[0]+a[1]*b[2])%M,
                (a[0]*b[1]+a[1]*b[3])%M,
                (a[2]*b[0]+a[3]*b[2])%M,
                (a[2]*b[1]+a[3]*b[3])%M
        };
    }

    static long f(long n) {
        long[] e = {1,0,0,1}, z = {1,1,1,0};
        while (n > 0) {
            e = (n%2 == 0) ? e : g(e,z);
            z = g(z,z);
            n /= 2;
        }
        return e[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long[] I = new long[(int)n+1];
        I[0] = 1;
        I[1] = 1;
        for (int i = 2; i <= n; i++) {
            I[i] = ((M-M/i)*I[(int) (M%i)])%M;
        }
        long r = f(m+2*n-2);
        long c = 1;
        for (int i = 1; i < n; i++) {
            r = (r+c*(M-f(2*n-2-2*i)))%M;
            c = c*(m+i)*I[i+1]%M;
        }
        System.out.println(r);
    }
}
```

This Java code does the same thing as the Python code. It reads two long integers from the standard input, calculates the result using the `f` function, and prints the result. The `f` function calculates the n-th Fibonacci number modulo `M`. The `g` function is a helper function that performs matrix multiplication modulo `M`. The `I` array is used to calculate the inverse of the factorial of the numbers from 1 to `n`.
<|EOT|>
