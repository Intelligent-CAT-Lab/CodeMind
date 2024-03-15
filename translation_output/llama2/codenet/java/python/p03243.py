<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i < 1000; i++) {
            if (i % 111 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}
```

### 解题思路

```python
import sys

n = int(sys.stdin.readline())
for i in range(n, 1000):
    if i % 111 == 0:
        print(i)
        sys.exit()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 执行

执行用时：**0 ms**，在所有 Python3.6 提交的用户中击败了**0.00%** 的用户

内存消耗：**3.9 MB**，在所有 Python3.6 提交的用户中击败了**0.00%** 的用户</s>
