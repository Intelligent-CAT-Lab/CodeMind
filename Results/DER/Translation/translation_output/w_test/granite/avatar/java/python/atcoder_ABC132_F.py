System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 3

Expected output:
147


```
import java.util.*;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        long mod = (long) 1e9 + 7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        ArrayList<Integer> len = new ArrayList<>();
        int l = 1;
        while (l <= n) {
            int r = n / (n / l);
            len.add(r - l + 1);
            l = r + 1;
        }

        int q = len.size();
        long[] dp = new long[k * (q + 1)];

        for (int j = 1; j <= q; j++) {
            dp[j] = len.get(j - 1) + dp[j - 1];
        }

        for (int i = 1; i < k; i++) {
            for (int j = 1; j <= q; j++) {
                dp[i * (q + 1) + j] = dp[i * (q + 1) + j - 1] + dp[(i - 1) * (q + 1) + q - j + 1] * len.get(j - 1);
                dp[i * (q + 1) + j] %= mod;
            }
        }

        System.out.println(dp[k * (q + 1) - 1]);
    }
}
```


Answer:
```python
import sys

MOD = 10**9 + 7

def main():
    n, k = map(int, input().split())
    l = 1
    lens = []
    while l <= n:
        r = n // (n // l)
        lens.append(r - l + 1)
        l = r + 1
    q = len(lens)
    dp = [0] * (k * (q + 1))
    for j in range(1, q + 1):
        dp[j] = lens[j - 1] + dp[j - 1]
    for i in range(1, k):
        for j in range(1, q + 1):
            dp[i * (q + 1) + j] = (dp[i * (q + 1) + j - 1] + dp[(i - 1) * (q + 1) + q - j + 1] * lens[j - 1]) % MOD
    print(dp[k * (q + 1) - 1])

if __name__ == '__main__':
    main()
```<|endoftext|>
