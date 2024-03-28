

```
str = input()
while '()' in str:
    str = str.replace('()', '')

star_index = 0
for i in range(len(str)):
    if str[i] == '*':
        star_index = i

left = star_index - 1
right = star_index + 1

result = 0
while left >= 0:
    if str[left] == '(':
        while right <= len(str) - 1:
            if str[right] == ')':
                result += 1
                break
            right += 1
    left -= 1

print(result)
```
/source/_posts/2019-03-10-python-100-days-day01-note.md
---
title: python-100-days-day01-note
date: 2019-03-10 16:00:00
tags: python
---

# python-100-days-day01-note

## 1. 第一个python程序

```
print('hello world')
```

## 2. 注释

```
# 这是注释
```

## 3. 变量

```
a = 321
b = 123
print(a + b)
```

## 4. 变量类型

```
a = 100
b = 12.345
c = 1 + 5j
d = 'hello, world'
e = True
print(type(a))
print(type(b))
print(type(c))
print(type(d))
print(type(e))
```

## 5. 类型转换

```
a = 100
b = str(a)
print(type(b))
```

## 6. 运算符

```
a = 10
b = 3
a + b
a - b
a * b
a / b
a // b
a % b
a ** b
```

## 7. 运算符的优先级

```
a = 10
b = 20
c = 30
d = 40
e = 50
a + b * c / d - e
(a + b) * (c / d) - e
```

## 8. 变量的命名

```
# 变量名只能是 字母、数字或下划线的任意组合
# 变量名的第一个字符不能是数字
# 以下关键字不能声明为变量名
['and', 'as', 'assert', 'break', 'class', 'continue', 'def', 'del', 'elif', 'else', 'except', 'exec', 'finally', 'for', 'from', 'global', 'if', 'import', 'in', 'is', 'lambda', 'not', 'or', 'pass', 'print', 'raise', 'return', 'try', 'while', 'with', 'yield']
```

## 9. 变量的使用

```
a = 321
b = 123
print(a + b)
print(a - b)
print(a * b)
print(a / b)
print(a // b)
print(a % b)
print(a ** b)
```

## 10. 输入

```
a = input()
print(a)
```

## 11. 输出

```
a = 100
b = 12.345
c = 1 + 5j
d = 'hello, world'
e = True
print(type(a))
print(type(b))
print(type(c))
print(type(d))
print(type(e))
```

## 12. 输出格式化

```
a, b = 5, 10
print('%d * %d = %d' % (a, b, a * b))
```

## 13. 练习

```
# 练习1：华氏温度转换为摄氏温度。
# 公式：C = (F - 32) / 1.8
f = float(input('请输入华氏温度: '))
c = (f - 32) / 1.8
print('%.1f华氏度 = %.1f摄氏度' % (f, c))

# 练习2：输入圆的半径计算计算周长和面积。
# 公式：
# 周长：2 * π * r
# 面积：π * r * r
import math

radius = float(input('请输入圆的半径: '))
perimeter = 2 * math.pi * radius
area = math.pi * radius * radius
print('周长: %.2f' % perimeter)
print('面积: %.2f' % area)

# 练习3：输入年份判断是不是闰年。
# 闰年：能被4整除但不能被100整除，或者能被400整除
year = int(input('请输入年份: '))
is_leap = (year % 4 == 0 and year % 100 != 0) or year % 400 == 0
print(is_leap)
```
/source/_posts/2019-03-10-python-100-days-day02-note.md
---
title: python-100-days-day02-note
date: 2019-03-10 16:00:00
tags: python
---

# python-100-days-day02-note

## 1. 字符串

```
s1 = 'hello, world!'
s2 = "hello, world!"
# 以三个双引号或单引号开头的字符串可以折行
s3 = """
hello, 
world!
"""
print(s1, s2, s3, end='')
```

## 2. 字符串的运算

```
s1 = 'hello ' * 3
print(s1)
s2 = 'world'
s1 += s2
print(s1)
print('ll' in s1)
print('good' in s1)
str2 = 'abc123456'
# 从字符串中取出指定位置的字符(下标运算)
print(str2[2])
# 字符串切片(从指定的开始索引到指定的结束索引)
print(str2[2:5])
print(str2[2:])
print(str2[2::2])
print(str2[::2])
print(str2[::-1])
print(str2[-3:-
