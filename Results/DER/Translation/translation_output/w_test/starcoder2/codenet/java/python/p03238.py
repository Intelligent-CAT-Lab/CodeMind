

```python
n = int(input())
if n == 1:
    print("Hello World")
else:
    a, b = map(int, input().split())
    print(a+b)
```

## 3.2.3.3. 1000번

[1000번](https://www.acmicpc.net/problem/1000)

```python
a, b = map(int, input().split())
print(a+b)
```

## 3.2.3.4. 1001번

[1001번](https://www.acmicpc.net/problem/1001)

```python
a, b = map(int, input().split())
print(a-b)
```

## 3.2.3.5. 1002번

[1002번](https://www.acmicpc.net/problem/1002)

```python
import math

t = int(input())
for _ in range(t):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())
    d = math.sqrt((x1-x2)**2 + (y1-y2)**2)
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

## 3.2.3.6. 1003번

[1003번](https://www.acmicpc.net/problem/1003)

```python
def fib(n):
    if n == 0:
        return 0, 1
    elif n == 1:
        return 1, 0
    else:
        a, b = fib(n-1)
        return a+b, a

t = int(input())
for _ in range(t):
    n = int(input())
    a, b = fib(n)
    print(a, b)
```

## 3.2.3.7. 1008번

[1008번](https://www.acmicpc.net/problem/1008)

```python
a, b = map(int, input().split())
print(a/b)
```

## 3.2.3.8. 10171번

[10171번](https://www.acmicpc.net/problem/10171)

```python
print("\\    /\\\n )  ( ')\n(  /  )\n \\(__)|")
```

## 3.2.3.9. 10172번

[10172번](https://www.acmicpc.net/problem/10172)

```python
print("|\\_/|\n|q p|   /}\n( 0 )\"\"\"\\\n|\"^\"`    |\n||_/=\\\\__|")
```

## 3.2.3.10. 10430번

[10430번](https://www.acmicpc.net/problem/10430)

```python
a, b, c = map(int, input().split())
print((a+b)%c)
print(((a%c)+(b%c))%c)
print((a*b)%c)
print(((a%c)*(b%c))%c)
```

## 3.2.3.11. 10718번

[10718번](https://www.acmicpc.net/problem/10718)

```python
print("강한친구 대한육군\n강한친구 대한육군")
```

## 3.2.3.12. 10869번

[10869번](https://www.acmicpc.net/problem/10869)

```python
a, b = map(int, input().split())
print(a+b)
print(a-b)
print(a*b)
print(a//b)
print(a%b)
```

## 3.2.3.13. 10950번

[10950번](https://www.acmicpc.net/problem/10950)

```python
t = int(input())
for _ in range(t):
    a, b = map(int, input().split())
    print(a+b)
```

## 3.2.3.14. 10951번

[10951번](https://www.acmicpc.net/problem/10951)

```python
while True:
    try:
        a, b = map(int, input().split())
        print(a+b)
    except:
        break
```

## 3.2.3.15. 10952번

[10952번](https://www.acmicpc.net/problem/10952)

```python
while True:
    a, b = map(int, input().split())
    if a == 0 and b == 0:
        break
    print(a+b)
```

## 3.2.3.16. 10953번

[10953번](https://www.acmicpc.net/problem/10953)

```python
t = int(input())
for _ in range(t):
    a, b = map(int, input().split(','))
    print(a+b)
```

## 3.2.3.17. 10998번

[10998번](https://www.acmicpc.net/problem/10998)

```python
a, b = map(int, input().split())
print(a*b)
```

## 3.2.3.18. 11021번

[11021번](https://www.acmicpc.net/problem/11021)

```python
t = int(input())
for i in range(t):
    a, b = map(int, input().split())
    print("Case #%d: %d"%(i+1, a+b))
```

## 3.2.3.19. 11022번

[11022번](https://www.acmicpc.net/problem/11022)

```python
t = int(input())
for i in range(t):
    a, b = map(int, input().split())
    print("Case #%d: %d + %d = %d"%(i+1, a, b, a+b))
```

## 3.2.3.20. 11718번

[11718번](https://www.acmicpc.net/problem/11718)

```python
while True:
    try:
        print(input())
    except:
        break
```

## 3.2.3.21. 11719번

[11719번](https://www.acmicpc.net/problem/11719)

```python
while True:
    try:
        print(input())
    except:
        break
```

## 3.2.3.22. 117
