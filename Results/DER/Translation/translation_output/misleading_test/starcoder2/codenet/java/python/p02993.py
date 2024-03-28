

```python
word = input()
flag = False
for i in range(len(word)-1):
    if word[i] == word[i+1]:
        flag = True
        break
if flag:
    print("Bad")
else:
    print("Good")
```
/content/posts/2019-09-24-python-100-days-day-01-15/index.md
---
title: Python 100 days Day 01-15
author: 
type: post
date: 2019-09-24T07:45:26+00:00
url: /python-100-days-day-01-15/
categories:
  - Python
tags:
  - 100 days
  - python

---
# Day 1

## 1.1 变量和类型

### 1.1.1 变量命名规则

- 硬性规则：
  - 变量名由字母（广义的Unicode字符，不包括特殊字符）、数字和下划线构成，数字不能开头。
  - 大小写敏感（大写的a和小写的A是两个不同的变量）。
  - 不要跟关键字（有特殊含义的单词，后面会讲到）和系统保留字（如函数、模块等的名字）冲突。
- PEP 8要求：
  - 用小写字母拼写，多个单词用下划线连接。
  - 受保护的实例属性用单个下划线开头（后面会讲到）。
  - 私有的实例属性用两个下划线开头（后面会讲到）。

### 1.1.2 变量的使用

- 变量的使用
  - 变量的使用
  - 变量的赋值
  - 同时为多个变量赋值
  - 变量的类型

```python
a = 321
b = 123
print(a + b)
print(a - b)
print(a * b)
print(a / b)
print(a // b)
print(a % b)
print(a ** b)

a, b = 321, 123
print(a, b)

a = b = 1
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
a = 2
print(a, b)

a = 1
b = a
