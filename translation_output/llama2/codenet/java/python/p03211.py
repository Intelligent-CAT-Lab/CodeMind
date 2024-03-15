<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int min = 1000;
        for (int i = 0; i < S.length() - 2; i++) {
            int X = Integer.parseInt(S.substring(i, i + 3));
            min = Math.min(min, Math.abs(X - 753));
        }
        System.out.println(min);
        sc.close();
    }
}
```

### 解答

```python
import sys

S = sys.stdin.readline()
min = 1000
for i in range(len(S) - 2):
    X = int(S[i:i + 3])
    min = min if min < abs(X - 753) else abs(X - 753)
print(min)
```

### 解析

1. 读取输入
2. 循环输入的字符串
3. 获取每个字符串的值
4. 计算每个字符串的值的绝对值
5. 计算绝对值最小的值
6. 输出绝对值最小的值

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p03210](../p03210)
- [p03212](../p03212)
</s>
