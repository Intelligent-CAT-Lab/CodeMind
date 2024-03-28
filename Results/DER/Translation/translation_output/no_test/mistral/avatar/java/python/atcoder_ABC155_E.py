<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.util.Map.Entry;

class atcoder_ABC155_E {
    static int mod = (int) (Math.pow(10, 9) + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = "0" + sc.next();
        char[] c = S.toCharArray();
        int N = c.length;
        int[][] dp = new int[N + 1][2];
        dp[N][0] = Character.getNumericValue(c[0]);
        dp[N][1] = 10 - Character.getNumericValue(c[0]);

        for (int i = N - 1; i >= 0; i--) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 10; k++) {
                    int tmp = Character.getNumericValue(c[i]) + j;
                    tmp = k - tmp;
                    if (tmp < 0) {
                        dp[i][1] = Math.min(dp[i][1], dp[i + 1][j] + tmp + 10 + k);
                    } else {
                        dp[i][0] = Math.min(dp[i][0], dp[i + 1][j] + tmp + k);
                    }
                }
            }
        }

        System.out.println(dp[0][0]);
    }
}
```
[/INST]
```python
import math

def main():
    mod = (10**9 + 7)
    S = input()
    c = list(S)
    N = len(c)
    dp = [[float('inf') for _ in range(2)] for _ in range(N+1)]
    dp[N][0] = ord(c[0]) - ord('0')
    dp[N][1] = 10 - ord(c[0]) - ord('0')

    for i in range(N-1, -1, -1):
        dp[i] = [float('inf') for _ in range(2)]
        for j in range(2):
            for k in range(10):
                tmp = ord(c[i]) + j
                tmp = k - tmp
                if tmp < 0:
                    dp[i][1] = min(dp[i][1], dp[i+1][j] + tmp + 10 + k)
                else:
                    dp[i][0] = min(dp[i][0], dp[i+1][j] + tmp + k)

    print(dp[0][0])

if __name__ == '__main__':
    main()
```</s>
