<s> Translate the following python code to java and enclose your solution inside ```java```:
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
        if S[left] != 'm' or S[right - 1] != 'w':
            continue
        for mid in range(left + 1, right):
            if S[mid] == 'e' and dp[left + 1][mid] and dp[mid + 1][right - 1]:
                dp[left][right] = True
                break
print("Cat" if dp[0][L] else "Rabbit")
```

### 解题思路

```
dp[i][j] = True 表示 S[i:j] 是 "mew"
```

### 代码

```java
public class Solution {
    public String catOrRabbit(String S) {
        int L = S.length();
        boolean[][] dp = new boolean[L + 1][L + 1];
        for (int i = 0; i <= L; i++) {
            dp[i][i] = true;
        }
        for (int w = 3; w <= L; w += 3) {
            for (int left = 0; left < L - w; left++) {
                int right = left + w;
                if (S.charAt(left) != 'm' || S.charAt(right - 1) != 'w') {
                    continue;
                }
                for (int mid = left + 1; mid < right; mid++) {
                    if (S.charAt(mid) == 'e' && dp[left + 1][mid] && dp[mid + 1][right - 1]) {
                        dp[left][right] = true;
                        break;
                    }
                }
            }
        }
        return "Cat" == dp[0][L] ? "Cat" : "Rabbit";
    }
}
```
</s>
