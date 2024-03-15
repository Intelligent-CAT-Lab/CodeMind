
```
x1, y1, x2, y2 = map(int, input().split())
x3 = x2 + (y1 - y2)
y3 = y2 - (x1 - x2)
x4 = x1 - (y2 - y1)
y4 = y1 + (x2 - x1)
print(x3, y3, x4, y4)
```

## 109

### A

#### Problem

https://atcoder.jp/contests/abc109/tasks/abc109_a

#### Solution

```
a, b = map(int, input().split())
if a * b % 2 == 0:
    print('No')
else:
    print('Yes')
```

### B

#### Problem

https://atcoder.jp/contests/abc109/tasks/abc109_b

#### Solution

```
n = int(input())
w = [input() for _ in range(n)]

for i in range(n - 1):
    if w[i][-1] != w[i + 1][0]:
        print('No')
        exit()

for i in range(n):
    for j in range(i + 1, n):
        if w[i] == w[j]:
            print('No')
            exit()

print('Yes')
```

### C

#### Problem

https://atcoder.jp/contests/abc109/tasks/abc109_c

#### Solution

```
n, x = map(int, input().split())
x_list = list(map(int, input().split()))

x_list.append(x)
x_list.sort()

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

ans = x_list[1] - x_list[0]
for i in range(2, n + 1):
    ans = gcd(ans, x_list[i] - x_list[i - 1])

print(ans)
```

### D

#### Problem

https://atcoder.jp/contests/abc109/tasks/abc109_d

#### Solution

```
h, w = map(int, input().split())
a = [list(map(int, input().split())) for _ in range(h)]

ans = []
for i in range(h):
    for j in range(w):
        if a[i][j] % 2 == 1:
            if j + 1 < w:
                a[i][j] -= 1
                a[i][j + 1] += 1
                ans.append((i + 1, j + 1, i + 1, j + 2))
            elif i + 1 < h:
                a[i][j] -= 1
                a[i + 1][j] += 1
                ans.append((i + 1, j + 1, i + 2, j + 1))

print(len(ans))
for i in range(len(ans)):
    print(ans[i][0], ans[i][1], ans[i][2], ans[i][3])
```

## 110

### A

#### Problem

https://atcoder.jp/contests/abc110/tasks/abc110_a

#### Solution

```
a, b, c = map(int, input().split())
print(max(a + b + c, a + b * 10 + c, a * 10 + b + c, a * 10 + b * 10 + c))
```

### B

#### Problem

https://atcoder.jp/contests/abc110/tasks/abc110_b

#### Solution

```
n, m, x, y = map(int, input().split())
x_list = list(map(int, input().split()))
y_list = list(map(int, input().split()))

x_list.sort()
y_list.sort()

if x_list[-1] < y_list[0] and x < y:
    print('No War')
else:
    print('War')
```

### C

#### Problem

https://atcoder.jp/contests/abc110/tasks/abc110_c

#### Solution

```
s = input()
t = input()

s_dict = {}
t_dict = {}

for i in range(len(s)):
    if s[i] not in s_dict:
        s_dict[s[i]] = t[i]
    else:
        if s_dict[s[i]] != t[i]:
            print('No')
            exit()

for i in range(len(t)):
    if t[i] not in t_dict:
        t_dict[t[i]] = s[i]
    else:
        if t_dict[t[i]] != s[i]:
            print('No')
            exit()

print('Yes')
```

### D

#### Problem

https://atcoder.jp/contests/abc110/tasks/abc110_d

#### Solution

```
n, m = map(int, input().split())

def prime_factorize(n):
    a = []
    while n % 2 == 0:
        a.append(2)
        n //= 2
    f = 3
    while f * f <= n:
        if n % f == 0:
            a.append(f)
            n //= f
        else:
            f += 2
    if n != 1:
        a.append(n)
    return a

def cmb(n, r, mod):
    if (r < 0 or r > n):
        return 0
    r = min(r, n - r)
    return g1[n] * g2[r] * g2[n - r] % mod

mod = 10 ** 9 + 7 #出力の制限
N = 2 * 10 ** 5
g1 = [1, 1] # 元テーブル
g2 = [1, 1] #逆元テーブル
inverse = [0, 1] #逆元テーブル計算用テーブル

for i in range( 2, N + 1 ):
    g1.append( ( g1[-1] * i ) % mod )
    inverse.append( ( -inverse[mod % i] * (mod//i) ) % mod )
    g2.append( (g2[-1] * inverse[-1]) % mod )

prime_list = prime_factorize(m)

ans = 1
for i in set(prime_list):
    ans *= cmb(prime_list.count(i) + n - 1, n - 1, mod)
    ans %= mod

print(ans)
```

## 111

### A

#### Problem

https://atcoder.jp/contests/abc111/tasks/abc111_a

#### Solution

```
n = input()
print(int(n.replace('1', 'x').replace('9', '1').replace('x', '9')))
```

### B

#### Problem

https://atcoder.jp/contests/abc111/tasks/abc111_b

#### Solution

```
n = int(input())

for i in range(n, 1000):
    if i % 111 == 0:
        print(i)
        exit()
```

### C

#### Problem

https://at
