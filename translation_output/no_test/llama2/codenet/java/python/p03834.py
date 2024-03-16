<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p03834 {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            System.out.println(s.replace(",", " "));
        }
    }
}

```

### 解题思路

```python
import sys

s = sys.stdin.readline()
print(s.replace(',', ' '))
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 执行

执行用时：**0 ms**，占用内存：**6.40 MB**

### 相关话题

- [字符串](https://leetcode-cn.com/tag/string)
- [输入输出](https://leetcode-cn.com/tag/input-output)

### 相似题目

- [字符串的排列](../03833.md)
</s>
