

```python
a = int(input())
print(a + (a*a) + (a*a*a))
```

## 2.6.3

Write a python program to print the following pattern:

```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

```python
for i in range(1, 6):
    for j in range(1, i+1):
        print(j, end=' ')
    print()
```

## 2.6.4

Write a python program to print the following pattern:

```
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```

```python
for i in range(1, 6):
    for j in range(1, i+1):
        print(i, end=' ')
    print()
```

## 2.6.5

Write a python program to print the following pattern:

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

```python
n = 1
for i in range(1, 6):
    for j in range(1, i+1):
        print(n, end=' ')
        n += 1
    print()
```

## 2.6.6

Write a python program to print the following pattern:

```
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
```

```python
n = 1
for i in range(1, 6):
    for j in range(1, i+1):
        print(n, end=' ')
        n += 2
    print()
```

## 2.6.7

Write a python program to print the following pattern:

```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

```python
for i in range(1, 6):
    for j in range(1, i+1):
        print(j, end=' ')
    print()
for i in range(4, 0, -1):
    for j in range(1, i+1):
        print(j, end=' ')
    print()
```

## 2.6.8

Write a python program to print the following pattern:

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
11 12 13 14
7 8 9 10
4 5 6
2 3
1
```

```python
n = 1
for i in range(1, 6):
    for j in range(1, i+1):
        print(n, end=' ')
        n += 1
    print()
n -= 2
for i in range(4, 0, -1):
    for j in range(1, i+1):
        print(n, end=' ')
        n -= 1
    print()
```

## 2.6.9

Write a python program to print the following pattern:

```
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
5 10 15 20
4 8 12
3 6 9
2 4
1
```

```python
n = 1
for i in range(1, 6):
    for j in range(1, i+1):
        print(n, end=' ')
        n += 2
    print()
n -= 4
for i in range(4, 0, -1):
    for j in range(1, i+1):
        print(n, end=' ')
        n -= 2
    print()
```

## 2.6.10

Write a python program to print the following pattern:

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
11 12 13 14
7 8 9 10
4 5 6
2 3
1
```

```python
n = 1
for i in range(1, 6):
    for j in range(1, i+1):
        print(n, end=' ')
        n += 1
    print()
n -= 2
for i in range(4, 0, -1):
    for j in range(1, i+1):
        print(n, end=' ')
        n -= 1
    print()
```

## 2.6.11

Write a python program to print the following pattern:

```
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
4 8 12 16
3 6 9
2 4
1
```

```python
n = 1
for i in range(1, 6):
    for j in range(1, i+1):
        print(n, end=' ')
        n += 2
    print()
n -= 4
for i in range(4, 0, -1):
    for j in range(1, i+1):
        print(n, end=' ')
        n -= 2
    print()
```

## 2.6.12

Write a python program to print the following pattern:

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
11 12 13 14
7 8 9 10
4 5 6
2 3
1
```

```python
n = 1
for i in range(1, 6):
    for j in range(1, i+1):
        print(n, end=' ')
        n += 1
    print()
n -= 2
for i in range(4, 0, -1):
    for j in range(1, i+1):
        print(n, end=' ')
        n -= 1
    print()
```

## 2.6.13

Write a python program to print the following pattern:

```
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
4 8 12 16
3 6 9
2 4
1
```

```python
n = 1
for i in range(1, 6):
    for j in range(1, i+1):
        print(n, end=' ')
        n += 2
    print()
n -= 4
for i in range(4, 0, -1):
    for j in range(1, i+1):
        print(n, end=' ')
        n -= 2
    print()
```

## 2.6.14

Write a python program to print the following pattern:

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
11 12 13 14
7 8 9 10
4 5 6
2 3
1
```

```python
n = 1
for i in range(1, 6):
    for j in range(1, i+1):
        print(n, end=' ')
        n += 1
    print()
n -= 2
for i in range(4, 0, -1):
    for j in range(1, i+1):
        print(n, end=' ')
