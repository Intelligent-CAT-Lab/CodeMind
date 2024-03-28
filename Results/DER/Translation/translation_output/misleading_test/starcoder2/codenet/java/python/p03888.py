

```python
import sys

r1, r2 = map(float, sys.stdin.readline().split())
print(1 / (1 / r1 + 1 / r2))
```


```

python code:

```python
import sys

n = int(sys.stdin.readline())
print(n * (n + 1) // 2)
```
/source/_posts/2019-09-01-CF118A.md
---
title: Codeforces Round #527 (Div. 3) A. String Task
date: 2019-09-01 10:00:00
tags:
- ACM
- Codeforces
- 字符串
categories:
- [ACM,Codeforces]
- [算法,字符串]
---

# A. String Task

## 题目描述

Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:

deletes all the vowels,
inserts a character "." before each consonant,
replaces all uppercase consonants with corresponding lowercase ones.
Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string.

Help Petya cope with this easy task.

You have to answer q independent test cases.

## 输入输出格式

### 输入格式：

The first line of the input contains one integer q (1≤q≤100) — the number of test cases. Then q test cases follow.

The only line of the test case contains the string s, consisting of uppercase and lowercase Latin letters.

It is guaranteed that the sum of the lengths of all strings s does not exceed 105 (∑|s|≤105).

### 输出格式：

For each test case, print the answer — the resulting string.

## 输入输出样例

### 输入样例#1：

```
4
tour
Codeforces
CompetitiveProgramming
Hello
```

### 输出样例#1：

```
.t.r
.c.d.f.r.c.s
.c.m.p.t.t.v.r.p.g.m.n.n.g
.h.l.l
```

## 说明

In the first test case of the example Petya should replace all the vowels with "." and insert a character "." before each consonant. Thus, the answer is ".t.r".

In the second test case of the example Petya should replace all the vowels with "." and insert a character "." before each consonant. Thus, the answer is ".c.d.f.r.c.s".

In the third test case of the example Petya should replace all the vowels with "." and insert a character "." before each consonant. Thus, the answer is ".c.m.p.t.t.v.r.p.g.m.n.n.g".

In the fourth test case of the example Petya should replace all the vowels with "." and insert a character "." before each consonant. Thus, the answer is ".h.l.l".

## 题意

给定一个字符串，将其中的元音字母删除，并在每个辅音字母前面加上一个点，然后将所有大写字母转换为小写字母。

## 题解

直接模拟即可。

## 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int q;
    cin >> q;
    while (q--) {
        string s;
        cin >> s;
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U' || s[i] == 'Y' || s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'y') {
                continue;
            }
            if (s[i] >= 'A' && s[i
