<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int ans = A + B > 23 ? A + B - 24 : A + B;
        System.out.println(ans);
    }
}

```

### 解题思路

```python
import sys

A = int(sys.stdin.readline())
B = int(sys.stdin.readline())

if A + B > 23:
    ans = A + B - 24
else:
    ans = A + B

print(ans)
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 执行

执行用时：**0 ms**，在所有 Python3.6 提交的用户中击败了**0.00%** 的用户

内存消耗：**7.9 MB**，在所有 Python3.6 提交的用户中击败了**0.00%** 的用户</s>
