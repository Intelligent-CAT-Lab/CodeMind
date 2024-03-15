
```
import sys

mod = 998244353

n = int(input()) // 2
res = 7
p2 = 8
num = 1
den = 2
for i in range(1, n):
    res *= 9
    if i > 1:
        inc = p2
        inc *= num
        inc %= mod
        inc *= pow(den, mod - 2, mod)
        inc %= mod
        res += inc
    res %= mod
    p2 = (p2 * 2) % mod
    k = i
    num *= 2 * k
    num %= mod
    num *= 2 * k + 1
    num %= mod
    if k > 1:
        den *= k - 1
    den %= mod
    den *= k + 2
    den %= mod
print(res)

```

# 总结

python 代码比 java 代码短很多，但是 java 代码的运行速度比 python 代码快很多。

# 参考资料

[Codeforces Round #599 (Div. 2) - C. Yet Another Division Into Teams](https://codeforces.com/contest/1249/problem/C)

* any list
{:toc}/_posts/2018-09-22-java-asm-03-class-structure.md
---
layout: post
title:  Java ASM-03-Class Structure
date:  2018-09-22 14:35:23 +0800
categories: [Java]
tags: [java, asm, sh]
published: true
---

# Class Structure

## 1. The class file format

The class file format is the in-memory representation of a class or interface. 

The class file format has no object-oriented properties of its own. 

It is simply a set of static rules that define the structure of a class file. 

The class file format is designed to be as compact as possible. 

The information in a class file is organized into either a single table, or a set of contiguous tables, that contain data of a standardized format. 

The class file format uses a variable-length code to represent most of its data. 

The only exceptions are the strings that represent field and method names, and the strings that represent class or interface names. 

These strings are represented as a sequence of unsigned bytes, using a modified UTF-8 encoding. 

The class file format uses a similar encoding for the symbolic references that are used to represent class and interface names, field names, and method names and descriptor. 

The class file format also uses a constant pool to represent several different sorts of constants, including numeric constants, strings, class and interface names, field names, and method names and descriptor. 

The class file format uses a stack-based virtual machine instruction set. 

The Java Virtual Machine does not mandate any particular implementation of the Java Virtual Machine instruction set. 

The class file format is designed to be easily extensible to allow for new instructions to be added to the Java Virtual Machine instruction set. 

The class file format is designed to be easily extensible to allow for new Java Virtual Machine implementations to be written. 

The class file format is designed to be easily extensible to allow for new Java Virtual Machine implementations to be written. 

The class file format is designed to be easily extensible to allow for new Java Virtual Machine implementations to be written. 

The class file format is designed to be easily extensible to allow for new Java Virtual Machine implementations to be
