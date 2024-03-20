
```python
def isLatinLetter(c):
    return c >= 'a' and c <= 'z'

def iscodeforces_147_A(c):
    if c == '.':
        return True
    if c == ',':
        return True
    if c == '!':
        return True
    if c == '?':
        return True
    return False

s = input()
sb = ''
n = len(s)
sb += s[0]
for i in range(1, n):
    c = s[i]
    if isLatinLetter(c):
        if not isLatinLetter(s[i - 1]):
            sb += ' '
        sb += c
    elif iscodeforces_147_A(c):
        sb += c
print(sb)
```

## 148A. Insomnia cure

```python
k = int(input())
l = int(input())
m = int(input())
n = int(input())
d = int(input())

count = 0
for i in range(1, d + 1):
    if i % k == 0 or i % l == 0 or i % m == 0 or i % n == 0:
        count += 1
print(count)
```

## 149A. Business trip

```python
k = int(input())
a = list(map(int, input().split()))
a.sort()

if sum(a) < k:
    print(-1)
else:
    count = 0
    for i in range(11):
        if sum(a[11 - i - 1:]) >= k:
            count = i + 1
            break
    print(count)
```

## 150A. Win or Freeze

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))

count = 0
for i in range(n):
    if a[i] > 0:
        count += 1
if count >= k:
    print('NO')
else:
    print('YES')
```

## 151A. Soft Drinking

```python
n = int(input())
k = int(input())
l = int(input())
c = int(input())
d = int(input())
p = int(input())
nl = int(input())
np = int(input())

print(min(k * n // nl, c * d, p // np) // n)
```

## 152A. Marks

```python
n, m = map(int, input().split())
a = []
for i in range(n):
    a.append(input())

max_score = 0
for i in range(m):
    max_score = max(max_score, max(map(lambda x: int(x[i]), a)))

count = 0
for i in range(n):
    for j in range(m):
        if a[i][j] == str(max_score):
            count += 1
print(count)
```

## 153A. Game Outcome

```python
n = int(input())

if n % 2 == 0:
    print('white')
    print('1 2')
else:
    print('black')
```

## 155A. I_love_username

```python
n = int(input())
a = list(map(int, input().split()))

max_score = a[0]
min_score = a[0]
count = 0
for i in range(1, n):
    if a[i] > max_score:
        max_score = a[i]
        count += 1
    if a[i] < min_score:
        min_score = a[i]
        count += 1
print(count)
```

## 158A. Next Round

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))

count = 0
for i in range(n):
    if a[i] >= a[k - 1] and a[i] > 0:
        count += 1
print(count)
```

## 158B. Taxi

```python
n = int(input())
a = list(map(int, input().split()))

count = 0
for i in range(4):
    count += a.count(i + 1)

count += a.count(4)
count += (a.count(3) + 3) // 4
count += (a.count(2) + 1) // 2
print(count)
```

## 160A. Twins

```python
n = int(input())
a = list(map(int, input().split()))
a.sort()

sum_a = sum(a)
sum_b = 0
count = 0
for i in range(n - 1, -1, -1):
    sum_b += a[i]
    count += 1
    if sum_b > sum_a - sum_b:
        break
print(count)
```

## 165A. Supercentral Point

```python
n = int(input())
a = []
for i in range(n):
    a.append(list(map(int, input().split())))

count = 0
for i in range(n):
    x = a[i][0]
    y = a[i][1]
    flag = True
    for j in range(n):
        if i == j:
            continue
        if a[j][0] == x and a[j][1] > y:
            flag = False
            break
    if flag:
        continue
    flag = True
    for j in range(n):
        if i == j:
            continue
        if a[j][0] == x and a[j][1] < y:
            flag = False
            break
    if flag:
        continue
    flag = True
    for j in range(n):
        if i == j:
            continue
        if a[j][1] == y and a[j][0] > x:
            flag = False
            break
    if flag:
        continue
    flag = True
    for j in range(n):
        if i == j:
            continue
        if a[j][1] == y and a[j][0] < x:
            flag = False
            break
    if flag:
        continue
    count += 1
print(count)
```

## 166A. Rank List

```python
n, k = map(int, input().split())
a = []
for i in range(n):
    a.append(list(map(int, input().split())))

a.sort(key=lambda x: (-x[0], x[1]))

count = 0
for i in range(n):
    if a[i][0] == a[k - 1][0] and a[i][1] == a[k - 1][1]:
        count
