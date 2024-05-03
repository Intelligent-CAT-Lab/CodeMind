Here is the Python equivalent of the Java code:

```python
import math

def solver(n):
    sqrt = math.isqrt(n)
    for i in range(sqrt, 0, -1):
        if n % i == 0:
            x = i
            y = n // i
            break
    ans = 0
    if x != 0 and y != 0:
        ans = (x - 1) + (y - 1)
    else:
        ans = n - 1
    return ans

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

if __name__ == "__main__":
    n = int(input())
    print(solver(n))
```

This Python code does the same thing as the Java code. It first calculates the square root of the input number, then iterates from that number down to 1 to find the largest divisor of the input number. If it finds a divisor, it calculates the quotient and stores them in variables `x` and `y`. It then calculates the answer based on these values and prints it. If no divisor is found, it calculates the answer as the input number minus 1 and prints it.
