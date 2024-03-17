<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
```java
import java.util.*;

public class Main {
    final static int MOD = 998244353;
    final static int U = 10000;
    static int[] fact = new int[U + 1];
    static int[] fact_inv = new int[U + 1];

    static void init() {
        Arrays.fill(fact, 1);
        Arrays.fill(fact_inv, 1);
        for (int n = 1; n <= U; n++) {
            fact[n] = fact[n - 1] * n % MOD;
            fact_inv[n] = pow(fact[n], MOD - 2, MOD);
        }
        for (int n = U; n >= 1; n--) {
            fact_inv[n - 1] = fact_inv[n] * n % MOD;
        }
    }

    static int comb(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return fact[n] * fact_inv[k] * fact_inv[n - k] % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K, N;
        K = sc.nextInt();
        N = sc.nextInt();
        init();
        List<Integer> answer = new ArrayList<>();
        for (int S = 3; S <= K + 1; S += 2) {
            int x = F((S - 1) / 2, K - S + 1, N);
            answer.add(x);
            answer.add(x);
        }
        if ((K & 1) == 1) {
            answer = answer.subList(0, answer.size() - 1);
            answer.addAll(answer.subList(answer.size() - 1, answer.size() - 1));
        } else {
            answer.addAll(answer.subList(answer.size() - 1, answer.size() - 1));
        }
        System.out.println(answer);
    }

    static int F(int x, int y, int N) {
        int n = Math.min(x, N);
        return (int) Math.pow(2, n, MOD) * sum(comb(x, i) * comb(N + y - 1, i + y - 1) % MOD for i in range(n + 1)) % MOD;
    }

    static long sum(long[] arr) {
        long sum = 0;
        for (long a : arr) {
            sum += a;
        }
        return sum;
    }
}
```</s>
