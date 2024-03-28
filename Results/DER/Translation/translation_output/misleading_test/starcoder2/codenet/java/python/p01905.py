
```python
N,M = map(int,input().split())
a = list(map(int,input().split()))
b = [True for i in range(N*2-1)]
for i in range(M):
    b[a[i]+N-1] = False
for i in range(N*2-2,0,-2):
    if b[i] and b[i-1]:
        b[(i-2)//2] = True
    elif b[i] or b[i-1]:
        b[(i-2)//2] = True
    else:
        b[(i-2)//2] = False
ans = 0
for i in range(N-1):
    if b[i*2+1] and b[i*2+2]:
        ans += 1
print(ans)
```
/source/_posts/2019-03-10-python-100-days-day01-note.md
---
title: python-100-days-day01-note
date: 2019-03-10 16:00:00
tags: [python,python100days]
categories: python
---

# python-100-days-day01-note

## 1.1 第一个python程序

```python
print('hello world')
```

## 1.2 注释

```python
# 单行注释

'''
多行注释
'''

"""
多行注释
"""
```

## 1.3 变量和类型

```python
# 变量
a = 3
t_007 = 'T007'

# 常量
PI = 3.1415926

# 多个变量赋值
a,b,c = 3,4,5

# 变量类型
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

## 1.4 运算符

```python
# 算数运算符
a = 10
b = 3
a + b # 加法
a - b # 减法
a * b # 乘法
a / b # 除法，得到一个浮点数
a // b # 除法，得到一个整数
a % b # 取余
a ** b # 乘方

# 比较运算符
a == b # 等于
a != b # 不等于
a > b # 大于
a >= b # 大于等于
a < b # 小于
a <= b # 小于等于

# 逻辑运算符
a = True
b = False
a and b # 与
a or b # 或
not a # 非

# 位运算
a = 0b110
b = 0b101
a & b # 按位与
a | b # 按位或
a ^ b # 按位异或
~a # 按位取反
a << 2 # 左移
a >> 2 # 右移

# 赋值运算符
a = 10
a += 2 # 相当于 a = a + 2
a *= 3 # 相当于 a = a * 3
a /= 4 # 相当于 a = a / 4
a //= 5 # 相当于 a = a // 5
a %= 6 # 相当于 a = a % 6
a **= 7 # 相当于 a = a ** 7
a &= 8 # 相当于 a = a & 8
a |= 9 # 相当于 a = a | 9
a ^= 10 # 相当于 a = a ^ 10
a <<= 11 # 相当于 a = a << 11
a >>= 12 # 相当于 a = a >> 12

# 运算符的优先级
# 1. 算数运算符
# 2. 比较（关系）运算符
# 3. 逻辑运算符
# 4. 赋值运算符
```

## 1.5 字符串和常用数据结构

```python
# 字符串
s1 = 'hello, world!'
s2 = "hello, world!"
# 以三个双引号或单引号开头的字符串可以折行
s3 = """
hello, 
world!
"""
print(s1, s2, s3, end='')

# 转义字符
s1 = '\'hello, world!\''
s2 = '\n\\hello, world!\\\n'
print(s1, s2, end='')

# 字符串运算
s1 = 'hello ' * 3
print(s1) # hello hello hello
s2 = 'world'
s1 += s2
print(s1) # hello hello hello world

