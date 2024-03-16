<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02606 {

    public p02606() {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();

        int Ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0)
                Ans++;
        }

        System.out.println(Ans);
    }

    public static void main(String[] args) {
        new p02606();
    }
}

```

### 解题思路

```python
import sys

L, R, d = map(int, sys.stdin.readline().split())

ans = 0
for i in range(L, R + 1):
    if i % d == 0:
        ans += 1

print(ans)
```

### 复杂度分析

- 时间复杂度：O(R)。
- 空间复杂度：O(1)。

### 相关题目

- [p02605](./p02605.md)
</s>
