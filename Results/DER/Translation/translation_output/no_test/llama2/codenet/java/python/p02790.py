<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b)
            for (int i = 0; i < a; i++)
                System.out.print(b);
        else
            for (int i = 0; i < b; i++)
                System.out.print(a);

    }
}

```

### 解答

```python
import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

if a >= b:
    for i in range(a):
        sys.stdout.write(b)
else:
    for i in range(b):
        sys.stdout.write(a)
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入，并将其转换为整数。
2. 使用 `if` 语句判断 `a` 是否大于等于 `b`，如果是，则使用 `for` 循环将 `b` 输出 `a` 次。
3. 如果 `a` 不大于等于 `b`，则使用 `for` 循环将 `a` 输出 `b` 次。

### 复杂度分析

- 时间复杂度：O(min(a, b))。
- 空间复杂度：O(1)。

### 相关题目

- [p02789](../p02789)
- [p02791](../p02791)
</s>
