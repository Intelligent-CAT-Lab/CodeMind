<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N,A,B=map(int,input().split());M=998244353;P=N+1;f=1;F=[1]*P;I=[1]*P;z=0;R=range
for n in R(1,P):F[n]=f=f*n%M
I[N]=i=pow(f,M-2,M)
for n in R(N,1,-1):I[n-1]=i=i*n%M
for k in R(min(A+1,N-B)if N-B-A else A+1):Q=N-B-k-1;z+=(B-k)*F[B+k-1]*I[B]*I[k]*F[Q+A-k]*I[Q]*I[A-k]
print(z%M if B else 1)
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        long M = 998244353;
        int P = N + 1;
        long f = 1;
        long[] F = new long[P];
        long[] I = new long[P];
        long z = 0;
        F[0] = 1;
        I[N] = pow(F[N], M - 2, M);
        for (int n = 1; n < P; n++) {
            F[n] = f = (f * n) % M;
            I[N - n] = (I[N - n + 1] * (N - n + 1)) % M;
        }
        for (int k = 0; k <= Math.min(A, N - B); k++) {
            int Q = N - B - k - 1;
            z = (z + ((B - k) * F[B + k - 1] % M * I[B] % M * I[k] % M * F[Q + A - k] % M * I[Q] % M * I[A - k] % M) % M) % M;
        }
        System.out.println(z == 0 ? (int) M : (int) z);
    }

    public static long pow(long a, long b, long m) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b = b / 2;
        }
        return result;
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the standard input, calculates the factorial and inverse factorial arrays, and then calculates the result. The `pow` function is used to calculate the modular inverse. The result is printed to the standard output.
<|EOT|>
