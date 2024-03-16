<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = input ( )
result = " "
i = 0
while i < len ( s ) :
    if s [ i ] == " . " :
        result += '0'
    else :
        i += 1
        if s [ i ] == " . " :
            result += '1'
        else :
            result += '2'
    i += 1
print ( result )


```

### 解答

```java
String s = input();
String result = "";
int i = 0;
while (i < s.length()) {
    if (s.charAt(i) == '.') {
        result += '0';
    } else {
        i++;
        if (s.charAt(i) == '.') {
            result += '1';
        } else {
            result += '2';
        }
    }
    i++;
}
System.out.println(result);
```

### 解析

```
s = input ( )
```

读取用户输入的字符串

```
result = " "
```

初始化结果字符串

```
i = 0
```

初始化i的值

```
while i < len ( s ) :
```

循环条件

```
    if s [ i ] == " . " :
        result += '0'
    else :
        i += 1
        if s [ i ] == " . " :
            result += '1'
        else :
            result += '2'
    i += 1
```

循环体

```
print ( result )
```

打印结果

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [Python 题目 0001](https://leetcode-cn.com/problems/python-problem-0001/)
</s>
