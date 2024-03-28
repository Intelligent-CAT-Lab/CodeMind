

```python
s = input()
ar = [0] * 26
for i in range(len(s)):
    ar[ord(s[i]) - 97] += 1
cntod = 0
for i in range(26):
    if ar[i] % 2 != 0:
        cntod += 1
if cntod == 0:
    print("First")
else:
    if cntod % 2 == 0:
        print("Second")
    else:
        print("First")
```

## 276B - Little Girl and Game

### 题目大意

给定一个字符串，问是否可以将其中的字符重新排列，使得字符串中所有字符的个数都是偶数。

### 解题思路

统计字符串中每个字符的个数，如果个数为奇数，则将奇数个数的字符个数加一，最后判断奇数个数的字符个数是否为偶数。

### 代码

```python
s = input()
ar = [0] * 26
for i in range(len(s)):
    ar[ord(s[i]) - 97] += 1
cntod = 0
for i in range(26):
    if ar[i] % 2 != 0:
        cntod += 1
if cntod % 2 == 0:
    print("First")
else:
    print("Second")
```

## 276C - Little Girl and Maximum Sum

### 题目大意

给定一个长度为n的数组，和一个长度为n的数组b，数组b中的元素互不相同，问将数组a中的元素按照数组b中的元素的顺序进行排序，求排序后的数组a的最大值。

### 解题思路

将数组b中的元素按照从小到大的顺序进行排序，然后将数组a中的元素按照数组b中的元素的顺序进行排序，最后求排序后的数组a的最大值。

### 代码

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

b_index = [0] * (n + 1)
for i in range(n):
    b_index[b[i]] = i

a.sort(key=lambda x: b_index[x])

ans = 0
for i in range(n):
    ans += a[i] * (n - i)
print(ans)
```

## 276D - Little Girl and Maximum XOR

### 题目大意

给定一个长度为n的数组，问数组中两个元素的异或值最大是多少。

### 解题思路

将数组中的元素按照二进制表示的位数从大到小进行排序，然后从高位到低位依次判断，如果当前位的两个元素异或值不为0，则将当前位的两个元素异或值加到答案中，然后将当前位的两个元素异或值置为0。

### 代码

```python
n = int(input())
a = list(map(int, input().split()))

a.sort(key=lambda x: bin(x)[2:][::-1])

ans = 0
for i in range(n - 1):
    ans ^= a[i]
print(ans)
```

## 276E - Little Girl and Problem on Trees

### 题目大意

给定一棵n个节点的树，问从根节点到每个节点的路径上有多少个节点的度数为偶数。

### 解题思路

将树的每个节点按照深度从小到大进行排序，然后从根节点开始依次判断每个节点的度数是否为偶数，如果为偶数，则将答案加一，然后将当前节点的度数减一，然后将当前节点的每个子节点的度数减一。

### 代码

```python
n = int(input())
a = list(map(int, input().split()))

a.sort()

ans = 0
for i in range(n):
    if a[i] % 2 == 0:
        ans += 1
        a[i] -= 1
    for j in range(i + 1, n):
        a[j] -= 1
print(ans)
```

## 276F - Little Girl and Maximum XOR

### 题目大意

给定一个长度为n的数组，问数组中两个元素的异或值最大是多少。

### 解题思路

将数组中的元素按照二进制表示的位数从大到小进行排序，然后从高位到低位依次判断，如果当前位的两个元素异或值不为0，则将当前位的两个元素异或值加到答案中，然后将当前位的两个元素异或值置为0。

### 代码

```python
n = int(input())
a = list(map(int, input().split()))

a.sort(key=lambda x: bin(x)[2:][::-1])

ans = 0
for i in range(n - 1):
    ans ^= a[i]
print(ans)
```

## 276G - Little Girl and Maximum XOR

### 题目大意

给定一个长度为n的数组，问数组中两个元素的异或值最大是多少。

### 解题思路

将数组中的元素按照二进制表示的位数从大到小进行排序，然后从高位到低位依次判断，如果当前位的两个元素异或值不为0，则将当前位的两个元素异或值加到答案中，然后将当前位的两个元素异或值置为0。

### 代码

```python
n = int(input())
a = list(map(int, input().split()))

a.sort(key=lambda x: bin(x)[2:][::-1])

ans = 0
for i in range(n - 1):
    ans ^= a[i]
print(ans)
```
/source/_posts/2017-08-06-codeforces-round-426-div-2.md
---
title: Codeforces Round #426 (Div. 2)
date: 2017-08-06 15:00:00
tags:
- ACM
- Codeforces
- 题解
categories:
- 题解
---

## A. The New Year: Meeting Friends

### 题目大意

给定三个人的坐标，问他们三个人在同一条直线上最多可以聚在一起的距离是多少。

### 解题思路

将三个人的坐标从小到大排序，然后求出三个人的坐标的中位数，最后求出三个人的坐标的中位数与
