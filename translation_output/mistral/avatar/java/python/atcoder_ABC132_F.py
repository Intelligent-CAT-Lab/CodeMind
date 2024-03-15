<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

mod = 1000000007
n, k = map(int, sys.stdin.readline().split())

len = []
l = 1
while l <= n:
    r = n // l
    len.append(r - l + 1)
    l = r + 1

q = len.__len__()
dp = [0] * (k * (q + 1))

for j in range(1, q + 1):
    dp[j] = len[j - 1] + dp[j - 1]

for i in range(1, k):
    for j in range(1, q + 1):
        dp[i * (q + 1) + j] = dp[i * (q + 1) + j - 1] + dp[(i - 1) * (q + 1) + q - j + 1] * len[j - 1]
        dp[i * (q + 1) + j] %= mod

print(dp[k * (q + 1) - 1])
```</s>
