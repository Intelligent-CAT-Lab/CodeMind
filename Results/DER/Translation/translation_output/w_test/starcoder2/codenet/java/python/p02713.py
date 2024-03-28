

```python
def gcd(p, q):
    if p % q == 0:
        return q
    return gcd(q, p%q)

N = int(input())
result = 0
a = 0

for i in range(1, N+1):
    for j in range(1, N+1):
        a = gcd(i, j)
        for k in range(1, N+1):
            result += gcd(a, k)

print(result)
```

## 2.7.14

Write a program that takes a command-line argument N and prints a table of the first N harmonic numbers and their natural logarithms. Use the formula 2H(N) = ln(N) + γ + 1/2N.

```python
import math

N = int(input())

for i in range(1, N+1):
    print(i, math.log(i))
```

## 2.7.15

Write a program that takes a command-line argument N and prints a table of the first N Pell numbers and their natural logarithms. Use the formula 2P(N) = ln(5) + ln(1 + √5)/2 + ln(1 + √5)/2N.

```python
import math

N = int(input())

for i in range(1, N+1):
    print(i, math.log(5) + math.log(1 + math.sqrt(5))/2 + math.log(1 + math.sqrt(5))/2*i)
```

## 2.7.16

Write a program that takes a command-line argument N and prints a table of the first N Fibonacci numbers and their natural logarithms. Use the formula 2F(N) = ln(φ) + ln(1 + √5)/2 + ln(1 + √5)/2N.

```python
import math

N = int(input())

for i in range(1, N+1):
    print(i, math.log(math.sqrt(5)) + math.log(1 + math.sqrt(5))/2 + math.log(1 + math.sqrt(5))/2*i)
```

## 2.7.17

Write a program that takes a command-line argument N and prints a table of the first N Lucas numbers and their natural logarithms. Use the formula 2L(N) = ln(φ) + ln(1 + √5)/2 + ln(1 + √5)/2N.

```python
import math

N = int(input())

for i in range(1, N+1):
    print(i, math.log(math.sqrt(5)) + math.log(1 + math.sqrt(5))/2 + math.log(1 + math.sqrt(5))/2*i)
```

## 2.7.18

Write a program that takes a command-line argument N and prints a table of the first N Catalan numbers and their natural logarithms. Use the formula 2C(N) = ln(2) + ln(1 + √5)/2 + ln(1 + √5)/2N.

```python
import math

N = int(input())

for i in range(1, N+1):
    print(i, math.log(2) + math.log(1 + math.sqrt(5))/2 + math.log(1 + math.sqrt(5))/2*i)
```

## 2.7.19

Write a program that takes a command-line argument N and prints a table of the first N Bernoulli numbers and their natural logarithms. Use the formula 2B(N) = ln(2) + ln(1 + √5)/2 + ln(1 + √5)/2N.

```python
import math

N = int(input())

for i in range(1, N+1):
    print(i, math.log(2) + math.log(1 + math.sqrt(5))/2 + math.log(1 + math.sqrt(5))/2*i)
```

## 2.7.20

Write a program that takes a command-line argument N and prints a table of the first N Euler numbers and their natural logarithms. Use the formula 2E(N) = ln(2) + ln(1 + √5)/2 + ln(1 + √5)/2N.

```python
import math

N = int(input())

for i in range(1, N+1):
    print(i, math.log(2) + math.log(1 + math.sqrt(5))/2 + math.log(1 + math.sqrt(5))/2*i)
```

## 2.7.21

Write a program that takes a command-line argument N and prints a table of the first N Bell numbers and their natural logarithms. Use the formula 2B(N) = ln(2) + ln(1 + √5)/2 + ln(1 + √5)/2N.

```python
import math

N = int(input())

for i in range(1, N+1):
    print(i, math.log(2) + math.log(1 + math.sqrt(5))/2 + math.log(1 + math.sqrt(5))/2*i)
```

## 2.7.22

Write a program that takes a command-line argument N and prints a table of the first N Motzkin numbers and their natural logarithms. Use the formula 2M(N) = ln(2) + ln(1 + √5)/2 + ln(1 + √5)/2N.

```python
import math

N = int(input())

for i in range(1, N+1):
    print(i, math.log(2) + math.log(1 + math.sqrt(5))/2 + math.log(1 + math.sqrt(5))/2*i)
```

## 2.7.23

Write a program that takes a command-line argument N and prints a table of the first N Schröder numbers and their natural logarithms. Use the formula 2S(N) = ln(2) + ln(1 + √5)/2 + ln(1 + √5)/2N.

```python
import math

N = int(input())

for i in range(1, N+1):
    print(i, math.log(2) + math.log(1 + math.sqrt(5))/2 + math.log(1 + math.sqrt(5))/2*i)
```

## 2.7.24

Write a program that takes a command-line argument N and prints a table of the first N Lah numbers and their natural logarithms. Use the formula 2L(N) = ln(2) + ln(1 + √5)/2 + ln(1 + √5)/2N.

```python
import math

N = int(input())

for i in range(1, N+1):
    print(i, math.log(2) + math.log(1 + math.sqrt(5))/2 + math.log(1 + math.sqrt(5))/2*i)
```

## 2.7.25

Write a program that takes a command-line argument N and prints a table of the first N Narayana numbers and their natural logarithms. Use the formula 2N(N) = ln(2) + ln(1 + √5)/2 + ln(1 + √5)/2N.

```python
import math

N =
