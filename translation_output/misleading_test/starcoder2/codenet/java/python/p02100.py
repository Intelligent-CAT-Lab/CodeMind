

```python
import sys

def main():
    line = sys.stdin.readline().strip()
    arr = list(line)
    num = 0
    plus = True
    si = False
    xs = False
    keis = [0] * 6
    for c in arr:
        if c == '+':
            if xs:
                if plus:
                    keis[1] = num
                else:
                    keis[1] = -num
            num = 0
            plus = True
        elif c == '-':
            if xs:
                if plus:
                    keis[1] = num
                else:
                    keis[1] = -num
            num = 0
            plus = False
        elif c == '^':
            si = True
            xs = False
        elif c == 'x':
            if num == 0:
                num = 1
            xs = True
        else:
            if si:
                v = int(c)
                if plus:
                    keis[v] = num
                else:
                    keis[v] = -num
                si = False
            else:
                num = num * 10 + int(c)
    if plus:
        keis[0] = num
    else:
        keis[0] = -num
    ji = 0
    for i in range(5, -1, -1):
        if keis[i] != 0:
            ji = i
            break
    ans = [0] * ji
    for i in range(1, abs(keis[0]) + 1):
        result = 0
        for j in range(6):
            result += pow(i, j) * keis[j]
        if result == 0:
            ji -= 1
            ans[ji] = -i
        result = 0
        for j in range(6):
            result += pow(-i, j) * keis[j]
        if result == 0:
            ji -= 1
            ans[ji] = i
    ans.sort()
    sb = ''
    for i in range(len(ans)):
        sb += '(x'
        if ans[i] >= 0:
            sb += '+'
        sb += str(ans[i]) + ')'
    print(sb)

if __name__ == '__main__':
    main()
```


```

python code:

```python
import sys

def main():
    line = sys.stdin.readline().strip()
    arr = list(line)
    num = 0
    plus = True
    si = False
    xs = False
    keis = [0] * 6
    for c in arr:
        if c == '+':
            if xs:
                if plus:
                    keis[1] = num
                else:
                    keis[1] = -num
            num = 0
            plus = True
        elif c == '-':
            if xs:
                if plus:
                    keis[1] = num
                else:
                    keis[1] = -num
            num = 0
            plus = False
        elif c == '^':
            si = True
            xs = False
        elif c == 'x':
            if num == 0:
                num = 1
            xs = True
        else:
            if si:
                v = int(c)
                if plus:
                    keis[v] = num
                else:
                    keis[v] = -num
                si = False
            else:
                num = num * 10 + int(c)
    if plus:
        keis[0] = num
    else:
        keis[0] = -num
    ji = 0
    for i in range(5, -1, -1):
        if keis[i] != 0:
            ji = i
            break
    ans = [0] * ji
    for i in range(1, abs(keis[0]) + 1):
        result = 0
        for j in range(6):
            result += pow(i, j) * keis[j]
        if result == 0:
            ji -= 1
            ans[ji] = -i
        result = 0
        for j in range(6):
            result += pow(-i, j) * keis[j]
        if result == 0:
            ji -= 1
            ans[ji] = i
    ans.sort()
    sb = ''
    for i in range(len(ans)):
        sb += '(x'
        if ans[i] >= 0:
            sb += '+'
        sb += str(ans[i]) + ')'
    print(sb)

if __name__ == '__main__':
    main()
```
/p02100.md
# p02100

## 题目描述

给定一个一元多项式，求出它的根。

## 输入

一行，表示一个一元多项式，格式为：

```
a0+a1x+a2x^2+a3x^3+a4x^4+a5x^5
```

其中，a0,a1,a2,a3,a4,a5为整数，且a0不为0。

## 输出

一行，表示该多项式的根，格式为：

```
(x-r1)(x-r2)...(x-rn)
```

其中，ri为该多项式的根，ri的取值范围为[-10000,10000]，且ri的取值顺序为从小到大。

## 样例输入

```
x^2+3x+2
```

## 样例输出

```
(x-1)(x-2
