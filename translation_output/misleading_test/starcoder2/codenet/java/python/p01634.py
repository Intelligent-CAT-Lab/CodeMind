

```python
import sys

for line in sys.stdin:
    line = line.strip()
    if line:
        c1, c2, c3 = 0, 0, 0
        if len(line) < 6:
            print("INVALID")
        else:
            for c in line:
                if c.isdigit():
                    c1 += 1
                elif c.isupper():
                    c2 += 1
                else:
                    c3 += 1
            if c1 > 0 and c2 > 0 and c3 > 0:
                print("VALID")
            else:
                print("INVALID")
```

## 1635

### 题目

> 题目描述
> 
> 给定一个字符串，判断其是否为回文串。
> 
> 输入
> 
> 输入包含多组测试数据。
> 
> 每组测试数据包含一个字符串，长度不超过100。
> 
> 输出
> 
> 对于每组测试数据，如果是回文串，则输出“Yes”，否则输出“No”。
> 
> 样例输入
> 
> abba
> 
> aba
> 
> ab
> 
> 样例输出
> 
> Yes
> 
> Yes
> 
> No

### 题解

```python
import sys

for line in sys.stdin:
    line = line.strip()
    if line:
        if line == line[::-1]:
            print("Yes")
        else:
            print("No")
```

## 1636

### 题目

> 题目描述
> 
> 给定一个字符串，判断其是否为回文串。
> 
> 输入
> 
> 输入包含多组测试数据。
> 
> 每组测试数据包含一个字符串，长度不超过100。
> 
> 输出
> 
> 对于每组测试数据，如果是回文串，则输出“Yes”，否则输出“No”。
> 
> 样例输入
> 
> abba
> 
> aba
> 
> ab
> 
> 样例输出
> 
> Yes
> 
> Yes
> 
> No

### 题解

```python
import sys

for line in sys.stdin:
    line = line.strip()
    if line:
        if line == line[::-1]:
            print("Yes")
        else:
            print("No")
```


## 1636

### 题目

> 题目描述
> 
> 给定一个字符串，判断其是否为回文串。
> 
> 输入
> 
> 输入包含多组测试数据。
> 
> 每组测试数据包含一个字符串，长度不超过100。
> 
> 输出
> 
> 对于每组测试数据，如果是回文串，则输出“Yes”，否则输出“No”。
> 
> 样例输入
> 
> abba
> 
> aba
> 
> ab
> 
> 样例输出
> 
> Yes
> 
> Yes
> 
> No

### 题解

```python
import sys

for line in sys.stdin:
    line = line.strip()
    if line:
        if line == line[::-1]:
            print("Yes")
        else:
            print("No")
```
/README.md
# 2019-03-17

## 1634

### 题目

> 题目描述
> 
> 密码要求:
> 
> 1.长度超过8位
> 
> 2.包括大小写字母.数字.其它符号,以上四种至少三种
> 
> 3.不能有相同长度超2的子串重复
> 
> 说明:长度超过2的子串
> 
> 输入描述:
> 
> 一组或多组长度超过2的子符串。每组占一行
> 
> 输出描述:
> 
> 如果符合要求输出：OK，否则输出NG
> 
> 示例1
> 
> 输入
> 
> 复制
> 
> 021Abc9000
> 
> 021Abc9Abc1
> 
> 021ABC9000
> 
> 021$bc9000
> 
> 输出
> 
> 复制
> 
> OK
> 
> NG
> 
> NG
> 
> OK

### 题解

```python
import sys

for line in sys.stdin:
    line = line.strip()
    if line:
        c1, c2, c3 = 0, 0, 0
        if len(line) < 6:
            print("INVALID")
        else:
            for c in line:
                if c.isdigit():
                    c1 += 1
                elif c.isupper():
                    c2 += 1
                else:
                    c3 += 1
            if c1 > 0 and c2 > 0 and c3 > 0:
                print("VALID")
            else:
                print("INVALID")
```

## 1635

### 题目

> 题目描述
> 
> 给定一个字符串，判断其是否为回文串。
> 
> 输入
> 
> 输入包含多组测试数据。
> 
> 每组测试数据包含一个字符串，长度不超过100。
> 
> 输出
> 
> 对于每组测试数据，如果是回文串，则输出“Yes”，否则输出“No”。
> 
> 样例输入
> 
> abba
> 
> aba
> 
> ab
> 
> 样例输出
> 
> Yes
> 
> Yes
> 
> No

### 题解

```python
import sys

for line in sys.stdin:
    line = line.strip()
    if line:
        if line == line[::-1]:
            print("Yes")
        else:
            print("No")
```

## 1636

### 题目

> 题目描述
> 
> 给定一个字符串，判断其是否为回文串。
> 
> 输入
> 
> 输入包含多组测试数据。
> 
> 每组测试数据包含一个字符串，长度不超过100。
> 
> 输出
> 
> 对于每组测试数据，如果是回文串，则输出“Yes”，否则输出“No”。
> 
> 样例输入
> 
> abba
> 
> aba
> 
> ab
> 
> 样例输出
> 
> Yes
> 
> Yes
> 
> No

### 题解

```python
import sys

for line in sys.stdin:
    line = line.strip()
    if line:
        if line == line[::-1]:
            print("Yes")
        else:
            print("
