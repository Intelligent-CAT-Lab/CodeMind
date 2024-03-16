<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()
L = len(S)
dp = [[False] * (L + 1) for _ in range(L + 1)]

# [left, right)
for i in range(L + 1):
    dp[i][i] = True

for w in range(3, L + 1, 3):
    for left in range(L - w + 1):
        right = left + w
        if S[left]!='m' or S[right - 1]!= 'w':
            continue
        for mid in range(left + 1, right):
            if S[mid] == 'e' and dp[left + 1][mid] and dp[mid + 1][right - 1]:
                dp[left][right] = True
                break
print("Cat" if dp[0][L] else "Rabbit")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        boolean[][] dp = new boolean[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][i] = true;
        }
        for (int w = 3; w <= n; w += 3) {
            for (int left = 0; left + w <= n; left++) {
                int right = left + w;
                if (s.charAt(left)!='m' || s.charAt(right - 1)!= 'w') {
                    continue;
                }
                for (int mid = left + 1; mid < right; mid++) {
                    if (s.charAt(mid) == 'e' && dp[left + 1][mid] && dp[mid + 1][right - 1]) {
                        dp[left][right] = true;
                        break;
                    }
                }
            }
        }
        System.out.println(dp[0][n]? "Cat" : "Rabbit");
    }
}
```
<|endoftext|>
