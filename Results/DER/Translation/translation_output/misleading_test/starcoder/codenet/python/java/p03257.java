<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 255;
        int MM = 510;
        int[] primes = new int[MM];
        boolean[] isPrime = new boolean[MM];
        Arrays.fill(isPrime, true);
        for (int i = 2; i < MM; i++) {
            if (isPrime[i]) {
                for (int j = i; j < MM; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 0; i < MM; i++) {
            if (isPrime[i]) {
                primes[i] = i;
            }
        }
        int[][] A = new int[MM][MM];
        for (int i = 0; i < MM; i++) {
            for (int j = 0; j < MM; j++) {
                A[i][j] = 1;
            }
        }
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = n / 2; i < n / 2 + M; i++) {
                    if (i < MM) {
                        A[n][i] *= primes[i];
                    }
                }
                for (int i = MM + M - n / 2; i < 2 * MM - n / 2; i++) {
                    if (i < MM) {
                        A[n][i] *= primes[i];
                    }
                }
                for (int i = 1; i < MM; i += 2) {
                    A[n][i] *= A[n][i - 1];
                }
                for (int i = 2; i < MM; i += 2) {
                    A[n][i] *= A[n][i + 1];
                }
                for (int i = 1; i < MM; i += 2) {
                    A[n][i] += 1;
                }
            } else if (n % 2 == 1) {
                for (int i = (n + 1) / 2; i < (n + 1) / 2 + M; i++) {
                    if (i < MM) {
                        A[n][i] *= primes[i];
                    }
                }
                for (int i = MM + M - (n - 1) / 2; i < 2 * MM - (n - 1) / 2; i++) {
                    if (i < MM) {
                        A[n][i] *= primes[i];
                    }
                }
                for (int i = 0; i < MM; i += 2) {
                    A[n][i] *= A[n][i + 1];
                }
                for (int i = 1; i < MM; i += 2) {
                    A[n][i] *= A[n][i - 1];
                }
                for (int i = 0; i < MM; i += 2) {
                    A[n][i] += 1;
                }
            }
        }
        A = Arrays.copyOfRange(A, 1, N + 1);
        for (int i = 0; i < A.length; i++) {
            A[i] = Arrays.copyOfRange(A[i], 1, N + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int[] row : A) {
            for (int i : row) {
                sb.append(i);
                sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
```
'''
<|endoftext|>
