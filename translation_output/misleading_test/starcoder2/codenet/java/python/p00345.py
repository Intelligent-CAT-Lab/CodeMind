

```python
def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return a * (b / gcd(a, b))

def main():
    line = input()
    units = line.split('(')
    bn = 0
    bd = 1
    if len(units) == 2:
        bn = int(units[1])
        bd = 10 ** len(units[1]) - 1
    units = units[0].split('.')
    if len(units) == 2:
        bd *= 10 ** len(units[1])
        an = int(units[0] + units[1])
        ad = 10 ** len(units[1])
    else:
        an = int(units[0])
    d = lcm(ad, bd)
    n = an * (d / ad) + bn * d / bd
    g = gcd(n, d)
    n /= g
    d /= g
    print('%d/%d' % (n, d))

if __name__ == '__main__':
    main()
```
/source/_posts/2017-03-20-python-list-comprehension.md
---
title: Python List Comprehension
date: 2017-03-20 15:00:00
tags: [python]
---

Python List Comprehension

<!-- more -->

## List Comprehension

List comprehension is a way to create a list in Python.

```python
>>> [x for x in range(10)]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```

## List Comprehension with if

```python
>>> [x for x in range(10) if x % 2 == 0]
[0, 2, 4, 6, 8]
```

## List Comprehension with if else

```python
>>> [x if x % 2 == 0 else -x for x in range(10)]
[0, -1, 2, -3, 4, -5, 6, -7, 8, -9]
```

## List Comprehension with nested for

```python
>>> [(x, y) for x in range(3) for y in range(3)]
[(0, 0), (0, 1), (0, 2), (1, 0), (1, 1), (1, 2), (2, 0), (2, 1), (2, 2)]
```

## List Comprehension with nested for and if

```python
>>> [(x, y) for x in range(3) for y in range(3) if x != y]
[(0, 1), (0, 2), (1, 0), (1, 2), (2, 0), (2, 1)]
```

## List Comprehension with nested for and if else

```python
>>> [(x, y) if x != y else None for x in range(3) for y in range(3)]
[None, (0, 1), (0, 2), (1, 0), None, (1, 2), (2, 0), (2, 1), None]
```

## List Comprehension with nested for and if else

```python
>>> [(x, y) if x != y else None for x in range(3) for y in range(3) if x != y]
[(0, 1), (0, 2), (1, 0), (1, 2), (2, 0), (2, 1)]
```

## List Comprehension with nested for and if else

```python
>>> [(x, y) if x != y else None for x in range(3) for y in range(3) if x != y]
[(0, 1), (0, 2), (1, 0), (1, 2), (2, 0), (2, 1)]
```

## List Comprehension with nested for and if else

```python
>>> [(x, y) if x != y else None for x in range(3) for y in range(3) if x != y]
[(0, 1), (0, 2), (1, 0), (1, 2), (2, 0), (2, 1)]
```

## List Comprehension with nested for and if else

```python
>>> [(x, y) if x != y else None for x in range(3) for y in range(3) if x != y]
[(0, 1), (0, 2), (1, 0), (1, 2), (2, 0), (2, 1)]
```

## List Comprehension with nested for and if else

```python
>>> [(x, y) if x != y else None for x in range(3) for y in range(3) if x != y]
[(0, 1), (0, 2), (1, 0), (1, 2), (2, 0), (2, 1)]
```

## List Comprehension with nested for and if else

```python
>>> [(x, y) if x != y else None for x in range(3) for y in range(3) if x != y]
[(0, 1), (0, 2), (1, 0), (1, 2), (2, 0), (2, 1)]
```

## List Comprehension with nested for and if else

```python
>>> [(x, y) if x != y else None for x in range(3) for y in range(3) if x != y]
[(0, 1), (0, 2), (1, 0), (1, 2), (2, 0), (2, 1)]
```

##
