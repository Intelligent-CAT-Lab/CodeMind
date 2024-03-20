

```
L, R, d = map(int, input().split())
Ans = 0
for i in range(L, R+1):
    if i % d == 0:
        Ans += 1
print(Ans)

```

## 2. 1000번

```
a, b = map(int, input().split())
print(a+b)
```

## 3. 1001번

```
a, b = map(int, input().split())
print(a-b)
```

## 4. 1002번

```
x1, y1, r1, x2, y2, r2 = map(int, input().split())

d = ((x1-x2)**2 + (y1-y2)**2)**0.5

if d == 0:
    if r1 == r2:
        print(-1)
    else:
        print(0)
else:
    if d == r1+r2 or d == abs(r1-r2):
        print(1)
    elif d < r1+r2 and d > abs(r1-r2):
        print(2)
    else:
        print(0)
```

## 5. 1003번

```
T = int(input())

for _ in range(T):
    n = int(input())
    if n == 0:
        print(1, 0)
    elif n == 1:
        print(0, 1)
    else:
        a, b = 1, 1
        for i in range(2, n+1):
            a, b = b, a+b
        print(a, b)
```

## 6. 1004번

```
T = int(input())

for _ in range(T):
    x1, y1, x2, y2 = map(int, input().split())
    n = int(input())
    cnt = 0
    for _ in range(n):
        cx, cy, r = map(int, input().split())
        d1 = ((x1-cx)**2 + (y1-cy)**2)**0.5
        d2 = ((x2-cx)**2 + (y2-cy)**2)**0.5
        if d1 < r and d2 > r:
            cnt += 1
        elif d1 > r and d2 < r:
            cnt += 1
    print(cnt)
```

## 7. 1005번

```
T = int(input())

for _ in range(T):
    n, k = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    c = [0] * n
    for i in range(k):
        c[b[i]-1] += a[i]
    print(max(c))
```

## 8. 1006번

```
T = int(input())

for _ in range(T):
    n = int(input())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    c = [0] * n
    for i in range(n):
        c[i] = a[i] + b[i]
    print(max(c))
```

## 9. 1007번

```
T = int(input())

for _ in range(T):
    n = int(input())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    c = [0] * n
    for i in range(n):
        c[i] = a[i] + b[i]
    print(min(c))
```

## 10. 1008번

```
a, b = map(int, input().split())
print(a/b)
```

## 11. 1009번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a*b)
```

## 12. 1010번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a-b)
```

## 13. 1011번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a//b)
```

## 14. 1012번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a%b)
```

## 15. 1013번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a**b)
```

## 16. 1014번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a//b, a%b)
```

## 17. 1015번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a**0.5, b**0.5)
```

## 18. 1016번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a**2, b**2)
```

## 19. 1017번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a**3, b**3)
```

## 20. 1018번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a**0.5, b**0.5)
```

## 21. 1019번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a**2, b**2)
```

## 22. 1020번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a**3, b**3)
```

## 23. 1021번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a**0.5, b**0.5)
```

## 24. 1022번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a**2, b**2)
```

## 25. 1023번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a**3, b**3)
```

## 26. 1024번

```
T = int(input())

for _ in range(T):
    a, b = map(int, input().split())
    print(a**0.5
