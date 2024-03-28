

```python
r, d, x = map(int, input().split())
for i in range(10):
    x = r * x - d
    print(x)
```

## 2. 127-B

https://atcoder.jp/contests/abc127/tasks/abc127_b

```python
r, d, x = map(int, input().split())
for i in range(10):
    x = r * x - d
    print(x)
```

## 3. 128-A

https://atcoder.jp/contests/abc128/tasks/abc128_a

```python
a, p = map(int, input().split())
print((a * 3 + p) // 2)
```

## 4. 128-B

https://atcoder.jp/contests/abc128/tasks/abc128_b

```python
n = int(input())
sp = [input().split() for _ in range(n)]
sp.sort(key=lambda x: (x[0], -int(x[1])))
for s, p in sp:
    print(sp.index((s, p)) + 1)
```

## 5. 129-A

https://atcoder.jp/contests/abc129/tasks/abc129_a

```python
p, q, r = map(int, input().split())
print(min(p + q, q + r, r + p))
```

## 6. 129-B

https://atcoder.jp/contests/abc129/tasks/abc129_b

```python
n = int(input())
w = list(map(int, input().split()))
ans = 10 ** 9
for i in range(1, n):
    ans = min(ans, abs(sum(w[:i]) - sum(w[i:])))
print(ans)
```

## 7. 130-A

https://atcoder.jp/contests/abc130/tasks/abc130_a

```python
x, a = map(int, input().split())
print(0 if x < a else 10)
```

## 8. 130-B

https://atcoder.jp/contests/abc130/tasks/abc130_b

```python
n, x = map(int, input().split())
l = list(map(int, input().split()))
d = 0
ans = 1
for i in range(n):
    d += l[i]
    if d <= x:
        ans += 1
print(ans)
```

## 9. 131-A

https://atcoder.jp/contests/abc131/tasks/abc131_a

```python
s = input()
print('Bad' if s[0] == s[1] or s[1] == s[2] or s[2] == s[3] else 'Good')
```

## 10. 131-B

https://atcoder.jp/contests/abc131/tasks/abc131_b

```python
n, l = map(int, input().split())
ans = 0
for i in range(1, n + 1):
    ans += l + i - 1
print(ans - min(ans, abs(ans - 100)))
```

## 11. 132-A

https://atcoder.jp/contests/abc132/tasks/abc132_a

```python
s = input()
print('Yes' if len(set(s)) == 2 else 'No')
```

## 12. 132-B

https://atcoder.jp/contests/abc132/tasks/abc132_b

```python
n = int(input())
p = list(map(int, input().split()))
ans = 0
for i in range(1, n - 1):
    if p[i - 1] < p[i] < p[i + 1] or p[i - 1] > p[i] > p[i + 1]:
        ans += 1
print(ans)
```

## 13. 133-A

https://atcoder.jp/contests/abc133/tasks/abc133_a

```python
n, a, b = map(int, input().split())
print(min(n * a, b))
```

## 14. 133-B

https://atcoder.jp/contests/abc133/tasks/abc133_b

```python
import math

n, d = map(int, input().split())
x = [list(map(int, input().split())) for _ in range(n)]
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        dist = 0
        for k in range(d):
            dist += (x[i][k] - x[j][k]) ** 2
        if math.sqrt(dist).is_integer():
            ans += 1
print(ans)
```

## 15. 134-A

https://atcoder.jp/contests/abc134/tasks/abc134_a

```python
r = int(input())
print(3 * r ** 2)
```

## 16. 134-B

https://atcoder.jp/contests/abc134/tasks/abc134_b

```python
n, d = map(int, input().split())
print((n + 2 * d) // (2 * d + 1))
```

## 17. 135-A

https://atcoder.jp/contests/abc135/tasks/abc135_a

```python
a, b = map(int, input().split())
print((a + b) // 2 if (a + b) % 2 == 0 else 'IMPOSSIBLE')
```

## 18. 135-B

https://atcoder.jp/contests/abc135/tasks/abc135_b

```python
n = int(input())
p = list(map(int, input().split()))
ans = 0
for i in range(n):
    if p[i] != i + 1:
        ans += 1
print('YES' if ans <= 2 else 'NO')
```

## 19. 136-A

https://atcoder.jp/contests/abc136/tasks/abc136_a

```python
a, b, c = map(int, input().split())
print(max(0, c - (a - b)))
```

## 20. 136-B

https://atcoder.jp/contests/abc136/tasks/abc136_b

```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    if len(str(i)) % 2 == 1:
        ans += 1
print(ans)
```

## 21. 137-A

https://atcoder.jp/contests/abc137/tasks/abc137_a

```python
a, b = map(int, input
