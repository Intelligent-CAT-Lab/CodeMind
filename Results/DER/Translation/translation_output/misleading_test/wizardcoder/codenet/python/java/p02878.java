Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = 998244353;
        int P = N + 1;
        int f = 1;
        int[] F = new int[P];
        int[] I = new int[P];
        int z = 0;
        for (int n = 1; n <= P; n++) {
            F[n] = f = f * n % M;
        }
        I[N] = i = pow(f, M - 2, M);
        for (int n = N; n >= 1; n--) {
            I[n - 1] = i = i * n % M;
        }
        for (int k = Math.min(A + 1, N - B) if (N - B - A) >= 0 else A + 1; k >= 1; k--) {
            int Q = N - B - k - 1;
            z += (B - k) * F[B + k - 1] * I[B] * I[k] * F[Q + A - k] * I[Q] * I[A - k];
        }
        System.out.println(z % M if (B!= 0) else 1);
    }

    public static int pow(int a, int b, int m) {
        int res = 1;
        a %= m;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return res;
    }
}
```<|endoftext|>
