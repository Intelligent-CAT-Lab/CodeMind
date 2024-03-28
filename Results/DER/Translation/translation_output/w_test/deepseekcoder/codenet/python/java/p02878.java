<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 1 3

Expected output:
4


```
N,A,B=map(int,input().split());M=998244353;P=N+1;f=1;F=[1]*P;I=[1]*P;z=0;R=range
for n in R(1,P):F[n]=f=f*n%M
I[N]=i=pow(f,M-2,M)
for n in R(N,1,-1):I[n-1]=i=i*n%M
for k in R(min(A+1,N-B)if N-B-A else A+1):Q=N-B-k-1;z+=(B-k)*F[B+k-1]*I[B]*I[k]*F[Q+A-k]*I[Q]*I[A-k]
print(z%M if B else 1)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        long M = 998244353;
        int P = N + 1;
        long[] F = new long[P];
        long[] I = new long[P];
        F[0] = I[0] = 1;
        for (int n = 1; n < P; n++) {
            F[n] = (F[n - 1] * n) % M;
            I[n] = pow(F[n], M - 2, M);
        }
        long z = 0;
        int start = Math.min(A + 1, N - B);
        int end = A + 1;
        if (N - B - A == 0) {
            end = A + 2;
        }
        for (int k = start; k >= end; k--) {
            int Q = N - B - k;
            z = (z + (B - k) * F[B + k - 1] * I[B] * I[k] * F[Q + A - k] * I[Q] * I[A - k]) % M;
        }
        if (B == 0) {
            System.out.println(1);
        } else {
            System.out.println(z);
        }
    }

    private static long pow(long a, long b, long m) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calculates the factorial and inverse factorial arrays, and then calculates the result. The `pow` method is used to calculate the modular inverse.
<|EOT|>
