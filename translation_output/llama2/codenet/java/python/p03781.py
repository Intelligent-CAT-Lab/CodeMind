<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), i = 1;
        for (; i * (i + 1) / 2 < x; i++) {}
        System.out.println(i);
    }
}
```

### 解题思路

```python
import sys

x = int(sys.stdin.readline())
i = 1
while i * (i + 1) / 2 < x:
    i += 1
print(i)
```

### 复杂度分析

- 时间复杂度：O(log(x))
- 空间复杂度：O(1)

### 相关题目

- [p03780](https://leetcode-cn.com/problems/find-the-smallest-integer-greater-than-or-equal-to-the-sum-of-its-digits/)
</s>
