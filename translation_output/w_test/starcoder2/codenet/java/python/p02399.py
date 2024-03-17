

```python
a, b = map(int, input().split())
d = a//b
r = a%b
f = a/b
print(d, r, f)
```

## 2.4.2. 1001번

```python
a = int(input())
b = int(input())
print(a-b)
```

## 2.4.3. 1008번

```python
a, b = map(int, input().split())
print(a/b)
```

## 2.4.4. 10869번

```python
a, b = map(int, input().split())
print(a+b)
print(a-b)
print(a*b)
print(a//b)
print(a%b)
```

## 2.4.5. 10430번

```python
a, b, c = map(int, input().split())
print((a+b)%c)
print(((a%c)+(b%c))%c)
print((a*b)%c)
print(((a%c)*(b%c))%c)
```

## 2.4.6. 2588번

```python
a = int(input())
b = int(input())
print(a*(b%10))
print(a*((b//10)%10))
print(a*(b//100))
print(a*b)
```

## 2.4.7. 1009번

```python
for _ in range(int(input())):
    a, b = map(int, input().split())
    print(pow(a, b, 10))
```

## 2.4.8. 2739번

```python
a = int(input())
for i in range(1, 10):
    print(f'{a} * {i} = {a*i}')
```

## 2.4.9. 1924번

```python
m, d = map(int, input().split())
days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
week = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']

day = 0
for i in range(m-1):
    day += days[i]
day += d

print(week[day%7])
```

## 2.4.10. 8393번

```python
n = int(input())
print(n*(n+1)//2)
```

## 2.4.11. 15552번

```python
import sys

for _ in range(int(sys.stdin.readline())):
    a, b = map(int, sys.stdin.readline().split())
    print(a+b)
```

## 2.4.12. 2741번

```python
n = int(input())
for i in range(1, n+1):
    print(i)
```

## 2.4.13. 2742번

```python
n = int(input())
for i in range(n, 0, -1):
    print(i)
```

## 2.4.14. 11021번

```python
import sys

for i in range(int(sys.stdin.readline())):
    a, b = map(int, sys.stdin.readline().split())
    print(f'Case #{i+1}: {a+b}')
```

## 2.4.15. 11022번

```python
import sys

for i in range(int(sys.stdin.readline())):
    a, b = map(int, sys.stdin.readline().split())
    print(f'Case #{i+1}: {a} + {b} = {a+b}')
```

## 2.4.16. 2438번

```python
n = int(input())
for i in range(1, n+1):
    print('*'*i)
```

## 2.4.17. 2439번

```python
n = int(input())
for i in range(1, n+1):
    print(' '*(n-i) + '*'*i)
```

## 2.4.18. 10871번

```python
n, x = map(int, input().split())
a = list(map(int, input().split()))
for i in a:
    if i < x:
        print(i, end=' ')
```

## 2.4.19. 10950번

```python
import sys

for _ in range(int(sys.stdin.readline())):
    a, b = map(int, sys.stdin.readline().split())
    print(a+b)
```

## 2.4.20. 10951번

```python
import sys

for line in sys.stdin:
    a, b = map(int, line.split())
    print(a+b)
```

## 2.4.21. 10952번

```python
import sys

for line in sys.stdin:
    a, b = map(int, line.split())
    if a == 0 and b == 0:
        break
    print(a+b)
```

## 2.4.22. 10953번

```python
import sys

for line in sys.stdin:
    a, b = map(int, line.split(','))
    print(a+b)
```

## 2.4.23. 11021번

```python
import sys

for i in range(int(sys.stdin.readline())):
    a, b = map(int, sys.stdin.readline().split())
    print(f'Case #{i+1}: {a+b}')
```

## 2.4.24. 11022번

```python
import sys

for i in range(int(sys.stdin.readline())):
    a, b = map(int, sys.stdin.readline().split())
    print(f'Case #{i+1}: {a} + {b} = {a+b}')
```

## 2.4.25. 11718번

```python
import sys

for line in sys.stdin:
    print(line, end='')
```

## 2.4.26. 11719번

```python
import sys

for line in sys.stdin:
    print(line, end='')
```

## 2.4.27. 11720번

```python
n = int(input())
a = input()
print(sum(map(int, a)))
```

## 2.4.28. 11721번

```python
a = input()
for i in range(0, len(a), 10):
    print(a[i:i+10])
```

## 2.4.29. 10809번

```python
a = input()
for i in range(97, 123):
    print(a.find(chr(i)), end=' ')
```

## 2.4.30. 2675번

```python
for _
