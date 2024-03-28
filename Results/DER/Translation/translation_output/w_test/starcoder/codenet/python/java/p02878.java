<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = 998244353;
        int P = N + 1;
        int[] F = new int[P];
        int[] I = new int[P];
        int z = 0;
        F[0] = 1;
        I[0] = 1;
        for (int n = 1; n < P; n++) {
            F[n] = F[n - 1] * n % M;
        }
        I[N] = 1;
        for (int n = N; n > 0; n--) {
            I[n - 1] = I[n] * n % M;
        }
        for (int k = Math.min(A + 1, N - B); k >= 0; k--) {
            int Q = N - B - k - 1;
            z += (B - k) * F[B + k - 1] * I[B] * I[k] * F[Q + A - k] * I[Q] * I[A - k];
        }
        System.out.println(z % M);
    }
}
```
<|endoftext|>
