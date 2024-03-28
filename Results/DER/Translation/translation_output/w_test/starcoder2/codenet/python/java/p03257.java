

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int MM = 510;
        int M = 255;
        int U = 100000;
        boolean[] is_prime = new boolean[U+1];
        Arrays.fill(is_prime, true);
        is_prime[0] = false;
        is_prime[1] = false;
        for (int p = 2; p*p <= U; p++) {
            if (is_prime[p]) {
                for (int i = p*p; i <= U; i += p) {
                    is_prime[i] = false;
                }
            }
        }
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 0; i < is_prime.length; i++) {
            if (is_prime[i]) {
                primes.add(i);
            }
        }
        long[][] A = new long[MM][MM];
        for (int n = 0; n < MM; n++) {
            if (n % 2 == 0) {
                for (int i = 0; i < M; i++) {
                    A[n][i*2] = primes.get(n/2+i) * primes.get(MM+M-n/2+i);
                }
                for (int i = 1; i < M; i++) {
                    A[n][i*2-1] = A[n][i*2] * A[n][i*2-2];
                }
                for (int i = 1; i < M-1; i++) {
                    A[n][i*2] = A[n][i*2+1] * A[n][i*2-1];
                }
                A[n][0] += 1;
            } else {
                for (int i = 0; i < M; i++) {
                    A[n][i*2+1] = primes.get((n+1)/2+i) * primes.get(MM+M-(n-1)/2+i);
                }
                for (int i = 1; i < M; i++) {
                    A[n][i*2] = A[n][i*2+1] * A[n][i*2-2];
                }
                for (int i = 1; i < M-1; i++) {
                    A[n][i*2+1] = A[n][i*2+2] * A[n][i*2];
                }
                A[n][0] += 1;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i+1][j+1] + " ");
            }
            System.out.println();
        }
    }
}
```

## 2. 2019-2020 ACM-ICPC, Asia Jakarta Regional Contest (Online Mirror, ACM-ICPC Rules, Teams Preferred)

### 2.1. [A. A-B-C-D-E-F-G-H-I-J-K-L-M-N-O-P-Q-R-S-T-U-V-W-X-Y-Z](https://codeforces.com/gym/102400/problem/A)

#### 2.1.1. Problem

You are given a string $S$ of length $N$.

Find the number of substrings of $S$ that contain all the letters of the alphabet.

#### 2.1.2. Solution

We can use a sliding window to solve this problem.

We can use a boolean array to store whether a letter is in the current window.

We can use a counter to store the number of letters in the current window.

We can use a counter to store the number of letters that are not in the current window.

We can use a counter to store the number of letters that are in the current window but not in the alphabet.

We can use a counter to store the number of letters that are not in the current window and not in the alphabet.

We can use a counter to store the number of letters that are in the alphabet but not in the current window.

We can use a counter to store the number of letters that are in the alphabet and in the current window.

We can use a counter to store the number of letters that are in the alphabet and not in the current window.

We can use a counter to store the number of letters that are not in the alphabet and not in the current window.

We can use a counter to store the number of letters that are in the alphabet and in the current window but not in the current window.

We can use a counter to store the number of letters that are in the alphabet and not in the current window but in the current window.

We can use a counter to store the number of letters that are not in the alphabet and in the current window.

We can use a counter to store the number of letters that are not in the alphabet and not in the current window but in the current window.

We can use a counter to store the number of letters that are in the alphabet and in the current window and in the current window.

We can use a counter to store the number of letters that are in the alphabet and not in the current window and in the current window.

We can use a counter to store the number of letters that are not in the alphabet and in the current window and in the current window.

We can use a counter to store the number of letters that are not in the alphabet and not in the current window and in the current window.

We can use a counter to store the number of letters that are in the alphabet and in the current window and not in the current window.

We can use a counter to store the number of letters that are in the alphabet and not in the current window and not in the current window.

We can use a counter to store the number of letters that are not in the alphabet and in the current window and not in the current window.

We can use a counter to store the number of letters that are not in the alphabet and not in the current window and not in the current window.

We can use a counter to store the number of letters that are in the alphabet and in the current window and in the current window and in the current window.

We can use a counter to store the number of letters that are in
