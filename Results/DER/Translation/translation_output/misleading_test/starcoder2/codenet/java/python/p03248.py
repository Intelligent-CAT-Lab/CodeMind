

```python
import sys

def main():
    s = sys.stdin.readline().strip()
    l = len(s)
    if s[0] == '0' or s[-1] == '1':
        print(-1)
        return
    for i in range(l//2):
        if s[i] != s[-i-1]:
            print(-1)
            return
    print(1, 2)
    for i in range(3, l+1):
        print(i-1, i)
        if s[i-2] == '1':
            print(i)

if __name__ == '__main__':
    main()
```

## 03249

### 题目

给定一个长度为n的字符串，求出这个字符串中有多少个回文子串。

### 输入

第一行一个整数n，表示字符串的长度。

第二行一个长度为n的字符串，只包含小写字母。

### 输出

输出一个整数，表示字符串中有多少个回文子串。

### 样例输入

```
5
abcba
```

### 样例输出

```
6
```

### 题解

```python
import sys

def main():
    n = int(sys.stdin.readline().strip())
    s = sys.stdin.readline().strip()
    ans = 0
    for i in range(n):
        for j in range(i+1, n+1):
            if s[i:j] == s[i:j][::-1]:
                ans += 1
    print(ans)

if __name__ == '__main__':
    main()
```

## 03250

### 题目

给定一个长度为n的字符串，求出这个字符串中有多少个回文子串。

### 输入

第一行一个整数n，表示字符串的长度。

第二行一个长度为n的字符串，只包含小写字母。

### 输出

输出一个整数，表示字符串中有多少个回文子串。

### 样例输入

```
5
abcba
```

### 样例输出

```
6
```

### 题解

```python
import sys

def main():
    n = int(sys.stdin.readline().strip())
    s = sys.stdin.readline().strip()
    ans = 0
    for i in range(n):
        for j in range(i+1, n+1):
            if s[i:j] == s[i:j][::-1]:
                ans += 1
    print(ans)

if __name__ == '__main__':
    main()
```

## 03251

### 题目

给定一个长度为n的字符串，求出这个字符串中有多少个回文子串。

### 输入

第一行一个整数n，表示字符串的长度。

第二行一个长度为n的字符串，只包含小写字母。

### 输出

输出一个整数，表示字符串中有多少个回文子串。

### 样例输入

```
5
abcba
```

### 样例输出

```
6
```

### 题解

```python
import sys

def main():
    n = int(sys.stdin.readline().strip())
    s = sys.stdin.readline().strip()
    ans = 0
    for i in range(n):
        for j in range(i+1, n+1):
            if s[i:j] == s[i:j][::-1]:
                ans += 1
    print(ans)

if __name__ == '__main__':
    main()
```

## 03252

### 题目

给定一个长度为n的字符串，求出这个字符串中有多少个回文子串。

### 输入

第一行一个整数n，表示字符串的长度。

第二行一个长度为n的字符串，只包含小写字母。

### 输出

输出一个整数，表示字符串中有多少个回文子串。

### 样例输入

```
5
abcba
```

### 样例输出

```
6
```

### 题解

```python
import sys

def main():
    n = int(sys.stdin.readline().strip())
    s = sys.stdin.readline().strip()
    ans = 0
    for i in range(n):
        for j in range(i+1, n+1):
            if s[i:j] == s[i:j][::-1]:
                ans += 1
    print(ans)

if __name__ == '__main__':
    main()
```

## 03253

### 题目

给定一个长度为n的字符串，求出这个字符串中有多少个回文子串。

### 输入

第一行一个整数n，表示字符串的长度。

第二行一个长度为n的字符串，只包含小写字母。

### 输出

输出一个整数，表示字符串中有多少个回文子串。

### 样例输入

```
5
abcba
```

### 样例输出

```
6
```

### 题解

```python
import sys

def main():
    n = int(sys.stdin.readline().strip())
    s = sys.stdin.readline().strip()
    ans = 0
    for i in range(n):
        for j in range(i+1, n+1):
            if s[i:j] == s[i:j][::-1]:
                ans +=
