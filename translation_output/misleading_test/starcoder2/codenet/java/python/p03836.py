

```python
import sys

def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy

    b = []
    # sx < tx, sy < ty ãªã®ã§ ç¹å®ã®å½¢å¼ã§è¡ãã
    # first
    b.append( renzoku('R', dx) )
    b.append( renzoku('U', dy) )

    # second
    b.append( renzoku('L', dx) )
    b.append( renzoku('D', dy) )

    # third
    b.append( renzoku('D', 1) )
    b.append( renzoku('R', dx + 1) )
    b.append( renzoku('U', dy + 1) )
    b.append( renzoku('L', 1) )

    # forth
    b.append( renzoku('U', 1) )
    b.append( renzoku('L', dx + 1) )
    b.append( renzoku('D', dy + 1) )
    b.append( renzoku('R', 1) )

    return ''.join(b)

def renzoku(c, n):
    return c * n

if __name__ == '__main__':
    sx, sy, tx, ty = map(int, sys.stdin.readline().split())
    print(solve(sx, sy, tx, ty))
```

## 03837 - 
https://onlinejudge.u-aizu.ac.jp/problems/03837

```python
import sys

def solve(n, m, a, b):
    if n == 1:
        return 0
    if m == 1:
        return 0
    if a == 1 and b == 1:
        return n * m - 1
    if a == 1 and b == m:
        return n * m - 1
    if a == n and b == 1:
        return n * m - 1
    if a == n and b == m:
        return n * m - 1
    if a == 1:
        return n * m - 2
    if a == n:
        return n * m - 2
    if b == 1:
        return n * m - 2
    if b == m:
        return n * m - 2
    return n * m - 3

if __name__ == '__main__':
    n, m, a, b = map(int, sys.stdin.readline().split())
    print(solve(n, m, a, b))
```

## 03838 - 
https://onlinejudge.u-aizu.ac.jp/problems/03838

```python
import sys

def solve(n, m, a, b):
    if n == 1:
        return 0
    if m == 1:
        return 0
    if a == 1 and b == 1:
        return n * m - 1
    if a == 1 and b == m:
        return n * m - 1
    if a == n and b == 1:
        return n * m - 1
    if a == n and b == m:
        return n * m - 1
    if a == 1:
        return n * m - 2
    if a == n:
        return n * m - 2
    if b == 1:
        return n * m - 2
    if b == m:
        return n * m - 2
    return n * m - 3

if __name__ == '__main__':
    n, m, a, b = map(int, sys.stdin.readline().split())
    print(solve(n, m, a, b))
```

## 03839 - 
https://onlinejudge.u-aizu.ac.jp/problems/03839

```python
import sys

def solve(n, m, a, b):
    if n == 1:
        return 0
    if m == 1:
        return 0
    if a == 1 and b == 1:
        return n * m - 1
    if a == 1 and b == m:
        return n * m - 1
    if a == n and b == 1:
        return n * m - 1
    if a == n and b == m:
        return n * m - 1
    if a == 1:
        return n * m - 2
    if a == n:
        return n * m - 2
    if b == 1:
        return n * m - 2
    if b == m:
        return n * m - 2
    return n * m - 3

if __name__ == '__main__':
    n, m, a, b = map(int, sys.stdin.readline().split())
    print(solve(n, m, a, b))
```

## 03840 - 
https://onlinejudge.u-aizu.ac.jp/problems/03840

```python
import sys

def solve(n, m, a, b):
    if n == 1:
        return 0
    if m == 1:
        return 0
    if a == 1 and b == 1:
        return n * m - 1
    if a == 1 and b == m:
        return n * m - 1
    if a == n and b == 1:
        return n * m - 1
    if a == n and b == m:
        return n * m - 1
    if a == 1:
        return n * m - 2
    if a == n:
        return n * m - 2
    if b == 1:
        return n * m - 2
    if b == m:
        return n * m - 2
    return n * m - 3

if __name__ == '__main__':
    n, m, a, b = map(int, sys.stdin.readline().split())
    print(solve(n, m, a, b))
```

## 03841 - 
https://onlinejudge.u-aizu.ac.jp/problems/03841

```python
import sys

def solve(n, m, a, b):
    if n == 1:
        return 0
    if m == 1:
        return 0
    if a == 1 and b == 1:
        return n * m - 1
    if a == 1 and b ==
