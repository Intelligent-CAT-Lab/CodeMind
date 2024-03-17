

```python
import sys

t, s, q = map(int, sys.stdin.readline().split())

sum = 0
while s < t:
    s = s * q
    sum += 1

print(sum)
```

## 569B - Chat Online

### 题目大意

给定一个字符串，问是否可以将其中的某些字符替换成其他字符，使得字符串中没有连续的两个相同的字符。

### 解题思路

首先统计字符串中每个字符的个数，如果某个字符的个数大于字符串长度的一半，则说明这个字符一定不能被替换，否则可以被替换。

然后从字符串的第一个字符开始遍历，如果当前字符的个数大于字符串长度的一半，则将当前字符替换成下一个字符，否则不替换。

### 代码

```python
import sys

s = sys.stdin.readline().strip()

n = len(s)

cnt = [0] * 26

for i in range(n):
    cnt[ord(s[i]) - ord('a')] += 1

for i in range(n):
    if cnt[ord(s[i]) - ord('a')] > n // 2:
        if i + 1 < n:
            s = s[:i] + s[i + 1] + s[i + 2:]
        else:
            s = s[:i] + s[i + 1:]

print(s)
```

## 569C - Friends and Subsequences

### 题目大意

给定一个长度为 $n$ 的序列 $a$，问是否可以将其划分成若干个子序列，使得每个子序列的长度都为 $k$，且每个子序列中的元素都不相同。

### 解题思路

首先统计序列 $a$ 中每个元素的个数，如果某个元素的个数大于 $k$，则说明这个元素一定不能被划分到某个子序列中，否则可以被划分到某个子序列中。

然后从序列 $a$ 的第一个元素开始遍历，如果当前元素的个数大于 $k$，则将当前元素划分到下一个子序列中，否则不划分。

### 代码

```python
import sys

n, k = map(int, sys.stdin.readline().split())

a = list(map(int, sys.stdin.readline().split()))

cnt = [0] * (n + 1)

for i in range(n):
    cnt[a[i]] += 1

ans = []

for i in range(n):
    if cnt[a[i]] > k:
        if len(ans) == 0 or ans[-1][-1] != a[i]:
            ans.append([a[i]])
        else:
            ans[-1].append(a[i])
    else:
        if len(ans) == 0 or ans[-1][-1] != a[i]:
            ans.append([a[i]])
        else:
            ans[-1].append(a[i])
            ans.append([a[i]])

if len(ans) == 0:
    print(-1)
else:
    print(len(ans))
    for i in range(len(ans)):
        print(len(ans[i]), end=' ')
        for j in range(len(ans[i])):
            print(ans[i][j], end=' ')
        print()
```

## 569D - Friends and Subsequences (hard)

### 题目大意

给定一个长度为 $n$ 的序列 $a$，问是否可以将其划分成若干个子序列，使得每个子序列的长度都为 $k$，且每个子序列中的元素都不相同。

### 解题思路

首先统计序列 $a$ 中每个元素的个数，如果某个元素的个数大于 $k$，则说明这个元素一定不能被划分到某个子序列中，否则可以被划分到某个子序列中。

然后从序列 $a$ 的第一个元素开始遍历，如果当前元素的个数大于 $k$，则将当前元素划分到下一个子序列中，否则不划分。

### 代码

```python
import sys

n, k = map(int, sys.stdin.readline().split())

a = list(map(int, sys.stdin.readline().split()))

cnt = [0] * (n + 1)

for i in range(n):
    cnt[a[i]] += 1

ans = []

for i in range(n):
    if cnt[a[i]] > k:
        if len(ans) == 0 or ans[-1][-1] != a[i]:
            ans.append([a[i]])
        else:
            ans[-1].append(a[i])
    else:
        if len(ans) == 0 or ans[-1][-1] != a[i]:
            ans.append([a[i]])
        else:
            ans[-1].append(a[i])
            ans.append([a[i]])

if len(ans) == 0:
    print(-1)
else:
    print(len(ans))
    for i in range(len(ans)):
        print(len(ans[i]), end=' ')
        for j in range(len(ans[i])):
            print(ans[i][j], end=' ')
        print()
```

## 569E - Friends and Subsequences (hard version)

### 题目大意

给定一个长度为 $n$ 的序列 $a$，问是否可以将其划分成若干个子序列，使得每个子序列的长度都为 $k$，且每个子序列中的元素都不相同。

### 解题思路

首先统计序列 $a$ 中每个元素的个数，如果某个元素的个数大于 $k$，则说明这个元素一定不能被划分到某个子序列中，否则可以被划分到某个子序列中。

然后从序列 $a$ 的第一个元素开始遍历，如果当前元素的个数大于 $k$，则将当前元素划分到下一个子序列中，否则不划分。

### 代码

```python
import sys

n, k = map(int, sys.stdin.readline().split())

a = list(map(int,
