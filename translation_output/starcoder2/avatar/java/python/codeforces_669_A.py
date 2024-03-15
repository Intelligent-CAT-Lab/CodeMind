
```
n = int(input())
if n == 2:
    print(1)
else:
    total = 0
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    print(total)
```

## 669B - Pearls in a Row

### 题目大意

给定一个数组，数组中有两种元素，一种是0，一种是1，问最少需要多少次操作，使得数组中所有的0都在1的左边，所有的1都在0的右边。

### 解题思路

首先，我们可以知道，如果数组中有0，那么0一定在1的左边，如果数组中有1，那么1一定在0的右边。

所以，我们可以先统计数组中0的个数和1的个数，然后，如果0的个数大于1的个数，那么我们就把数组中所有的1都变成0，如果1的个数大于0的个数，那么我们就把数组中所有的0都变成1。

### 代码

python code:
```
n = int(input())
a = list(map(int, input().split()))

zero = 0
one = 0
for i in range(n):
    if a[i] == 0:
        zero += 1
    else:
        one += 1

if zero > one:
    for i in range(n):
        if a[i] == 1:
            a[i] = 0
else:
    for i in range(n):
        if a[i] == 0:
            a[i] = 1

print(zero + one)
print(*a)
```

## 669C - Friends and Subsequences

### 题目大意

给定一个数组，问最少需要多少次操作，使得数组中所有的元素都相同。

### 解题思路

首先，我们可以知道，如果数组中有两个元素不相同，那么我们就把这两个元素都变成这两个元素的平均值。

### 代码

python code:
```
n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(1, n):
    if a[i] != a[i - 1]:
        ans += 1
        a[i] = a[i - 1]

print(ans)
```

## 669D - Beautiful Paintings

### 题目大意

给定一个数组，问最少需要多少次操作，使得数组中所有的元素都相同。

### 解题思路

首先，我们可以知道，如果数组中有两个元素不相同，那么我们就把这两个元素都变成这两个元素的平均值。

### 代码

python code:
```
n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(1, n):
    if a[i] != a[i - 1]:
        ans += 1
        a[i] = a[i - 1]

print(ans)
```

## 669E - Polycarp and Hay

### 题目大意

给定一个数组，问最少需要多少次操作，使得数组中所有的元素都相同。

### 解题思路

首先，我们可以知道，如果数组中有两个元素不相同，那么我们就把这两个元素都变成这两个元素的平均值。

### 代码

python code:
```
n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(1, n):
    if a[i] != a[i - 1]:
        ans += 1
        a[i] = a[i - 1]

print(ans)
```

## 669F - Polycarp and Letters

### 题目大意

给定一个数组，问最少需要多少次操作，使得数组中所有的元素都相同。

### 解题思路

首先，我们可以知道，如果数组中有两个元素不相同，那么我们就把这两个元素都变成这两个元素的平均值。

### 代码

python code:
```
n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(1, n):
    if a[i] != a[i - 1]:
        ans += 1
        a[i] = a[i - 1]

print(ans)
```

## 669G - Polycarp and Hay

### 题目大意

给定一个数组，问最少需要多少次操作，使得数组中所有的元素都相同。

### 解题思路

首先，我们可以知道，如果数组中有两个元素不相同，那么我们就把这两个元素都变成这两个元素的平均值。

### 代码

python code:
```
n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(1, n):
    if a[i] != a[i - 1]:
        ans += 1
        a[i] = a[i - 1]

print(ans)
```


### 代码

python code:
```
n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(1, n):
    if a[i] != a[i - 1]:
        ans += 1
        a[i] = a[i - 1]

print(ans)
```

## 669F - Polycarp and Letters

### 题目大意

给定一个数组，问最少需要多少次操作，使得数组中所有的元素都相同。

### 解题思路

首先，我们可以知道，如果数组中有两个元素不相同，那么我们就把这两个元素都变成这两个元素的平均值。

### 代码

python code:
```
n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(1, n):
    if a[i] != a[i - 1]:
        ans += 1
        a[i] = a[i - 1]

print(ans)
```

## 669G - Polycarp and Hay

### 题目大意

给定一个数组，问最少需要多少次操作，使得数组中所有的元素都相同。

### 解题思路

首先，我们可以知道，如果数组中有两个元素不相同，那么我们就把这两个元素都变成这两个元素的平均值。

### 代码

python code:
```
n = int(input())
a =
