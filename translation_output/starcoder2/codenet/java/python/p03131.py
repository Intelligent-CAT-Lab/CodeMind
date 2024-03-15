
```
K, A, B = map(int, input().split())

sum = 1+K
if A < B:
    sum1 = 1
    if A > sum1:
        K -= (A-sum1)
        sum1 = A
    sum1 += (B-A)*(K//2)
    if K%2 == 1:
        sum1 += 1
    sum = max(sum, sum1)
print(sum)
```

## 3132. 
### 题目描述

### 输入描述

### 输出描述

### 输入输出样例

#### 输入 #1

```

```

#### 输出 #1

```

```

### 说明/提示


### 输入输出样例

#### 输入 #1

```

```

#### 输出 #1

```

```

### 说明/提示
/p03132.md
# 3132. 
## 题目描述

## 输入描述

## 输出描述/p03131.py
K, A, B = map(int, input().split())

sum = 1+K
if A < B:
    sum1 = 1
    if A > sum1:
        K -= (A-sum1)
        sum1 = A
    sum1 += (B-A)*(K//2)
    if K%2 == 1:
        sum1 += 1
    sum = max(sum, sum1)
print(sum)

