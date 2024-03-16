<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
import java.util.*;
import java.math.*;

public class Main {
    static final int U = 100000;
    static boolean[] isPrime = new boolean[U+1];
    static ArrayList<Integer> primes = new ArrayList<>();
    static BigInteger[][] A;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        sieve();
        int MM = 510;
        int M = 255;
        A = new BigInteger[MM][MM];
        for (int i = 0; i < MM; i++)
            Arrays.fill(A[i], BigInteger.ONE);
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < M; i++) {
                    A[n][i*2] = A[n][i*2].multiply(BigInteger.valueOf(primes.get(n/2+i)));
                    A[n][i*2] = A[n][i*2].multiply(BigInteger.valueOf(primes.get(MM+M-n/2+i)));
                    if (i > 0) {
                        A[n][i*2] = A[n][i*2].multiply(A[n][(i-1)*2+1]);
                        A[n][i*2+1] = A[n][i*2];
                    }
                }
                for (int i = M; i < MM-n/2; i++) {
                    A[n][i*2] = A[n][i*2].multiply(BigInteger.valueOf(primes.get(MM+i)));
                    A[n][i*2] = A[n][i*2].multiply(BigInteger.valueOf(primes.get(2*MM-n/2-i)));
                    if (i > 0) {
                        A[n][i*2] = A[n][i*2].multiply(A[n][(i-1)*2+1]);
                        A[n][i*2+1] = A[n][i*2];
                    }
                }
            } else {
                for (int i = 0; i < M; i++) {
                    A[n][i*2+1] = A[n][i*2+1].multiply(BigInteger.valueOf(primes.get((n+1)/2+i)));
                    A[n][i*2+1] = A[n][i*2+1].multiply(BigInteger.valueOf(primes.get(MM+M-(n-1)/2+i)));
                    if (i > 0) {
                        A[n][i*2+1] = A[n][i*2+1].multiply(A[n][(i-1)*2]);
                        A[n][i*2] = A[n][i*2+1];
                    }
                }
                for (int i = M; i < MM-(n-1)/2; i++) {
                    A[n][i*2+1] = A[n][i*2+1].multiply(BigInteger.valueOf(primes.get(MM+i)));
                    A[n][i*2+1] = A[n][i*2+1].multiply(BigInteger.valueOf(primes.get(2*MM-(n-1)/2-i)));
                    if (i > 0) {
                        A[n][i*2+1] = A[n][i*2+1].multiply(A[n][(i-1)*2]);
                        A[n][i*2] = A[n][i*2+1];
                    }
                }
            }
            for (int i = 0; i < MM; i++)
                A[n][i] = A[n][i].add(BigInteger.ONE);
        }
        int N = in.nextInt();
        for (int i = 0; i < N; i++)
            System.out.println(A[i].toString());
    }

    static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int p = 2; p*p <= U; p++) {
            if (isPrime[p]) {
                for (int i = p*p; i <= U; i += p)
                    isPrime[i] = false;
            }
        }
        for (int p = 2; p <= U; p++) {
            if (isPrime[p])
                primes.add(p);
        }
    }
}
```

This Java code does the same thing as the Python code. It first generates a list of prime numbers up to a certain limit (U). Then it creates a 2D array A of BigIntegers, and populates it with prime numbers according to the rules of the original Python code. Finally, it reads an integer N from the standard input, prints the first N rows of A, and each row as a string.
<|EOT|>
