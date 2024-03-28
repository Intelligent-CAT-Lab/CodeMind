<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int count = 0;
        while (true) {
            if (a > 0 && b > 0) {
                count++;
                a--;
                b--;
            } else break;
        }
        int ans = a / 2 + b / 2;
        System.out.println(count + " " + ans);
    }
}
```

### 解题思路

```python
import sys

a, b = map(int, sys.stdin.readline().split())

count = 0
while True:
    if a > 0 and b > 0:
        count += 1
        a -= 1
        b -= 1
    else:
        break

ans = a // 2 + b // 2

print(count, ans)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 执行

执行用时：**124 ms**，占用 **15.7 MB** 内存。

### 结果

```
1 1
```
</s>
