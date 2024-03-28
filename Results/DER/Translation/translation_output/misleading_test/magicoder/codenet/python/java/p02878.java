<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 1 3

Expected output:
65

```
N,A,B=map(int,input().split());M=998244353;P=N+1;f=1;F=[1]*P;I=[1]*P;z=0;R=range
for n in R(1,P):F[n]=f=f*n%M
I[N]=i=pow(f,M-2,M)
for n in R(N,1,-1):I[n-1]=i=i*n%M
for k in R(min(A+1,N-B)if N-B-A else A+1):Q=N-B-k-1;z+=(B-k)*F[B+k-1]*I[B]*I[k]*F[Q+A-k]*I[Q]*I[A-k]
print(z%M if B else 1)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int M = 998244353;
        int P = N + 1;
        long f = 1;
        long[] F = new long[P];
        long[] I = new long[P];
        long z = 0;
        F[0] = 1;
        I[N] = 1;
        for (int n = 1; n < P; n++) {
            F[n] = f = (f * n) % M;
        }
        for (int n = N; n > 0; n--) {
            I[n - 1] = (I[n] * n) % M;
        }
        for (int k = 0; k < Math.min(A + 1, N - B); k++) {
            int Q = N - B - k - 1;
            z = (z + (B - k) * F[B + k - 1] * I[B] * I[k] * F[Q + A - k] * I[Q] * I[A - k]) % M;
        }
        System.out.println(z % M);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calculates the factorial and inverse factorial arrays, and then calculates the result. The result is printed to the standard output.<｜end▁of▁sentence｜>
