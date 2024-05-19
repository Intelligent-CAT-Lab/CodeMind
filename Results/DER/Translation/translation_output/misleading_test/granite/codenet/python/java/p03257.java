System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
4 7

```
import sys
input = sys.stdin.readline

import numpy as np

U = 10 ** 5
is_prime = np.zeros(U+1, dtype=np.bool)
is_prime[2] = 1
is_prime[3::2] = 1
for p in range(3,U+1,2):
    if p*p > U:
        break
    if is_prime[p]:
        is_prime[p*p::2*p] = 0

primes = is_prime.nonzero()[0].astype(np.int64)

MM = 510
M = 255

A = np.ones((MM,MM), dtype = np.int64)
for n in range(MM):
    if n % 2 == 0:
        A[n,::2] *= primes[n//2:n//2+M]
        A[n,::2] *= primes[MM+M-n//2:2*MM-n//2]
        A[n,1::2] *= A[n,::2]
        A[n,1:-1:2] *= A[n,2::2]
        A[n,1::2] += 1
    elif n % 2 == 1:
        A[n,1::2] *= primes[(n+1)//2:(n+1)//2+M]
        A[n,1::2] *= primes[MM+M-(n-1)//2:2*MM-(n-1)//2]
        A[n,::2] *= A[n,1::2]
        A[n,2::2] *= A[n,1:-1:2]
        A[n,::2] += 1

N = int(input())
A = A[1:N+1,1:N+1]

answer = '\n'.join(' '.join(row) for row in A.astype(str))
print(answer)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int U = 100000;
        boolean[] is_prime = new boolean[U+1];
        Arrays.fill(is_prime, true);
        is_prime[2] = true;
        is_prime[3::2] = true;
        for (int p = 3; p*p <= U; p += 2) {
            if (is_prime[p]) {
                for (int i = p*p; i <= U; i += 2*p) {
                    is_prime[i] = false;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i <= U; i++) {
            if (is_prime[i]) {
                primes.add(i);
            }
        }
        int MM = 510;
        int M = 255;
        long[][] A = new long[MM][MM];
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < M; i++) {
                    A[n][2*i] = primes.get(n/2+i);
                    A[n][2*i+1] = A[n][2*i] * A[n][2*i+2];
                    A[n][2*i+2] = A[n][2*i] * A[n][2*i-1];
                }
            } else {
                for (int i = 0; i < M; i++) {
                    A[n][2*i+1] = primes.get((n+1)/2+i);
                    A[n][2*i] = A[n][2*i+1] * A[n][2*i+2];
                    A[n][2*i+2] = A[n][2*i+1] * A[n][2*i-1];
                }
            }
        }
        int N = sc.nextInt();
        long[][] result = new long[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = A[i+1][j+1];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```<|endoftext|>
