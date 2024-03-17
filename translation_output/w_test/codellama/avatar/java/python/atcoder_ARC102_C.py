<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 200000

Expected output:
0


```
import java.util.Scanner;

public class atcoder_ARC102_C {
    static int mod = 998244353;
    static long[][] nchoosek;

    public static void main(String[] args) {
        nchoosek = new long[4001][4001];

        for (int i = 0; i < nchoosek.length; i++) {
            nchoosek[i][0] = nchoosek[i][i] = 1;
        }

        for (int i = 2; i < nchoosek.length; i++) {
            for (int j = 1; j < i; j++) {
                nchoosek[i][j] = (nchoosek[i - 1][j] + nchoosek[i - 1][j - 1]) % mod;
            }
        }

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 2; i <= 2 * k; i++) {
            int pairs;

            if (i > k) {
                pairs = k - i / 2;
            } else {
                pairs = (i - 1) / 2;
            }

            int active = k - 2 * pairs;

            if (i % 2 == 0) {
                active -= 1;
            }

            long times2 = 1;
            long total = 0;

            for (int j = 0; j <= pairs; j++) {
                long choice = times2 * nchoosek[pairs][j] % mod;
                times2 = times2 * 2 % mod;

                if (active + j - 1 < 0) {
                    continue;
                }

                total += choice * nchoosek[n + active - 1][active + j - 1];

                if (i % 2 == 0) {
                    total += choice * nchoosek[n + active - 2][active + j - 1];
                }

                total %= mod;
            }

            System.out.println(total);
        }
    }
}
```
[/INST]

Here is the Python code that implements the same logic as the Java code:
```python
import math

mod = 998244353
nchoosek = [[1, 1], [1, 0]]

def nchoosek(n, k):
    if k < 0 or k > n:
        return 0
    if k == 0 or k == n:
        return 1
    if nchoosek[n][k] != 0:
        return nchoosek[n][k]
    nchoosek[n][k] = (nchoosek(n - 1, k - 1) + nchoosek(n - 1, k)) % mod
    return nchoosek[n][k]

def main():
    k = int(input())
    n = int(input())

    for i in range(2, 2 * k + 1):
        pairs = k - i // 2 if i > k else (i - 1) // 2
        active = k - 2 * pairs
        if i % 2 == 0:
            active -= 1
        times2 = 1
        total = 0
        for j in range(0, pairs + 1):
            choice = times2 * nchoosek(pairs, j) % mod
            times2 = times2 * 2 % mod
            if active + j - 1 < 0:
                continue
            total += choice * nchoosek(n + active - 1, active + j - 1)
            if i % 2 == 0:
                total += choice * nchoosek(n + active - 2, active + j - 1)
            total %= mod
        print(total)

if __name__ == "__main__":
    main()
```
Note that the `nchoosek` function is implemented using a memoization technique to avoid recomputing the same values multiple times. This is a common optimization technique in dynamic programming problems.</s>
