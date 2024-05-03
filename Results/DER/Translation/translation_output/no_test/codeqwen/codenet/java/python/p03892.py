Here is the Python equivalent of the Java code:

```python
import sys

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def solve():
    a = int(input())
    b = int(input())
    a = abs(int(input()) - a)
    b = abs(int(input()) - b)
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)

if __name__ == "__main__":
    solve()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, calculates the greatest common divisor of the first two integers, and then calculates the answer based on the third and fourth integers. The result is then printed to the standard output.
