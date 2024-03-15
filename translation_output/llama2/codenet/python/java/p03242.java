<s> Translate the following python code to java and enclose your solution inside ```java```:
```
moji = str(input())
ans = ""
for i in range(len(moji)):
    ans += ("1","9")[moji[i]=="1"]
print(ans)
```

### 解答

```java
String moji = input();
String ans = "";
for (int i = 0; i < moji.length(); i++) {
    ans += ("1","9")[moji.charAt(i) == '1'];
}
System.out.println(ans);
```

### 解析

```
moji = str(input())
```

将输入转换为字符串

```
ans = ""
for i in range(len(moji)):
    ans += ("1","9")[moji[i]=="1"]
```

将字符串转换为数字，然后根据数字的值，将字符串转换为1或9，然后将结果添加到ans中

```
print(ans)
```

将ans输出到控制台

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [Python 题目 0001](https://leetcode-cn.com/problems/python-problem-0001/)
</s>
