

```python
N, K = map(int, input().split())
print(N-K+1)
```

## 3.2.2. 1000번

[1000번: A+B](https://www.acmicpc.net/problem/1000)

```python
A, B = map(int, input().split())
print(A+B)
```

## 3.2.3. 1001번

[1001번: A-B](https://www.acmicpc.net/problem/1001)

```python
A, B = map(int, input().split())
print(A-B)
```

## 3.2.4. 10998번

[10998번: A×B](https://www.acmicpc.net/problem/10998)

```python
A, B = map(int, input().split())
print(A*B)
```

## 3.2.5. 1008번

[1008번: A/B](https://www.acmicpc.net/problem/1008)

```python
A, B = map(int, input().split())
print(A/B)
```

## 3.2.6. 10869번

[10869번: 사칙연산](https://www.acmicpc.net/problem/10869)

```python
A, B = map(int, input().split())
print(A+B)
print(A-B)
print(A*B)
print(A//B)
print(A%B)
```

## 3.2.7. 10430번

[10430번: 나머지](https://www.acmicpc.net/problem/10430)

```python
A, B, C = map(int, input().split())
print((A+B)%C)
print(((A%C)+(B%C))%C)
print((A*B)%C)
print(((A%C)*(B%C))%C)
```

## 3.2.8. 2588번

[2588번: 곱셈](https://www.acmicpc.net/problem/2588)

```python
A = int(input())
B = int(input())
print(A*(B%10))
print(A*((B//10)%10))
print(A*(B//100))
print(A*B)
```


## 3.3.2. 10871번

[10871번: X보다 작은 수](https://www.acmicpc.net/problem/10871)

```python
N, X = map(int, input().split())
A = list(map(int, input().split()))
for a in A:
    if a < X:
        print(a, end=' ')
```

## 3.3.3. 2742번

[2742번: 기찍 N](https://www.acmicpc.net/problem/2742)

```python
N = int(input())
for i in range(N, 0, -1):
    print(i)
```

## 3.3.4. 2741번

[2741번: N 찍기](https://www.acmicpc.net/problem/2741)

```python
N = int(input())
for i in range(1, N+1):
    print(i)
```

## 3.3.5. 11021번

[11021번: A+B - 7](https://www.acmicpc.net/problem/11021)

```python
T = int(input())
for i in range(1, T+1):
    A, B = map(int, input().split())
    print('Case #%d: %d' % (i, A+B))
```

## 3.3.6. 11022번

[11022번: A+B - 8](https://www.acmicpc.net/problem/11022)

```python
T = int(input())
for i in range(1, T+1):
    A, B = map(int, input().split())
    print('Case #%d: %d + %d = %d' % (i, A, B, A+B))
```

## 3.3.7. 2438번

[2438번: 별 찍기 - 1](https://www.acmicpc.net/problem/2438)

```python
N = int(input())
for i in range(1, N+1):
    print('*'*i)
```

## 3.3.8. 2439번

[2439번: 별 찍기 - 2](https://www.acmicpc.net/problem/2439)

```python
N = int(input())
for i in range(1, N+1):
    print(' '*(N-i) + '*'*i)
```

## 3.3.9. 10870번

[10870번: 피보나치 수 5](https://www.acmicpc.net/problem/10870)

```python
def fibo(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibo(n-1) + fibo(n-2)

N = int(input())
print(fibo(N))
```

## 3.3.10. 10872번

[10872번: 팩토리얼](https://www.acmicpc.net/problem/10872)

```python
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

N = int(input())
print(factorial(N))
```

## 3.3.11. 11729번

[11729번: 하노이 탑 이동 순서](https://www.acmicpc.net/problem/11729)

```python
def hanoi(n, start, end):
    if n == 1:
        print(start, end)
    else:
        other = 6 - start - end
        hanoi(n-1, start, other)
        print(start, end)
        hanoi(n-1, other, end)

N = int(input())
print(2**N-1)
hanoi(N, 1, 3)
```
# 3.3. 반복문

## 3.3.1. 2739번

[2739번: 구구단](https://www.acmicpc.net/problem/2739)

```python
N = int(input())
for i in range(1, 10):
    print('%d * %d = %d' % (N, i, N*i))
```

## 3.3.2. 1924번

[1924번: 2007년](https://www.acmicpc.net/problem/1924)

```python
month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 3
