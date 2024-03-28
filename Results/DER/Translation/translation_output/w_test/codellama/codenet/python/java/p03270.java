<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3

Expected output:
7
7
4
7
7


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
[/INST]

Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();

        int MOD = 998244353;
        int U = 10000;
        int[] fact = new int[U + 1];
        int[] fact_inv = new int[U + 1];
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n - 1] * n % MOD;
            fact_inv[n] = pow(fact[n], MOD - 2, MOD);
        }
        for (int n = U; n >= 1; n--) {
            fact_inv[n - 1] = fact_inv[n] * n % MOD;
        }

        int[] answer = new int[K + 1];
        for (int S = 3; S <= K + 2; S += 2) {
            int x = F((S - 1) / 2, K - S + 1, N);
            answer[S - 1] = x;
            answer[S] = x;
        }

        if (K % 2 == 1) {
            answer = answer.subList(0, answer.size() - 1).toArray();
            answer = answer.subList(0, answer.size() - 1).toArray();
        } else {
            answer = answer.subList(0, answer.size() - 1).toArray();
            answer = answer.subList(0, answer.size() - 1).toArray();
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static int F(int x, int y, int N) {
        int n = Math.min(x, N);
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += comb(x, i) * pow(2, i, MOD) * comb(N + y - 1, i + y - 1) % MOD;
        }
        return sum % MOD;
    }

    public static int comb(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return fact[n] * fact_inv[k] * fact_inv[n - k] % MOD;
    }

    public static int pow(int x, int y, int MOD) {
        int result = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % MOD;
            }
            y /= 2;
            x = (x * x) % MOD;
        }
        return result;
    }
}
```
Note that this code is not optimized for performance, and it may not be the most efficient way to solve the problem. However, it should produce the same output as the Python code for the given input.</s>
