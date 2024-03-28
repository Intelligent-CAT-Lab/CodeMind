

```python
n = int(input())
ans = 0
for i in range(1, n+1):
    ans += i * (n // i) * ((n // i) + 1) // 2
print(ans)
```

## 2. 1000000007

### 2.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are relatively prime to n.

### 2.2. Input

The input consists of a single integer n (1≤n≤10^7).

### 2.3. Output

Print the number of positive integers less than or equal to n that are relatively prime to n.

### 2.4. Sample Input 1

```
10
```

### 2.5. Sample Output 1

```
4
```

### 2.6. Sample Input 2

```
10000000
```

### 2.7. Sample Output 2

```
6666667
```

### 2.8. Solution

```python
n = int(input())
ans = n
for i in range(2, int(n**0.5)+1):
    if n % i == 0:
        ans -= ans // i
        while n % i == 0:
            n //= i
if n > 1:
    ans -= ans // n
print(ans)
```

## 3. 1000000007

### 3.1. Problem

Given a positive integer n, find the number of positive integers less than or equal to n that are relatively prime to n.

### 3.2. Input

The input consists of a single integer n (1≤n≤10^7).

### 3.3. Output

Print the number of positive integers less than or equal to n that are relatively prime to n.

### 3.4. Sample Input 1

```
10
```

### 3.5. Sample Output 1

```
4
```

### 3.6. Sample Input 2

```
10000000
```

### 3.7. Sample Output 2

```
6666667
```

### 3.8. Solution

```python
n = int(input())
ans = n
for i in range(2, int(n**0.5)+1):
    if n % i == 0:
        ans -= ans // i
        while n % i == 0:
            n //= i
if n > 1:
    ans -= ans // n
print(ans)
```
/atcoder/ABC172/ABC172_C.py
n, m, k = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a_sum = [0]
b_sum = [0]
for i in range(n):
    a_sum.append(a_sum[i] + a[i])
for i in range(m):
    b_sum.append(b_sum[i] + b[i])

ans = 0
j = m
for i in range(n+1):
    if a_sum[i] > k:
        break
    while j >= 0 and a_sum[i] + b_sum[j] > k:
        j -= 1
    ans = max(ans, i+j)
print(ans)
/atcoder/ABC172/ABC172_D.py
n = int(input())
ans = 0
for i in range(1, n+1):
    ans += i * (n // i) * ((n // i) + 1) // 2
print(ans)
/atcoder/ABC172/ABC172_B.py
s = input()
t = input()
ans = 0
for i in rans += 1
print(ans)
ange(len(s)):
    if s[i] != t[i]:
        /atcoder/ABC172/ABC172_A.py
a = int(input())
print(a + a**2 + a**3)
/atcoder/ABC172/ABC172_D_TLE.py
n = int(input())
ans = 0
for i in range(1, n+1):
    for j in range(1, n//i+1):
        ans += i
print(ans)

