<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
-39

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
Here is the Java version of the provided Python code:

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

This Java code does the same thing as the Python code. It uses dynamic programming to store the results of the `search` function in a 2D array `star` to avoid redundant calculations. The `search` function calculates the number of ways to choose `k` items from `n` items. The main function reads two integers from the input, calculates the sum of the results of the `search` function for all `k` from 0 to `k`, and prints the result.
<|EOT|>
