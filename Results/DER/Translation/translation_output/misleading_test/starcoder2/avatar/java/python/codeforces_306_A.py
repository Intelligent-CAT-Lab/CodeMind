
```python
import math
n, m = map(int, input().split())
for i in range(int(m - (n % m))):
    print(int(n / m), end=" ")
for i in range(int(m - (n % m)), int(m)):
    print(math.ceil(n / m), end=" ")
```

## 3.

Write a python program to find the sum of the first n natural numbers.

```python
n = int(input())
print(int(n * (n + 1) / 2))
```


```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

n = int(input())
for i in range(2, n + 1):
    if is_prime(i):
        print(i, end=" ")
```

## 3.

Write a python program to find the sum of the first n natural numbers.

```python
n = int(input())
print(int(n * (n + 1) / 2))
```
/python/2019-09-11.md
# 2019-09-11

## 1.

Write a python program to print the following pattern:

```
1
2 3
4 5 6
7 8 9 10
```

```python
n = int(input())
for i in range(1, n + 1):
    for j in range(i):
        print(i + j, end=" ")
    print()
```

## 2.

Write a python program to print all prime numbers between 1 and n.

```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

n = int(input())
for i in range(1, n + 1):
    if is_prime(i):
        print(i, end=" ")
```

## 3.

Write a python program to find the sum of the first n natural numbers.

```python
n = int(input())
print(int(n * (n + 1) / 2))
```

# 2019-09-12

## 1.

Write a python program to print the following pattern:

```
1
2 3
4 5 6
7 8 9 10
```

```python
n = int(input())
for i in range(1, n + 1):
    for j in range(i):
        print(i + j, end=" ")
    print()
```

## 2.

Write a python program to print all prime numbers between 1 and n.

```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

n = int(input())
for i in range(1, n + 1):
    if is_prime(i):
        print(i, end=" ")
```

## 3.

Write a python program to find the sum of the first n natural numbers.

```python
n = int(input())
print(int(n * (n + 1) / 2))
```

# 2019-09-13

## 1.

Write a python program to print the following pattern:

```
1
2 3
4 5 6
7 8 9 10
```

```python
n = int(input())
for i in range(1, n + 1):
    for j in range(i):
        print(i + j, end=" ")
    print()
```

## 2.

Write a python program to print all prime numbers between 1 and n.

```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

n = int(input())
for i in range(1, n + 1):
    if is_prime(i):
        print(i, end=" ")
```

## 3.

Write a python program to find the sum of the first n natural numbers.

```python
n = int(input())
print(int(n * (n + 1) / 2))
```

# 2019-09-14

## 1.

Write a python program to print the following pattern:

```
1
2 3
4 5 6
7 8 9 10
```

```python
n = int(input())
for i in range(1, n + 1):
    for j in range(i):
        print(i + j, end=" ")
    print()
```

## 2.

Write a python program to print all prime numbers between 1 and n.

```python
def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

n = int(input())
for i in range(1, n + 1):
    if is_prime(i):
        print(i, end=" ")
```

## 3.

Write a python program to find the sum of the first n
