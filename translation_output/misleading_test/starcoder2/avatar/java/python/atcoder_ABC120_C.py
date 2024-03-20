
```python
s1 = input()
ans = 0
c1 = 0
c0 = 0

for i in range(len(s1)):
    if s1[i] == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

## 2. 120B

### 2.1. Problem

https://atcoder.jp/contests/abc120/tasks/abc120_b

### 2.2. Solution

```python
a, b, k = map(int, input().split())

for i in range(100, 0, -1):
    if a % i == 0 and b % i == 0:
        k -= 1
        if k == 0:
            print(i)
            break
```

## 3. 120C

### 3.1. Problem

https://atcoder.jp/contests/abc120/tasks/abc120_c

### 3.2. Solution

```python
s1 = input()
ans = 0
c1 = 0
c0 = 0

for i in range(len(s1)):
    if s1[i] == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

## 4. 120D

### 4.1. Problem

https://atcoder.jp/contests/abc120/tasks/abc120_d

### 4.2. Solution

```python
n, m = map(int, input().split())

class UnionFind:
    def __init__(self, n):
        self.par = [i for i in range(n)]
        self.rank = [0] * n
        self.size = [1] * n

    def find(self, x):
        if self.par[x] == x:
            return x
        else:
            self.par[x] = self.find(self.par[x])
            return self.par[x]

    def unite(self, x, y):
        x = self.find(x)
        y = self.find(y)
        if x == y:
            return
        if self.rank[x] < self.rank[y]:
            self.par[x] = y
            self.size[y] += self.size[x]
        else:
            self.par[y] = x
            self.size[x] += self.size[y]
            if self.rank[x] == self.rank[y]:
                self.rank[x] += 1

    def same(self, x, y):
        return self.find(x) == self.find(y)

    def get_size(self, x):
        return self.size[self.find(x)]

uf = UnionFind(n)

ans = [0] * m
ans[m - 1] = n * (n - 1) // 2

for i in range(m - 1, 0, -1):
    a, b = map(int, input().split())
    a -= 1
    b -= 1
    if uf.same(a, b):
        ans[i - 1] = ans[i]
    else:
        ans[i - 1] = ans[i] - uf.get_size(a) * uf.get_size(b)
        uf.unite(a, b)

for i in range(m):
    print(ans[i])
```
/atcoder/abc/abc120/abc120_c.py
s1 =   c0 += 1

print(ans * 2)
input()
ans = 0
c1 = 0
c0 = 0

for i in range(len(s1)):
    if s1[i] == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
          /atcoder/abc/abc120/abc120_d.py
n, m = map(int, input().split())

class UnionFind:
    def __init__(self, n):
        self.par = [i for i in range(n)]
        self.rank = [0] * n
        self.size = [1] * n

    ans[i - 1] = ans[i]
    else:
        ans[i - 1] = ans[i] - uf.get_size(a) * uf.get_size(b)
        uf.unite(a, b)

for i in range(m):
    print(ans[i])
  def find(self, x):
        if self.par[x] == x:
            return x
        else:
            self.par[x] = self.find(self.par[x])
            return self.par[x]

    def unite(self, x, y):
        x = self.find(x)
        y = self.find(y)
        if x == y:
            return
        if self.rank[x] < self.rank[y]:
            self.par[x] = y
            self.size[y] += self.size[x]
        else:
            self.par[y] = x
            self.size[x] += self.size[y]
            if self.rank[x] == self.rank[y]:
                self.rank[x] += 1

    def same(self, x, y):
        return self.find(x) == self.find(y)

    def get_size(self, x):
        return self.size[self.find(x)]

uf = UnionFind(n)

ans = [0] * m
ans[m - 1] = n * (n - 1) // 2

for i in range(m - 1, 0, -1):
    a, b = map(int, input().split())
    a -= 1
    b -= 1
    if uf.same(a, b):
       1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
/atcoder/abc/abc120/abc120_c_java.py
s1 = input()
ans = 0
c1 = 0
c0 = 0

for i in range(len(s1)):
    if s1[i] == '1':
        if c0 > 0:
            c0 -= 1
            ans +=/atcoder/abc/abc120/abc120_b.py
a, b, k = map(int, input().split())

for i in range(100, 0, -1):
    if a % i == 0 and b % i == 0:
        k -= 1
        if k == 0:
            print(i)
            break

