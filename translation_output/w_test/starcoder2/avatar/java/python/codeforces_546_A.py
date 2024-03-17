

```python
o, n, g = map(int, input().split())
x = 0
for i in range(1, g+1):
    x += i * o

borrow = x - n
if borrow <= 0:
    print(0)
else:
    print(borrow)
```

## 546B - Soldier and Bananas

[Problem](https://codeforces.com/problemset/problem/546/B)

[Solution](https://codeforces.com/contest/546/submission/115600088)

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))

a.sort()

ans = 0
for i in range(n):
    if a[i] + k <= 5:
        ans += 1
    else:
        break

print(ans)
```

## 546C - Soldier and Cards

[Problem](https://codeforces.com/problemset/problem/546/C)

[Solution](https://codeforces.com/contest/546/submission/115600308)

```python
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.reverse()
b.reverse()

while len(a) > 0 and len(b) > 0:
    if a[-1] > b[-1]:
        a.append(b.pop())
        a.append(a.pop())
    else:
        b.append(a.pop())
        b.append(b.pop())

if len(a) == 0:
    print('second', len(b))
else:
    print('first', len(a))
```

## 546D - Soldier and Number Game

[Problem](https://codeforces.com/problemset/problem/546/D)

[Solution](https://codeforces.com/contest/546/submission/115600508)

```python
def sieve(n):
    prime = [True for i in range(n + 1)]
    p = 2
    while (p * p <= n):
        if (prime[p] == True):
            for i in range(p * p, n + 1, p):
                prime[i] = False
        p += 1

    prime[0] = False
    prime[1] = False

    return prime


n = int(input())
prime = sieve(n)

ans = 0
for i in range(2, n + 1):
    if prime[i]:
        ans += n // i

print(ans)
```


```python
n = int(input())
a = list(map(int, input().split()))

a.sort()

ans = 0
for i in range(n):
    if a[i] + k <= 5:
        ans += 1
    else:
        break

print(ans)
```

## 546C - Soldier and Cards

[Problem](https://codeforces.com/problemset/problem/546/C)

[Solution](https://codeforces.com/contest/546/submission/115600308)

```python
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.reverse()
b.reverse()

while len(a) > 0 and len(b) > 0:
    if a[-1] > b[-1]:
        a.append(b.pop())
        a.append(a.pop())
    else:
        b.append(a.pop())
        b.append(b.pop())

if len(a) == 0:
    print('second', len(b))
else:
    print('first', len(a))
```

## 546D - Soldier and Number Game

[Problem](https://codeforces.com/problemset/problem/546/D)

[Solution](https://codeforces.com/contest/546/submission/115600508)

```python
def sieve(n):
    prime = [True for i in range(n + 1)]
    p = 2
    while (p * p <= n):
        if (prime[p] == True):
            for i in range(p * p, n + 1, p):
                prime[i] = False
        p += 1

    prime[0] = False
    prime[1] = False

    return prime


n = int(input())
prime = sieve(n)

ans = 0
for i in range(2, n + 1):
    if prime[i]:
        ans += n // i

print(ans)
```

## 546E - Soldier and Traveling

[Problem](https://codeforces.com/problemset/problem/546/E)

[Solution](https://codeforces.com/contest/546/submission/115600668)

```python
n, m = map(int, input().split())

g = [[] for i in range(n + 1)]

for i in range(m):
    u, v = map(int, input().split())
    g[u].append(v)
    g[v].append(u)

ans = 0
for i in range(1, n + 1):
    for j in range(i + 1, n + 1):
        if j not in g[i]:
            ans += 1

print(ans)
```
/codeforces/546/README.md
# Codeforces Round #303 (Div. 2)

## 546A - Soldier and Bananas

[Problem](https://codeforces.com/problemset/problem/546/A)

[Solution](https://codeforces.com/contest/546/submission/115600088)

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))

a.sort()

ans = 0
for i in range(n):
    if a[i] + k <= 5:
        ans += 1
    else:
        break

print(ans)
```

## 546B - Soldier and Bananas

[Problem](https://codeforces.com/problemset/problem/546/B)

[Solution](https://codeforces.com/contest/546/submission/115600088)

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))

a.sort()

ans = 0
for i in range(n):
    if a[i] + k <= 5:
        ans += 1
    else:
        break

print(ans)
```

## 546C - Soldier and Cards

[Problem](https://codeforces.com/problemset/problem/546/C)

[Solution](https://codeforces.com/contest/546/submission/115600308)

```python
n = int(input())
a = list(map(int, input().split()))
b = list(
