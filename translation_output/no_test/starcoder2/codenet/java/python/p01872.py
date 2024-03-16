
```
s = input()
if s[-1] == '?':
    sum = 0
    for i in range(len(s) - 1):
        n = 11 - i
        q = 0
        p = int(s[i])
        if n <= 6 and n >= 1:
            q = n + 1
        else:
            q = n - 5
        sum += q * p
    sum %= 11
    if sum <= 1:
        sum = 0
    else:
        sum = 11 - sum
    print(sum)
else:
    check = int(s[-1])
    cnt = 0
    ans = 0
    for j in range(10):
        sum = 0
        for i in range(len(s) - 1):
            n = 11 - i
            q = 0
            p = 0
            if s[i] == '?':
                p = j
            else:
                p = int(s[i])
            if n <= 6 and n >= 1:
                q = n + 1
            else:
                q = n - 5
            sum += q * p
        sum %= 11
        if sum <= 1:
            sum = 0
        else:
            sum = 11 - sum
        if check == sum:
            cnt += 1
            ans = j
    if cnt == 1:
        print(ans)
    else:
        print("MULTIPLE")
```
/source/_posts/2019-03-10-python-100-days-day01-note.md
---
title: python-100-days-day01-note
date: 2019-03-10 16:00:00
tags: [python,python100days]
categories: python
---

# python-100-days-day01-note

## 1.1 python简介

### 1.1.1 python的发展历史

- 1989年圣诞节：开始写Python语言的编译器。
- 1991年2月：第一个Python编译器（同时也是解释器）诞生，它是用C语言实现的（后面），可以调用C语言的库函数。在最早的版本中，Python已经提供了对“类”，“函数”，“异常处理”等构造块的支持，还有对列表、字典等核心数据类型，同时支持以模块为基础来构造应用程序。
- 1994年1月：Python 1.0正式发布。
- 2000年10月16日：Python 2.0发布，增加了实现完整的垃圾回收，并且支持Unicode。
- 2008年12月3日：Python 3.0发布，此版不完全兼容之前的Python源代码。不过，很多新特性后来也被移植到旧的版本。

### 1.1.2 python的优缺点

- 优点：
  - 简单易学
  - 免费开源
  - 高层语言
  - 可移植性
  - 解释性
  - 面向对象
  - 可扩展性
  - 丰富的库
- 缺点：
  - 运行速度慢
  - 代码不能加密

### 1.1.3 python的应用领域

- 云计算
- WEB开发
- 科学运算
- 人工智能
- 系统运维
- 金融
- 图形、多媒体
- 网络爬虫

## 1.2 python开发环境配置

### 1.2.1 python的解释器

- CPython：官方版本的解释器，使用C语言开发，由Cpython官方社区管理，是使用最广的Python解释器。
- IPython：基于CPython之上的一个交互式解释器，交互方式增强，功能和CPython一样。
- PyPy：目标是执行速度，PyPy采用JIT技术，对Python代码进行动态编译，所以可以显著提高Python代码的执行速度。
- Jython：运行在Java平台上的Python解释器，可以直接把Python代码编译成Java字节码执行。
-
