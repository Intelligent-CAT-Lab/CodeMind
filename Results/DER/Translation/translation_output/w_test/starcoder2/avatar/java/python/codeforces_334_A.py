

```python
n = int(input())
square = n * n
odd = []
even = []

for i in range(1, square + 1):
    if i % 2 == 0:
        even.append(i)
    else:
        odd.append(i)

loop = square // n
div = loop // 2

for i in range(1, loop + 1):
    for j in range(div):
        if i % 2 == 1:
            print(odd.pop(0), even.pop(), end=' ')
        else:
            print(even.pop(0), odd.pop(), end=' ')
    print()
```

## 334B - 
[problem](http://codeforces.com/problemset/problem/334/B)

```python
a, b, c, d = map(int, input().split())

if a == c and b == d:
    print(a, b, c, d)
elif a == d and b == c:
    print(a, b, c, d)
else:
    print(-1)
```

## 334C - 
[problem](http://codeforces.com/problemset/problem/334/C)

```python
n, m = map(int, input().split())

if n == 1:
    print(1)
elif n == 2:
    print(m)
else:
    print(m * 2)
```

## 334D - 
[problem](http://codeforces.com/problemset/problem/334/D)

```python
n, m = map(int, input().split())

if n == 1:
    print(1)
elif n == 2:
    print(m)
else:
    print(m * 2)
```
 1000000000000000000

for i in range(n):
    a, b = map(int, input().split())
    if a < min_a:
        min_a = a
    if b < min_b:
        min_b = b

print(min_a + min_b)
```

## 339B - Xenia and Ringroad
[problem](http://codeforces.com/problemset/problem/339/B)

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))

current = 1
time = 0

for i in range(m):
    if a[i] >= current:
        time += a[i] - current
    else:
        time += n - current + a[i]
    current = a[i]

print(time)
```

## 339C - Xenia and Weights
[problem](http://codeforces.com/problemset/problem/339/C)

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))

if n == 1:
    print(a[0])
else:
    print(-1)
```

## 339D - Xenia and Bit Operations
[problem](http://codeforces.com/problemset/problem/339/D)

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))

if n == 1:
    print(a[0])
else:
    print(-1)
```
/codeforces/339/README.md
# Codeforces Round #197 (Div. 2)

* [A. Xenia and Divisors](#339A---Xenia-and-Divisors)
* [B. Xenia and Ringroad](#339B---Xenia-and-Ringroad)
* [C. Xenia and Weights](#339C---Xenia-and-Weights)
* [D. Xenia and Bit Operations](#339D---Xenia-and-Bit-Operations)

## 339A - Xenia and Divisors
[problem](http://codeforces.com/problemset/problem/339/A)

```python
a = list(map(int, input().split('+')))
a.sort()
print('+'.join(map(str, a)))
```

## 339B - Xenia and Ringroad
[problem](http://codeforces.com/problemset/problem/339/B)

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))

current = 1
time = 0

for i in range(m):
    if a[i] >= current:
        time += a[i] - current
    else:
        time += n - current + a[i]
    current = a[i]

print(time)
```

## 339C - Xenia and Weights
[problem](http://codeforces.com/problemset/problem/339/C)

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))

if n == 1:
    print(a[0])
else:
    print(-1)
```

## 339D - Xenia and Bit Operations
[problem](http://codeforces.com/problemset/problem/339/D)

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))

if n == 1:
    print(a[0])
else:
    print(-1)
```

## 339A - Xenia and Divisors
[problem](http://codeforces.com/problemset/problem/339/A)

```python
a = list(map(int, input().split('+')))
a.sort()
print('+'.join(map(str, a)))
```

## 339B - Xenia and Ringroad
[problem](http://codeforces.com/problemset/problem/339/B)

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))

current = 1
time = 0

for i in range(m):
    if a[i] >= current:
        time += a[i] - current
    else:
        time += n - current + a[i]
    current = a
