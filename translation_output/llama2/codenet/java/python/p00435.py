<s> Translate the following java code to python and enclose your solution inside ```python```:
```
class p00435{public static void main(String[]z){String s="";for(char c:new java.util.Scanner(System.in).next().toCharArray())s+=(char)((c-42)%26+65);System.out.println(s);}}
```

### 解答

```python
class p00435:
    def __init__(self):
        pass

    def main(self, z):
        s = ""
        for c in new java.util.Scanner(System.in).next().toCharArray():
            s += chr((c - 42) % 26 + 65)
        print(s)
```

### 解析

1. 使用 `Scanner` 读取输入
2. 使用 `toCharArray` 将输入转换为字符数组
3. 使用 `for` 循环
4. 使用 `char` 将输入转换为字符
5. 使用 `+` 连接字符
6. 使用 `print` 打印字符串

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p00434](https://leetcode-cn.com/problems/translate-the-following-java-code-to-python-and-enclose-your-solution-inside-python/)
</s>
