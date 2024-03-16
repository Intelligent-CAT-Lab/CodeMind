<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03427 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long N = scanner.nextLong() + 1;
        scanner.close();

        // æ¡æ°
        String s = String.valueOf(N);
        int length = s.length();
        int c = Integer.parseInt(s.substring(0, 1));
        int max = (c - 1) + 9 * (length - 1);

        System.out.println(max);
    }
}
```

### 解答

```python
import sys

N = int(sys.stdin.readline().strip())

s = str(N)
length = len(s)
c = int(s[0])
max = (c - 1) + 9 * (length - 1)

print(max)
```

### 解析

1. 读取输入
2. 将输入转换为字符串
3. 获取字符串的长度
4. 获取字符串的第一个字符
5. 将字符串的第一个字符转换为整数
6. 计算最大值
7. 输出最大值

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p03426](https://leetcode-cn.com/problems/p03426/)
</s>
