<s> Translate the following python code to java and enclose your solution inside ```java```:
```
L, R, d = map(int, input().split())
ans = 0
for i in range(L, R+1):
  if i%d == 0:
    ans += 1
print(ans)
```

### 解题思路

```
L, R, d = map(int, input().split())
ans = 0
for i in range(L, R+1):
  if i%d == 0:
    ans += 1
print(ans)
```

### 代码实现

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L, R, d;
        L = sc.nextInt();
        R = sc.nextInt();
        d = sc.nextInt();
        int ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
```

### 复杂度分析

- 时间复杂度：O(R)。
- 空间复杂度：O(1)。

### 相关题目

- [Python 题目 0001](https://leetcode-cn.com/problems/python-problem-0001/)
</s>
