
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k % 10 == 0 || k % 10 == 2 || k % 10 == 4 || k % 10 == 5 || k % 10 == 6 || k % 10 == 8) {
            System.out.println(-1);
        } else if (k % 10 == 1) {
            int tmp = k * 7;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                if (tmp / 10 % 10 <= 7) {
                    int num = 7 - tmp / 10 % 10;
                    int tmp2 = k * num;
                    tmp = tmp / 10 + tmp2;
                    ans++;
                } else if (tmp / 10 % 10 == 8) {
                    int num = 9;
                    int tmp2 = k * num;
                    tmp = tmp / 10 + tmp2;
                    ans++;
                } else if (tmp / 10 % 10 == 9) {
                    int num = 8;
                    int tmp2 = k * num;
                    tmp = tmp / 10 + tmp2;
                    ans++;
                }
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 3) {
            int tmp = k * 9;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) * 3 - 1) % 10;
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 7) {
            int tmp = k * 1;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) * 7 + 1) % 10;
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 9) {
            int tmp = k * 3;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) + 3) % 10;
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans++;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}
```
/docs/2020-04-05-python-100-days-day01-15.md
---
layout: post
title: "Python 100 days - Day 1-15"
date: 2020-04-05 12:00:00 +0800
categories: Python
tags: Python
---

## Day 1

### 1.1 第一个Python程序

```python
print('hello, world!')
```

### 1.2 运行程序

#### 1.2.1 交互式环境

```python
>>> print('hello, world!')
hello, world!
```

#### 1.2.2 脚本式

```python
# hello.py
print('hello, world!')
```

```bash
$ python hello.py
hello, world!
```

### 1.3 程序的注释

```python
# 第一个Python程序 - 你好，世界！

print('hello, world!') # 打印Hello, world!
```

### 1.4 程序的输入和输出

#### 1.4.1 输出

```python
>>> print('hello, world!')
hello, world!
```

#### 1.4.2 输入

```python
>>> name = input()
Michael
>>> name
'Michael'
```

### 1.5 练习

#### 1.5.1 练习1：输入并打印

```python
# -*- coding: utf-8 -*-

name = input('please enter your name: ')
print('hello,', name)
```

#### 1.5.2 练习2：输入并计算

```python
# -*- coding: utf-8 -*-

radius = float(input('please enter the radius: '))
print('the area is', 3.14 * radius * radius)
```

## Day 2

### 2.1 变量和类型

