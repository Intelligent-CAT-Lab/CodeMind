<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = input();n = len(s)
dp = [[0 for i in range(4)] for j in range(len(s)+1)]
dp[0][0] = 1;string = ["A","B","C"];num = 10**9+7
for i in range(n):
    for j in range(4):
        m = 0;b = 1
        if '?' == s[i]:b = 3
        if j == 0:
            if '?' == s[i]:dp[i+1][j] = (dp[i][j] * 3)%num
            else:dp[i+1][j] = (dp[i][j])%num
            continue
        if s[i] == string[j-1]or s[i] == '?':m = 1
        dp[i+1][j] = (m*dp[i][j-1] + b*dp[i][j])%num
print(dp[-1][3])
```

### 解答

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        int[][] dp = new int[n+1][4];
        int num = 1000000007;
        dp[0][0] = 1;
        String[] string = {"A","B","C"};
        for (int i = 0; i < n; i++) {
            int m = 0;
            int b = 1;
            if (s.charAt(i) == '?') {
                b = 3;
            }
            if (i == 0) {
                if (s.charAt(i) == '?') {
                    dp[i+1][0] = (dp[i][0] * 3) % num;
                } else {
                    dp[i+1][0] = (dp[i][0]) % num;
                }
                continue;
            }
            if (s.charAt(i) == string[0] || s.charAt(i) == '?') {
                m = 1;
            }
            dp[i+1][0] = (m * dp[i][0] + b * dp[i][1]) % num;
            dp[i+1][1] = (m * dp[i][1] + b * dp[i][2]) % num;
            dp[i+1][2] = (m * dp[i][2] + b * dp[i][3]) % num;
            dp[i+1][3] = (m * dp[i][3] + b * dp[i][0]) % num;
        }
        System.out.println(dp[n][3]);
    }
}
```
</s>
