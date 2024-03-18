```python
import sys

def solver():
    n, x = map(int, input().split())
    sum = 0
    if x == n - x:
        sum = 3 * x
        print(sum)
        return
    else:
        if x > n - x:
            sum += x + n - x
            sum += calc(x, n - x, False)
        elif x < n - x:
            sum += x + n - x
            sum += calc(x, n - x, False)
        print(sum)

def calc(x, y, first):
    sum = 0
    if x % y == 0:
        if first:
            sum += y
        sum += (x // y * 2 - 1) * y
        return sum
    else:
        if first:
            sum += y
        sum += (x // y * 2) * y
        sum += calc(y, x % y, False)
        return sum

if __name__ == "__main__":
    solver()
```
This Python code is the equivalent translation of the provided Java code to solve the given problem statement. It reads the input values, calculates the sum based on the conditions, and prints the result accordingly.
