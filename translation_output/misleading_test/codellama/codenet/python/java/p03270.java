<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();

        int[] fact = new int[10001];
        int[] fact_inv = new int[10001];
        for (int n = 1; n <= 10000; n++) {
            fact[n] = fact[n - 1] * n % 998244353;
            fact_inv[n] = pow(fact[n], 998244353 - 2, 998244353);
        }
        for (int n = 10000; n >= 1; n--) {
            fact_inv[n - 1] = fact_inv[n] * n % 998244353;
        }

        int[] answer = new int[K + 1];
        for (int S = 3; S <= K + 2; S += 2) {
            int x = F((S - 1) / 2, K - S + 1, N);
            answer[S - 3] = x;
            answer[S - 2] = x;
        }

        if (K % 2 == 0) {
            answer = answer.clone();
            answer = answer.clone();
        } else {
            answer = answer.clone();
            answer = answer.clone();
            for (int i = 0; i < answer.length / 2; i++) {
                int temp = answer[i];
                answer[i] = answer[answer.length - i - 1];
                answer[answer.length - i - 1] = temp;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static int F(int x, int y, int N) {
        int n = Math.min(x, N);
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += comb(x, i) * pow(2, i, 998244353) * comb(N + y - 1, i + y - 1) % 998244353;
        }
        return sum % 998244353;
    }

    public static int comb(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return fact[n] * fact_inv[k] * fact_inv[n - k] % 998244353;
    }

    public static int pow(int a, int b, int mod) {
        int result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return result;
    }
}
```
This is the Java code for the given Python code. It uses the same algorithm and data structures as the Python code, but it is written in Java. The code reads the input from the user, calculates the answer, and then prints it to the console.

Note that the `pow` function is defined in the code, as it is not a built-in function in Java. The `pow` function takes three arguments: `a`, `b`, and `mod`. It calculates `a` raised to the power of `b`, modulo `mod`. This function is used in the `F` function to calculate the value of `x`.

Also note that the `comb` function is defined in the code, as it is not a built-in function in Java. The `comb` function takes two arguments: `n` and `k`. It calculates the binomial coefficient `n` choose `k`, modulo `998244353`. This function is used in the `F` function to calculate the value of `x`.

I hope this helps! Let me know if you have any questions.</s>
