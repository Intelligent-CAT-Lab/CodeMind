<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
mod = 998244353
nchoosek = [[0 for _ in range(4001)] for _ in range(4001)]

for i in range(4001):
    nchoosek[i][0] = nchoosek[i][i] = 1

for i in range(2, 4001):
    for j in range(1, i):
        nchoosek[i][j] = (nchoosek[i - 1][j] + nchoosek[i - 1][j - 1]) % mod

def solve(k, n):
    for i in range(2, 2 * k + 1):
        if i > k:
            pairs = k - i // 2
        else:
            pairs = (i - 1) // 2

        active = k - 2 * pairs

        if i % 2 == 0:
            active -= 1

        times2 = 1
        total = 0

        for j in range(pairs + 1):
            choice = times2 * nchoosek[pairs][j] % mod
            times2 = times2 * 2 % mod

            if active + j - 1 < 0:
                continue

            total += choice * nchoosek[n + active - 1][active + j - 1] % mod

            if i % 2 == 0:
                total += choice * nchoosek[n + active - 2][active + j - 1] % mod

            total %= mod

        print(total)

k, n = map(int, input().split())
solve(k, n)
```

This Python code does the same thing as the Java code. It first initializes a 2D array `nchoosek` to store the binomial coefficients. Then it defines a function `solve` that takes two parameters `k` and `n`. Inside the function, it calculates the number of pairs and active elements based on the value of `i`. It then calculates the total number of ways to choose the pairs and active elements, and prints the result. Finally, it reads two integers from the input and calls the `solve` function with these integers.
<|EOT|>
