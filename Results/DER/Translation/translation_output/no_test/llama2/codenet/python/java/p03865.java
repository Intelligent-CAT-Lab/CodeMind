<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
if s[0] == s[-1]:
    if len(s) % 2:
        ans = 'Second'
    else:
        ans = 'First'
else:
    if len(s) % 2:
        ans = 'First'
    else:
        ans = 'Second'
print(ans)
```

### 解答

```java
String s = input();
if (s[0] == s[s.length() - 1]) {
    if (s.length() % 2 == 1) {
        System.out.println("Second");
    } else {
        System.out.println("First");
    }
} else {
    if (s.length() % 2 == 1) {
        System.out.println("First");
    } else {
        System.out.println("Second");
    }
}
```

### 解析

```
if s[0] == s[-1]:
    if len(s) % 2:
        ans = 'Second'
    else:
        ans = 'First'
else:
    if len(s) % 2:
        ans = 'First'
    else:
        ans = 'Second'
```

- 如果字符串的第一个字符和最后一个字符相同，则判断字符串的长度是否是奇数，如果是奇数，则输出“Second”，如果是偶数，则输出“First”。
- 如果字符串的第一个字符和最后一个字符不相同，则判断字符串的长度是否是奇数，如果是奇数，则输出“First”，如果是偶数，则输出“Second”。

### 思路

- 首先，我们需要判断字符串的第一个字符和最后一个字符是否相同。
- 如果相同，则判断字符串的长度是否是奇数，如果是奇数，则输出“Second”，如果是偶数，则输出“First”。
- 如果不相同，则判断字符串的长度是否是奇数，如果是奇数，则输出“First”，如果是偶数，则输出“Second”。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [第一个字符和最后一个字符相同](https://leetcode-cn.com/problems/first-character-and-last-character-are-the-same/)
- [第一个字符和最后一个字符相同 II](https://leetcode-cn.com/problems/first-character-and-last-character-are-the-same-ii/)
</s>
