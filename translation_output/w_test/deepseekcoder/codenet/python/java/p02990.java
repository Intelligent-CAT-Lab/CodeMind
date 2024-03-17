<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
3
6
1


```
import bisect
import sys
sys.setrecursionlimit(10**9)

def main():
    N,K = map(int,input().split())
    MOD = 10**9+7

    def between(n,k,i):
        if i == 1:
            return 1
        return comb(k-1,i-1,MOD)

    def comb(n, r, mod):
        r = min(r, n-r)
        res = 1
        for i in range(r):
            res = res * (n - i) * pow(i+1, mod-2, mod) % mod
        return res

    for i in range(1,K+1):
        if i > K or i > N-K+1:
            print(0)
        else:
            ans = comb(N-K+1,i,MOD) * between(N,K,i)
            ans %= MOD
            print(ans)



if __name__ == "__main__":
  main()
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    private static final long MOD = (long)Math.pow(10,9)+7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        for (int i = 1; i <= K; i++) {
            if (i > K || i > N-K+1) {
                System.out.println(0);
            } else {
                long ans = comb(N-K+1,i) * between(N,K,i);
                ans %= MOD;
                System.out.println(ans);
            }
        }
    }

    private static long comb(long n, long r) {
        r = Math.min(r, n-r);
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) / (i+1);
            res %= MOD;
        }
        return res;
    }

    private static long between(int n, int k, int i) {
        if (i == 1) {
            return 1;
        }
        return comb(k-1,i-1);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, calculates the combinations and prints the results. The `comb` function calculates the combination of `n` and `r`, and the `between` function calculates the value of `i` in the formula. The `MOD` constant is used for the modulo operation to prevent overflow.
<|EOT|>
