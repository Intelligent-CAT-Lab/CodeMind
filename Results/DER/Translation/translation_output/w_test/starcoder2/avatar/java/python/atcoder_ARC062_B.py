

```python
input = input()
p = 0
g = 1
result = 0
for i in range(1, len(input)):
    if input[i] == 'g':
        if p + 1 <= g:
            result += 1
            p += 1
        else:
            g += 1
    else:
        if p + 1 <= g:
            p += 1
        else:
            g += 1
            result -= 1
print(result)
```


```python
n = int(input())
a = list(map(int, input().split()))

a.sort()

print(a[n//2] - a[n//2 - 1])
```
/atcoder/atcoder_ABC081_B.md
# atcoder ABC081 B - Shift only

## Problem

https://atcoder.jp/contests/abc081/tasks/abc081_b

## Solution

```python
n = int(input())
a = list(map(int, input().split()))

count = 0
while True:
    if all(i % 2 == 0 for i in a):
        a = [i // 2 for i in a]
        count += 1
    else:
        break

print(count)
```

## Problem

https://atcoder.jp/contests/abc081/tasks/abc081_a

## Solution

```python
s = input()

print(s.count('1'))
```

## Problem

https://atcoder.jp/contests/abc081/tasks/abc081_c

## Solution

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))

a_dict = {}
for i in a:
    if i in a_dict:
        a_dict[i] += 1
    else:
        a_dict[i] = 1

a_dict = sorted(a_dict.items(), key=lambda x: x[1], reverse=True)

result = 0
for i in range(k):
    result += a_dict[i][1]

print(result)
```

## Problem

https://atcoder.jp/contests/abc081/tasks/abc081_d

## Solution

```python
n = int(input())
a = list(map(int, input().split()))

a_sorted = sorted(a)

if a_sorted[0] == a_sorted[-1]:
    print(0)
elif a_sorted[0] < a_sorted[-1]:
    print(sum(abs(i) for i in a) - 2 * min(a))
else:
    print(sum(abs(i) for i in a) - 2 * max(a))
```

## Problem

https://atcoder.jp/contests/abc081/tasks/abc081_e

## Solution/atcoder/atcoder_ABC083_B.md
# atcoder ABC083 B - Some Sums

## Problem

https://atcoder.jp/contests/abc083/tasks/abc083_b

## Solution

```python
n, a, b = map(int, input().split())

result = 0
for i in range(1, n + 1):
    if a <= sum(map(int, str(i))) <= b:
        result += i

print(result)
```

## Problem

https://atcoder.jp/contests/abc083/tasks/abc083_a

## Solution

```python
a, b, c, d = map(int, input().split())

if a + b > c + d:
    print('Left')
elif a + b < c + d:
    print('Right')
else:
    print('Balanced')
```

## Problem

https://atcoder.jp/contests/abc083/tasks/abc083_c

## Solution

```python
x, y = map(int, input().split())

count = 0
while x <= y:
    x *= 2
    count += 1

print(count)
```

## Problem

https://atcoder.jp/contests/abc083/tasks/abc083_d

## Solution

```python
n = int(input())
s = input()

count = 0
for i in range(n):
    if s[i] == '0':
        count += 1

if count == 0 or count == n:
    print(n)
else:
    print(max(count, n - count))
```
/atcoder/atcoder_ABC085_B.md
# atcoder ABC085 B 

## Solution

```python
n = int(input())
d = [int(input()) for _ in range(n)]

print(len(set(d)))
```

## Problem

https://atcoder.jp/contests/abc085/tasks/abc085_a

## Solution

```python
s = input()

print(s.replace('2017', '2018'))
```

## Problem

https://atcoder.jp/contests/abc085/tasks/abc085_c

## Solution

```python
n, y = map(int, input().split())

for i in range(n + 1):
    for j in range(n + 1 - i):
        if 10000 * i + 5000 * j + 1000 * (n - i - j) == y:
            print(i, j, n - i - j)
            exit()

print(-1, -1, -1)
```

## Problem

https://atcoder.jp/contests/abc085/tasks/abc085_d

## Solution

```python
n, h = map(int, input().split())
a = []
b = []
for _ in range(n):
    ai, bi = map(int, input().split())
    a.append(ai)
    b.append(bi)

a.sort(reverse=True)
b.sort(reverse=True)

count = 0
for i in b:
    if i > a[0]:
        h -= i
        count += 1
        if h <= 0:
            print(count)
            exit()

count += (h + a[0] - 1) // a[0]
print(count)
```
- Kagami Mochi

## Problem

https://atcoder.jp/contests/abc085/tasks/abc085_b

## Solution

```python
n = int(input())
d = [int(input()) for _ in range(n)]

print(len(set(d)))
```

## Problem

https://atcoder.jp/contests/abc085/tasks/abc085_b

## Solution

```python
n = int(input())
d = [int(input()) for _ in range(n)]

print(len(set(d)))
```

## Problem

https://atcoder.jp/contests/abc085/tasks/abc085_b

## Solution

```python
n = int(input())
d = [int(input()) for _ in range(n)]

print(len(set(d)))
```

## Problem

