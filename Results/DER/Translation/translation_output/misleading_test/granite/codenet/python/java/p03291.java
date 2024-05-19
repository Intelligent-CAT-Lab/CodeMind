System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
A??C

Expected output:
9

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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        long[][] dp = new long[n+1][4];
        dp[0][0] = 1;
        String[] string = {"A", "B", "C"};
        int num = 100000007;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                int m = 0;
                int b = 1;
                if (s.charAt(i) == '?') {
                    b = 3;
                }
                if (j == 0) {
                    if (s.charAt(i) == '?') {
                        dp[i+1][j] = (dp[i][j] * 3) % num;
                    } else {
                        dp[i+1][j] = dp[i][j] % num;
                    }
                    continue;
                }
                if (s.charAt(i) == string[j-1].charAt(0) || s.charAt(i) == '?') {
                    m = 1;
                }
                dp[i+1][j] = (m * dp[i][j-1] + b * dp[i][j]) % num;
            }
        }
        System.out.println(dp[n][3]);
    }
}
```

Test input:
A??C

Expected output:
9<|endoftext|>
