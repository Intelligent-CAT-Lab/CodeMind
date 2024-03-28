
```
import sys

r = int(sys.stdin.readline())
print(r * r)
```


```
/content/posts/2019-09-22-python-string-format.md
---
title: "Python String Format"
date: 2019-09-22T15:00:00+08:00
draft: false
categories: ["python"]
tags: ["python"]
---

## 1. 基本用法

```
>>> print("I'm %s. I'm %d year old" % ('Vamei', 99))
I'm Vamei. I'm 99 year old
```

## 2. 格式符

| 格式符 | 转换 |
| --- | --- |
| %c | 字符 |
| %s | 通过str() 字符串转换来格式化 |
| %i | 有符号十进制整数 |
| %d | 有符号十进制整数 |
| %u | 无符号十进制整数 |
| %o | 八进制整数 |
| %x | 十六进制整数（小写字母） |
| %X | 十六进制整数（大写字母） |
| %e | 索引符号（小写'e'） |
| %E | 索引符号（大写“E”） |
| %f | 浮点实数 |
| %g | ％f和％e 的简写 |
| %G | ％f和％E的简写 |

## 3. 格式化操作符辅助指令

| 符号 | 功能 |
| --- | --- |
| m.n | m 是显示的最小总宽度,n 是小数点后的位数（如果可用的话） |
| - | 用作左对齐 |
| + | 在正数前面显示加号( + ) |
| # | 在八进制数前面显示零('0')，在十六进制前面显示'0x'或者'0X'(取决于用的是'x'还是'X') |
| 0 | 显示的数字前面填充'0'而不是默认的空格 |

## 4. 例子

```
>>> print('%5.1f' % 27.658)
 27.7
>>> print('%.2e' % 27.658)
2.77e+01
>>> print('%10d' % 10)
     10
>>> print('%-10d' % 10)
10
>>> print('%+d' % 10)
+10
>>> print('%#o' % 10)
0o12
>>> print('%#x' % 108)
0x6c
>>> print('%010d' % 5)
0000000005
```

## 5. 格式化字符串的函数 str.format()

```
>>> print('{0} is {1}'.format('Jack', 'A Man'))
Jack is A Man
>>> print('{1} is {0}'.format('Jack', 'A Man'))
A Man is Jack
>>> print('{0} {1} {0}'.format('Jack', 'A Man'))
Jack A Man Jack
```

## 6. 格式化字符串的函数 str.format() 数字格式化

```
>>> print('{:.2f}'.format(3.1415926))
3.14
>>> print('{:+.2f}'.format(3.1415926))
+3.14
>>> print('{:+.2f}'.format(-3.1415926))
-3.14
>>> print('{:.0f}'.format(3.1415926))
3
>>> print('{:0>2d}'.format(5))
05
>>> print('{:x<4d}'.format(5))
5xxx
>>> print('{:x<4d}'.format(10))
axxx
>>> print('{:,}'.format(1234567890))
1,234,567,890
```

## 7. 格式化字符串的函数 str.format() 字典格式化

```
>>> print('{name} is {age} old'.format(name='Tom', age=16))
Tom is 16 old
>>> print('{0[name]} is {0[age]} old'.format(dict(name='Tom', age=16)))
Tom is 16 old
```

## 8. 格式化字符串的函数 str.format() 日期格式化

```
>>> from datetime import datetime
>>> print('{:%Y-%m-%d %H:%M}'.format(datetime(2001, 2, 3, 4, 5)))
2001-02-03 04:05
```

## 9. 格式化字符串的函数 str.format() 填充与对齐

```
>>> print('{:>8}'.format('189'))
```

## 10. 格式化字符串的函数 str.format() 精度与类型f

```
>>> print('{:.2f}'.format(3.14
