<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
input = sys.stdin.readline

# K+1 - x ã§ãã¤ã -> i ã¨ 2K+2-i ã¯åã

MOD = 998244353
U = 10000
fact = [1] * (U+1)
fact_inv = [1] * (U+1)
for n in range(1,U+1):
    fact[n] = fact[n-1] * n % MOD
fact_inv[n] = pow(fact[n], MOD-2, MOD)
for n in range(U,0,-1):
    fact_inv[n-1] = fact_inv[n] * n % MOD

def comb(n,k):
    if not (0 <= k <= n):
        return 0
    return fact[n] * fact_inv[k] * fact_inv[n-k] % MOD

K,N = map(int,input().split())

def F(x,y,N):
    n = min(x, N)
    return sum(comb(x,i) * pow(2,i,MOD) * comb(N+y-1,i+y-1) % MOD for i in range(n+1)) % MOD

answer = []
for S in range(3,K+3,2):
    x = F((S-1)//2, K - S + 1, N)
    answer.append(x)
    answer.append(x)

if K & 1:
    answer = answer[:-1]
    answer += answer[:-1][::-1]
else:
    answer += answer[:-1][::-1]    

print('\n'.join(map(str,answer)))


```

### Response:
Here is the Java version of your Python code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static final long MOD = 998244353;
    static final int U = 10000;
    static long[] fact = new long[U+1];
    static long[] fact_inv = new long[U+1];

    static void precompute() {
        fact[0] = 1;
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n-1] * n % MOD;
        }
        fact_inv[U] = pow(fact[U], MOD-2);
        for (int n = U; n > 0; n--) {
            fact_inv[n-1] = fact_inv[n] * n % MOD;
        }
    }

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }

    static long comb(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return fact[n] * fact_inv[k] % MOD * fact_inv[n-k] % MOD;
    }

    static long F(int x, int y, int N) {
        int n = Math.min(x, N);
        long res = 0;
        for (int i = 0; i <= n; i++) {
            res += comb(x,i) * pow(2,i) % MOD * comb(N+y-1,i+y-1) % MOD;
        }
        return res % MOD;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int K = Integer.parseInt(line[0]);
        int N = Integer.parseInt(line[1]);
        precompute();
        List<Long> answer = new ArrayList<>();
        for (int S = 3; S <= K+2; S += 2) {
            long x = F((S-1)/2, K - S + 1, N);
            answer.add(x);
            answer.add(x);
        }
        if ((K & 1) != 0) {
            answer.remove(answer.size()-1);
            for (int i = answer.size()-2; i >= 0; i--) {
                answer.add(answer.get(i));
            }
        } else {
            for (int i = answer.size()-2; i >= 0; i--) {
                answer.add(answer.get(i));
            }
        }
        for (long num : answer) {
            System.out.println(num);
        }
    }
}
```

This Java code does the same thing as your Python code. It precomputes factorials and their inverses, then uses these to compute combinations. The `F` function calculates a sum using these combinations. The main function reads the input, calls `F` for different values of `S`, and prints the results.
<|EOT|>
