<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3

Expected output:
41
86
72
-53
36

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
import java.util.*;
import java.math.*;

public class Main {
    static final BigInteger MOD = BigInteger.valueOf(998244353);
    static final int U = 10000;
    static BigInteger[] fact = new BigInteger[U+1];
    static BigInteger[] fact_inv = new BigInteger[U+1];

    static void precompute() {
        fact[0] = BigInteger.ONE;
        fact_inv[0] = BigInteger.ONE;
        for (int n = 1; n <= U; ++n) {
            fact[n] = fact[n-1].multiply(BigInteger.valueOf(n));
            fact[n] = fact[n].mod(MOD);
            fact_inv[n] = fact[n].modInverse(MOD);
        }
        for (int n = U; n > 0; --n) {
            fact_inv[n-1] = fact_inv[n].multiply(BigInteger.valueOf(n));
            fact_inv[n-1] = fact_inv[n-1].mod(MOD);
        }
    }

    static BigInteger comb(int n, int k) {
        if (k < 0 || k > n) {
            return BigInteger.ZERO;
        }
        return fact[n].multiply(fact_inv[k]).multiply(fact_inv[n-k]).mod(MOD);
    }

    static BigInteger F(int x, int y, int N) {
        int n = Math.min(x, N);
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i <= n; ++i) {
            BigInteger temp = comb(x,i).multiply(BigInteger.valueOf(2).modPow(BigInteger.valueOf(i))).multiply(comb(N+y-1,i+y-1));
            sum = sum.add(temp.mod(MOD));
        }
        return sum.mod(MOD);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int N = in.nextInt();
        precompute();
        ArrayList<BigInteger> answer = new ArrayList<>();
        for (int S = 3; S <= K+2; S += 2) {
            BigInteger x = F((S-1)/2, K - S + 1, N);
            answer.add(x);
            answer.add(x);
        }
        if ((K & 1) == 1) {
            answer.remove(answer.size()-1);
        } else {
            int size = answer.size();
            for (int i = size-2; i >= 0; --i) {
                answer.add(answer.get(i));
            }
        }
        for (BigInteger num : answer) {
            System.out.println(num);
        }
    }
}
```

This Java code does the same thing as your Python code. It precomputes factorials and their inverses, then uses these to compute combinations. The `F` function calculates a value based on the input parameters, and the main function generates the output.
<|EOT|>
