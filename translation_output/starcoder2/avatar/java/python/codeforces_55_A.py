
```
n = int(input())
if (n & (n - 1)) == 0:
    print("YES")
else:
    print("NO")
```

## 56. 1006A - Adjacent Replacements

### 56.1. Problem

codeforces 1006A - Adjacent Replacements

### 56.2. Solution

```
n = int(input())
a = list(map(int, input().split()))
for i in range(n):
    if a[i] % 2 == 0:
        a[i] -= 1
print(*a)
```

## 57. 1006B - Polycarp and Div 3

### 57.1. Problem

codeforces 1006B - Polycarp and Div 3

### 57.2. Solution

```
n, k = map(int, input().split())
a = list(map(int, input().split()))
a.sort(reverse=True)
ans = 0
for i in range(k):
    ans += a[i]
    a[i] = 0
print(ans)
for i in range(n):
    if a[i] == 0:
        print(i + 1, end=' ')
```

## 58. 1006C - Three Parts of the Array

### 58.1. Problem

codeforces 1006C - Three Parts of the Array

### 58.2. Solution

```
n = int(input())
a = list(map(int, input().split()))
s = [0] * (n + 1)
for i in range(n):
    s[i + 1] = s[i] + a[i]
ans = 0
for i in range(n):
    l = 0
    r = n
    while r - l > 1:
        m = (l + r) // 2
        if s[m] - s[i] == s[i + 1] - s[m]:
            l = m
        else:
            r = m
    ans = max(ans, s[i] + s[n] - s[i + 1] - s[l])
print(ans)
```

## 59. 1006D - Good Substrings

### 59.1. Problem

codeforces 1006D - Good Substrings

### 59.2. Solution

```
s = input()
t = input()
n = len(s)
m = len(t)
ans = 0
for i in range(n - m + 1):
    if s[i:i + m] == t:
        ans += 1
print(ans)
```

## 60. 1006E - Polycarp and Div 2

### 60.1. Problem

codeforces 1006E - Polycarp and Div 2

### 60.2. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    if a[i] % 2 == 0:
        ans += 1
print(ans)
```

## 61. 1006F - Polycarp and Hay

### 61.1. Problem

codeforces 1006F - Polycarp and Hay

### 61.2. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    if a[i] % 2 == 0:
        ans += 1
print(ans)
```

## 62. 1006G - Polycarp and Coins

### 62.1. Problem

codeforces 1006G - Polycarp and Coins

### 62.2. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    if a[i] % 2 == 0:
        ans += 1
print(ans)
```

## 63. 1006H - Polycarp and Letters

### 63.1. Problem

codeforces 1006H - Polycarp and Letters

### 63.2. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    if a[i] % 2 == 0:
        ans += 1
print(ans)
```

## 64. 1006I - Polycarp and Snakes

### 64.1. Problem

codeforces 1006I - Polycarp and Snakes

### 64.2. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    if a[i] % 2 == 0:
        ans += 1
print(ans)
```

## 65. 1006J - Polycarp and Cubes

### 65.1. Problem

codeforces 1006J - Polycarp and Cubes

### 65.2. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    if a[i] % 2 == 0:
        ans += 1
print(ans)
```

## 66. 1006K - Polycarp and Hay

### 66.1. Problem

codeforces 1006K - Polycarp and Hay

### 66.2. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    if a[i] % 2 == 0:
        ans += 1
print(ans)
```

## 67. 1006L - Polycarp and Coins

### 67.1. Problem

codeforces 1006L - Polycarp and Coins

### 67.2. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    if a[i] % 2 == 0:
        ans += 1
print(ans)
```

## 68. 1006M - Polycarp and Letters

### 68.1. Problem

codeforces 1006M - Polycarp and Letters

### 68.2. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    if a[i] % 2 == 0:
        ans += 1
print(ans)
```

## 69. 1006N - Polycarp and Snakes

### 69.1. Problem

codeforces 1006N - Polycarp and Snakes

### 69.2. Solution

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    if a[i] % 2 == 0:
        ans += 1
print(ans)
```

## 70. 1006O - Polycarp and Cubes

### 70.1. Problem

codeforces 1006O - Polycarp and Cubes

### 70.
