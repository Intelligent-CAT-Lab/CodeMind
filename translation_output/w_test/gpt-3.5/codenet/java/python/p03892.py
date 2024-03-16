```python
def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def solve():
    a, b = map(int, input().split())
    a = abs(int(input()) - a)
    b = abs(int(input()) - b)
    g = gcd(a, b)
    ans = a // g + b // g - 1
    print(ans * g)

solve()
```
This Python code translates the provided Java code into Python and implements the `solve` function to calculate the output based on the input values. It uses the `gcd` function to find the greatest common divisor and then calculates the final answer.
