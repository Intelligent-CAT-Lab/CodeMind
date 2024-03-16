<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
sys.setrecursionlimit(10**7)

mod = 10**9 + 7

star = [[None] * 1001 for _ in range(1001)]
for i in range(1001):
    star[i][1] = 1
    star[i][i] = 1
    star[i][0] = 0

def search(n, k):
    if n < k:
        return 0
    elif star[n][k] != None:
        return star[n][k] % mod
    else:
        star[n][k] = (search(n-1, k-1) + k * search(n-1, k)) % mod
        return star[n][k]

n, k = map(int, input().split())
ans = 0
for i in range(k+1):
    ans += search(n, i)
    ans = ans % mod

print(ans)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    static long mod = (long)Math.pow(10, 9) + 7;
    static long[][] star = new long[1001][1001];

    static long search(int n, int k) {
        if (n < k) {
            return 0;
        } else if (star[n][k] != 0) {
            return star[n][k] % mod;
        } else {
            star[n][k] = (search(n-1, k-1) + k * search(n-1, k)) % mod;
            return star[n][k];
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1001; i++) {
            star[i][1] = 1;
            star[i][i] = 1;
            star[i][0] = 0;
        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        for (int i = 0; i <= k; i++) {
            ans += search(n, i);
            ans = ans % mod;
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It uses a dynamic programming approach to store the results of the recursive function `search` in a 2D array `star` to avoid redundant calculations. The `search` function calculates the binomial coefficient `n choose k` modulo `10^9 + 7`. The main function reads two integers `n` and `k` from the input, calculates the sum of `n choose i` for `i` from `0` to `k`, and prints the result modulo `10^9 + 7`.
<|EOT|>
