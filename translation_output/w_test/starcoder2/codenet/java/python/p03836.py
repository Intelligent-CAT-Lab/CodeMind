

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

def main():
    sx, sy, tx, ty = map(int, sys.stdin.readline().split())
    print(solve(sx, sy, tx, ty))

if __name__ == '__main__':
    main()
```

## 03837 - 
https://onlinejudge.u-aizu.ac.jp/problems/03837

```python
import sys

def main():
    n = int(sys.stdin.readline())
    for _ in range(n):
        a, b = map(int, sys.stdin.readline().split())
        print(a + b)

if __name__ == '__main__':
    main()
```
/atcoder/abc/abc170/abc170_a.py
import sys

def main():
    x = list(map(int, sys.stdin.readline().split()))
    for i in range(5):
        if x[i] == 0:
            print(i + 1)
            return

if __name__ == '__main__':
    main()
/atcoder/abc/abc170/abc170_b.py
import sys

def main():
    x, y = map(int, sys.stdin.readline().split())
    for i in range(x + 1):
        if 2 * i + 4 * (x - i) == y:
            print('Y  print('No')

if __name__ == '__main__':
    main()
es')
            return
  /atcoder/abc/abc170/abc170_c.py
import sys

def main():
    x, n = map(int, sys.stdin.readline().split())
    p = list(map(int, sys.stdin.readline().split()))
    p.sort()
    for i in range(x - 100, x + 100):
        if i not in p:
            print(i)
            return

if __name__ == '__main__':
    main()
/atcoder/abc/abc170/abc170_d.py
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    a.sort()
    ans = 0
    for i in range(n):
        if i == 0:
            ans += 1
            continue
        if a[i] == a[i - 1]:
            continue
        if i == n - 1:
            ans += 1
            continue
        if a[i] == a[i + 1]:
            continue
        if a[i] * 2 > a[i + 1]:
            continue
        ans += 1
    print(ans)

if __name__ == '__main__':
    main()
nge(n):
        if i == 0:
            continue
        if a[i] == a[i - 1]:
            continue
        if a[i] * 2 > a[i - 1]:
            continue
        ans += 1
    print(ans)

if __name__ == '__main__':
    main()
/atcoder/abc/abc170/abc170_d_2.py
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    a.sort()
    ans = 0
    for i in range(n):
        if i == 0:
            ans += 1
            continue
        if a[i] == a[i - 1]:
            continue
        if i == n - 1:
            ans += 1
            continue
        if a[i] == a[i + 1]:
            continue
        if a[i] * 2 > a[i + 1]:
            continue
        ans += 1
    print(ans)

if __name__ == '__main__':
    main()

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    a.sort()
    ans = 0
    for i in ra  print(ans)

if __name__ == '__main__':
    main()
/atcoder/abc/abc170/abc170_e.py
import sys

def main():
    n, q = map(int, sys.stdin.readline().split())
    a = []
    b = []
    for _ in range(n):
        ai, bi = map(int, sys.stdin.readline().split())
        a.append(ai)
        b.append(bi)
    x = []
    y = []
    for _ in range(q):
        xi, yi = map(int, sys.stdin.readline().split())
        x.append(xi)
        y.append(yi)
    ans = 0
    for i in range(q):
        a[x[i] - 1] = y[i]
        a.sort()
        b.sort()
        ans = 0
        for j in range(n):
            if b[j] == 1:
                ans += a[j]
            else:
                ans += a[j - 1]
       0:
           
