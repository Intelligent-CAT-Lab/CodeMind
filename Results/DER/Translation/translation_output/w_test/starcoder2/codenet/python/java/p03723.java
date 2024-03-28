

```java

```
/docs/01.python/05.SYL/07.day07/01.作业.md
---
title: 作业
date: 2021-03-10 11:25:49
permalink: /pages/50701/
categories:
  - python
  - SYL
  - day07
tags:
  - 
---
# 作业

## 1. 写函数，检查传入字典的每一个value的长度,如果大于2，那么仅保留前两个长度的内容，并将新内容返回给调用者。

```python
dic = {"k1": "v1v1", "k2": [11,22,33,44]}

def check_len(dic):
    new_dic = {}
    for k,v in dic.items():
        if len(v) > 2:
            new_dic[k] = v[:2]
        else:
            new_dic[k] = v
    return new_dic

print(check_len(dic))
```

## 2. 写函数，检查获取传入列表或元组对象的所有奇数位索引对应的元素，并将其作为新列表返回给调用者。

```python
def check_odd(l):
    new_l = []
    for i in range(len(l)):
        if i % 2 == 1:
            new_l.append(l[i])
    return new_l

print(check_odd([1,2,3,4,5,6,7,8,9]))
```

## 3. 写函数，判断用户传入的对象（字符串、列表、元组）长度是否大于5。

```python
def check_len(obj):
    if len(obj) > 5:
        return True
    else:
        return False

print(check_len([1,2,3,4,5,6,7,8,9]))
```

## 4. 写函数，检查传入列表的长度，如果大于2，那么仅保留前两个长度的内容，并将新内容返回给调用者。

```python
def check_len(l):
    if len(l) > 2:
        return l[:2]
    else:
        return l

print(check_len([1,2,3,4,5,6,7,8,9]))
```

## 5. 写函数，计算传入字符串中【数字】、【字母】、【空格] 以及 【其他】的个数后返回结果。

```python
def check_str(s):
    num = 0
    alpha = 0
    space = 0
    other = 0
    for i in s:
        if i.isdigit():
            num += 1
        elif i.isalpha():
            alpha += 1
        elif i.isspace():
            space += 1
        else:
            other += 1
    return num,alpha,space,other

print(check_str("123abc 456"))
```

## 6. 写函数，接收两个数字参数，返回比较大的那个数字。

```python
def check_num(a,b):
    if a > b:
        return a
    else:
        return b

print(check_num(1,2))
```

## 7. 写函数，检查传入字典的每一个value的长度,如果大于2，那么仅保留前两个长度的内容，并将新内容返回给调用者。

```python
dic = {"k1": "v1v1", "k2": [11,22,33,44]}

def check_len(dic):
    new_dic = {}
    for k,v in dic.items():
        if len(v) > 2:
            new_dic[k] = v[:2]
        else:
            new_dic[k] = v
    return new_dic

print(check_len(dic))
```

## 8. 写函数，检查传入列表的长度，如果大于2，那么仅保留前两个长度的内容，并将新内容返回给调用者。

```python
def check_len(l):
    if len(l) > 2:
        return l[:2]
    else:
        return l

print(check_len([1,2,3,4,5,6,7,8,9]))
```

## 9. 写函数，接收一个参数（此参数类型必须是可迭代对象），并检查传入的参数的每一个元素，如果元素是数字类型，则检查是否大于5，如果大于5，则将该元素加入到一个新列表中，并将该新列表返回给调用者。

```python
def check_num(l):
    new_l = []
    for i in l:
        if i > 5:
            new_l.append(i)
    return new_l

print(check_num([1,2,3,4,5,6,7,8,9]))
```

## 10. 写函数，检查传入字典的每一个value的长度,如果大于2，那么仅保留前两个长度的内容，并将新内容返回给调用者。

```python
dic = {"k1": "v1v1", "k2": [11,22,33,44]}

def check_len(dic):
    new_dic = {}
    for k,v in dic.items():
        if len(v) > 2:
            new_dic[k] = v[:2]
        else:
            new_dic[k] = v
    return new_dic

print(check_len(dic))
```

## 11. 写函数，检查传入列表的长度，如果大于2，那么仅保留前两个长度的内容，并将新内容返回给调用者。

```python
def check_len(l):
    if len(l) > 2:
        return l[:2]
    else:
        return l

print(check_len([1,2,3,4,5,6,7,8,9]))
```

## 12. 写函数，接收两个数字参数，返回比较大的那个数字。

```python
def check_num(a,b):
    if a > b:
        return a
    else:
        return b

print(check_num(1,2))
```

## 13. 写函数，检查传入字典的每一个value的长度,如果大于2，那么仅保留前两个长度的内容，并将新内容返回给调用者。

```python
dic = {"k1": "v1v1", "k2": [11,22,33,44]}

def check_len(dic):
    new_dic = {}
    for k,v in dic.items():
        if len(v) > 2:
            new_dic[k] = v[:2]
        else:
            new_dic[k] = v
    return new_dic

print(check_len(dic))
```

## 14. 写函数，检查传入列表的长度，如果大于2，那么仅保留前两个长度的内容，并将新内容返回给调用者。

```python
def check_len(l):
    if len(l) > 2:
        return l[:2]
    else:
        return l

print(check_len([1,2,3,4,5,6,7,8,9]))
```
