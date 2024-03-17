

```python
import sys

def main():
    s = sys.stdin.readline().strip()
    l = len(s)
    if s[0] == '0' or s[-1] == '1':
        print(-1)
        return
    for i in range(l//2):
        if s[i] != s[-i-1]:
            print(-1)
            return
    print(1, 2)
    for i in range(3, l+1):
        print(i-1, i)

main()
```


```

python code:

```python
import sys

def main():
    n = int(sys.stdin.readline().strip())
    a = list(map(int, sys.stdin.readline().strip().split()))
    b = list(map(int, sys.stdin.readline().strip().split()))
    c = list(map(int, sys.stdin.readline().strip().split()))
    d = list(map(int, sys.stdin.readline().strip().split()))
    e = list(map(int, sys.stdin.readline().strip().split()))
    f = list(map(int, sys.stdin.readline().strip().split()))
    g = list(map(int, sys.stdin.readline().strip().split()))
    h = list(map(int, sys.stdin.readline().strip().split()))
    i = list(map(int, sys.stdin.readline().strip().split()))
    j = list(map(int, sys.stdin.readline().strip().split()))
    k = list(map(int, sys.stdin.readline().strip().split()))
    l = list(map(int, sys.stdin.readline().strip().split()))
    m = list(map(int, sys.stdin.readline().strip().split()))
    n = list(map(int, sys.stdin.readline().strip().split()))
    o = list(map(int, sys.stdin.readline().strip().split()))
    p = list(map(int, sys.stdin.readline().strip().split()))
    q = list(map(int, sys.stdin.readline().strip().split()))
    r = list(map(int, sys.stdin.readline().strip().split()))
    s = list(map(int, sys.stdin.readline().strip().split()))
    t = list(map(int, sys.stdin.readline().strip().split()))
    u = list(map(int, sys.stdin.readline().strip().split()))
    v = list(map(int, sys.stdin.readline().strip().split()))
    w = list(map(int, sys.stdin.readline().strip().split()))
    x = list(map(int, sys.stdin.readline().strip().split()))
    y = list(map(int, sys.stdin.readline().strip().split()))
    z = list(map(int, sys.stdin.readline().strip().split()))
    print(a[0], b[0], c[0], d[0], e[0], f[0], g[0], h[0], i[0], j[0], k[0], l[0], m[0], n[0], o[0], p[0], q[0], r[0], s[0], t[0], u[0], v[0], w[0], x[0], y[0], z[0])

main()
```

## 10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
