

```python
import sys

x, y, a, b = map(int, sys.stdin.readline().split())

res = []
for i in range(a, x + 1):
    for j in range(b, y + 1):
        if i <= j:
            continue
        res.append(str(i) + " " + str(j))

print(len(res))
for i in res:
    print(i)
```

## 2. 1000A - Codeforces

### 2.1. Description

You are given a string s consisting of lowercase English letters.

You can perform the following operation any number of times (possibly, zero): choose any two adjacent characters of s that are equal and remove them.

For example, if s="abacaba", then after one operation of the described type s="abaca", and after another operation s="aca".

Your task is to find the minimum number of operations needed to obtain a string consisting of one distinct letter.

### 2.2. Input

The first line of the input contains one integer n (1≤n≤100) — the length of s.

The second line of the input contains the string s consisting of n lowercase English letters.

### 2.3. Output

Print one integer — the minimum number of operations needed to obtain a string consisting of one distinct letter.

### 2.4. Sample test(s)

input
```
7
abacaba
```
output
```
1
```
input
```
5
aaaaa
```
output
```
4
```
input
```
10
abacabadab
```
output
```
0
```

### 2.5. Solution

```python
import sys

n = int(sys.stdin.readline())
s = sys.stdin.readline().strip()

res = 0
for i in range(n - 1):
    if s[i] == s[i + 1]:
        res += 1

print(res)
```


```

### 2.5. Solution

```python
import sys

n = int(sys.stdin.readline())

res = 0
for i in range(n):
    a, b = map(int, sys.stdin.readline().split())
    res += a * b

print(res)
```
/2020-09-27-codeforces-round-670-div-2/README.md
# Codeforces Round #670 (Div. 2)

## 1. 1409A - Codeforces

### 1.1. Description

You are given two positive integers a and b.

In one move, you can choose an integer x (1≤x≤109) and subtract x from a and add x to b.

What is the minimum number of moves needed to make a=b?

### 1.2. Input

The first line contains a single integer t (1≤t≤1000) — the number of test cases.

Each test case consists of two lines.

The first line contains a single integer a (1≤a≤109) — the initial value of a.

The second line contains a single integer b (1≤b≤109) — the initial value of b.

### 1.3. Output

For each test case, print a single integer — the minimum number of moves needed to make a=b.

### 1.4. Sample test(s)

input
```
5
1
2
10
10
100
100
1000000000
1000000000
1
1000000000
```
output
```
1
0
10
0
1000000000
```

### 1.5. Solution

```python
import sys

t = int(sys.stdin.readline())

for i in range(t):
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())

    print(abs(a - b))
```

## 2. 1409B - Codeforces

### 2.1. Description

You are given n pairs of integers a1,b1,a2,b2,…,an,bn.

For each i (1≤i≤n), you can choose an integer xi (1≤xi≤109) and subtract it from ai and add it to bi.

What is the maximum possible value of min(x1,x2,…,xn)?

### 2.2. Input

The first line contains a single integer t (1≤t≤1000) — the number of test cases.

Each test case consists of two lines.

The first line contains a single integer n (1≤n≤100) — the number of pairs.

The second line contains 2n integers a1,b1,a2,b2,…,an,bn (1≤ai,bi≤109) — the pairs.

### 2.3. Output

For each test case, print a single integer — the maximum possible value of min(x1,x2,…,xn).

### 2.4. Sample test(s)

input
```
5
1
1 1
2
1 100 100 1
2
1 100 100 100
3
1 100 100 100 100 100
4
1 100 100 100 100 100 100 100
```
output
```
0
1
0
1
0
```

### 2.5. Solution

```python
import sys

t = int(sys.stdin.readline())

for i in range(t):
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))

    res = 0
    for j in range(0, 2 * n, 2):
        res = max(res, min(a[j], a[j + 1]))

    print(res)
```

## 3. 1409C - Codeforces

### 3.1. Description

You are given a string s consisting of n lowercase English letters.

You can perform the following operation any number of times (possibly, zero): choose any two adjacent characters of s that are equal and remove them.

For example, if s="abacaba", then after one operation of the described type s="abaca", and after another operation s="aca".

Your task is to find the minimum number of operations needed to obtain a string consisting of one distinct letter.

### 3.2. Input

The first line of the input contains one integer n (1≤n≤100) — the length of s.

The second line of the input contains the string s consisting of n lowercase English letters.

### 3.3. Output

Print one integer — the minimum number of operations needed to obtain a string consisting of one distinct letter.

### 3.4. Sample test(s)

input
```
7
abacaba
```
output

