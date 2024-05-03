Here is the Python equivalent of the Java code:

```python
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

solve()
```

This Python code does the same thing as the Java code. It reads four integers from the user, calculates the greatest common divisor of the first two integers, and then calculates the number of steps required to move from the first integer to the second integer, and from the second integer to the third integer, and from the third integer to the fourth integer. The total number of steps is the sum of these three numbers, minus one. The result is then printed to the console.
