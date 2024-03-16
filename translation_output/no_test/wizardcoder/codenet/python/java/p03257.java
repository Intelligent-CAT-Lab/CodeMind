Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int U = 100000;
        boolean[] isPrime = new boolean[U+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int p = 2; p*p <= U; p++) {
            if (isPrime[p]) {
                for (int i = p*p; i <= U; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= U; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        int MM = 510;
        int M = 255;

        int[][] A = new int[MM+1][MM+1];
        for (int n = 0; n <= MM; n++) {
            if (n % 2 == 0) {
                for (int i = n/2; i < n/2+M && i < MM; i++) {
                    A[n][i] = primes.get(i);
                }
                for (int i = MM+M-n/2; i < 2*MM-n/2 && i < MM; i++) {
                    A[n][i] = primes.get(i);
                }
                for (int i = n/2+1; i < n/2+M && i < MM; i += 2) {
                    A[n][i] *= A[n][i-1];
                }
                for (int i = n/2+2; i < n/2+M && i < MM; i += 2) {
                    A[n][i] *= A[n][i-2];
                }
                for (int i = n/2+1; i < n/2+M && i < MM; i += 2) {
                    A[n][i] += 1;
                }
            } else {
                for (int i = (n+1)/2; i < (n+1)/2+M && i < MM; i++) {
                    A[n][i] = primes.get(i);
                }
                for (int i = MM+M-(n-1)/2; i < 2*MM-(n-1)/2 && i < MM; i++) {
                    A[n][i] = primes.get(i);
                }
                for (int i = (n+1)/2+1; i < (n+1)/2+M && i < MM; i += 2) {
                    A[n][i] *= A[n][i-1];
                }
                for (int i = (n+1)/2+2; i < (n+1)/2+M && i < MM; i += 2) {
                    A[n][i] *= A[n][i-2];
                }
                for (int i = (n+1)/2+1; i < (n+1)/2+M && i < MM; i += 2) {
                    A[n][i] += 1;
                }
            }
        }

        int N = Integer.parseInt(br.readLine());
        A = Arrays.copyOfRange(A, 1, N+1);
        A = Arrays.copyOfRange(A, 1, N+1);

        StringBuilder sb = new StringBuilder();
        for (int[] row : A) {
            for (int num : row) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());

        br.close();
        bw.close();
    }
}
```<|endoftext|>
