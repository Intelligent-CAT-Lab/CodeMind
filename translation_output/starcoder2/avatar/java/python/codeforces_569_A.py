
```
t = int(input())
s = int(input())
q = int(input())
sum = 0
while s < t:
    s = s * q
    sum += 1
print(sum)
```

## 570A. Elections

### 题目大意

给定一个n*m的矩阵，矩阵的每一行代表一个选区，每一列代表一个候选人，矩阵的每一个元素代表这个候选人在这个选区的得票数。求出得票数最多的候选人。

### 解题思路

遍历每一列，求出每一列的最大值，然后统计最大值出现的次数，如果最大值出现的次数大于1，则输出“no winner”，否则输出最大值所在的列的序号。

### 代码

python code:
```
n, m = map(int, input().split())
a = []
for i in range(n):
    a.append(list(map(int, input().split())))

max_vote = 0
max_vote_index = 0
for i in range(m):
    vote = 0
    for j in range(n):
        vote += a[j][i]
    if vote > max_vote:
        max_vote = vote
        max_vote_index = i

count = 0
for i in range(n):
    if a[i][max_vote_index] == max_vote:
        count += 1

if count > 1:
    print("no winner")
else:
    print(max_vote_index + 1)
```

## 570B. Replacement

### 题目大意

给定一个长度为n的数组，数组的元素为0或1，现在要将数组的第一个元素变为1，问最少需要多少次操作才能使得数组中所有的元素都为1。

### 解题思路

如果数组的长度为1，则输出0，否则，如果数组的第一个元素为0，则输出n-1，否则，如果数组的最后一个元素为0，则输出n-1，否则，输出n-2。

### 代码

python code:
```
n = int(input())
a = list(map(int, input().split()))
if n == 1:
    print(0)
elif a[0] == 0:
    print(n - 1)
elif a[n - 1] == 0:
    print(n - 1)
else:
    print(n - 2)
```

## 570C. Replacement

### 题目大意

给定一个长度为n的字符串，字符串中只包含小写字母，现在要将字符串中的所有字母都变为小写，问最少需要多少次操作才能使得字符串中所有的字母都为小写。

### 解题思路

遍历字符串，统计大写字母的个数，如果大写字母的个数为0，则输出0，否则，输出n-1。

### 代码

python code:
```
n = int(input())
s = input()
count = 0
for i in range(n):
    if s[i].isupper():
        count += 1
if count == 0:
    print(0)
else:
    print(n - 1)
```

## 570D. Replacement

### 题目大意

给定一个长度为n的字符串，字符串中只包含小写字母，现在要将字符串中的所有字母都变为小写，问最少需要多少次操作才能使得字符串中所有的字母都为小写。

### 解题思路

遍历字符串，统计大写字母的个数，如果大写字母的个数为0，则输出0，否则，输出n-1。

### 代码

python code:
```
n = int(input())
s = input()
count = 0
for i in range(n):
    if s[i].isupper():
        count += 1
if count == 0:
    print(0)
else:
    print(n - 1)
```

## 570E. Replacement

### 题目大意

给定一个长度为n的字符串，字符串中只包含小写字母，现在要将字符串中的所有字母都变为小写，问最少需要多少次操作才能使得字符串中所有的字母都为小写。

### 解题思路

遍历字符串，统计大写字母的个数，如果大写字母的个数为0，则输出0，否则，输出n-1。

### 代码

python code:
```
n = int(input())
s = input()
count = 0
for i in range(n):
    if s[i].isupper():
        count += 1
if count == 0:
    print(0)
else:
    print(n - 1)
```

## 570F. Replacement

### 题目大意

给定一个长度为n的字符串，字符串中只包含小写字母，现在要将字符串中的所有字母都变为小写，问最少需要多少次操作才能使得字符串中所有的字母都为小写。

### 解题思路

遍历字符串，统计大写字母的个数，如果大写字母的个数为0，则输出0，否则，输出n-1。

### 代码

python code:
```
n = int(input())
s = input()
count = 0
for i in range(n):
    if s[i].isupper():
        count += 1
if count == 0:
    print(0)
else:
    print(n - 1)
```

## 570G. Replacement

### 题目大意

给定一个长度为n的字符串，字符串中只包含小写字母，现在要将字符串中的所有字母都变为小写，问最少需要多少次操作才能使得字符串中所有的字母都为小写。

### 解题思路

遍历字符串，统计大写字母的个数，如果大写字母的个数为0，则输出0，否则，输出n-1。

### 代码

python code:
```
n = int(input())
s = input()
count = 0
for i in range(n):
    if s[i].isupper():
