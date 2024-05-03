Here is the Python equivalent of the Java code:

```python
def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

def main():
    W, H, C = map(int, input().split())
    WH = gcd(W, H)
    a = (W//WH)*(H//WH)
    print(a*C)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the greatest common divisor of the first two integers, and then calculates the area of the rectangle formed by the first two integers. It then multiplies this area by the third integer and prints the result.
