<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
a_index = 0
z_index = 0
for i in range(len(s)):
    if s[i] == 'A':
        a_index = i
        break
for i in range(len(s) - 1, 0, -1):
    if s[i] == 'Z':
        z_index = i
        break
print(z_index - a_index + 1)
```

### 解答

```java
public class Solution {
    public int reverseVowels(String s) {
        int a_index = 0;
        int z_index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a_index = i;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'Z') {
                z_index = i;
                break;
            }
        }
        return z_index - a_index + 1;
    }
}
```

### 解析

1. 首先需要找到字符串中的第一个A，然后找到字符串中的最后一个Z，然后计算两个索引的差值。
2. 使用for循环，遍历字符串，如果当前字符是A，则将其索引赋值给a_index，如果当前字符是Z，则将其索引赋值给z_index。
3. 最后，返回z_index - a_index + 1。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [100. 反转字符串中的字母](https://leetcode-cn.com/problems/reverse-string-letters/)
</s>
