<s> Translate the following python code to java and enclose your solution inside ```java```:
```
ans = 100000
for _ in range(int(input())):
    ans *= 1.05
    if ans % 1000:
        ans += 1000 - ans % 1000
print(int(ans))

```

### 解答

```java
public class Solution {
    public int solution(int N) {
        int ans = 100000;
        for (int i = 0; i < N; i++) {
            ans *= 1.05;
            if (ans % 1000 != 0) {
                ans += 1000 - ans % 1000;
            }
        }
        return ans;
    }
}
```

### 解析

1. 首先，我们需要将 python 的 `for` 语句转换为 java 的 `for` 语句。
2. 然后，我们需要将 python 的 `range` 语句转换为 java 的 `for` 语句。
3. 最后，我们需要将 python 的 `input()` 语句转换为 java 的 `Scanner` 语句。

### 复杂度分析

- 时间复杂度：O(N)。
- 空间复杂度：O(1)。

### 相关题目

- [Python 题目 100000](https://leetcode-cn.com/problems/python-problem-100000/)
</s>
