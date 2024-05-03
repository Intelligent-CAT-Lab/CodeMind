Here is the Python equivalent of the Java code:

```python
def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

def main():
    W = int(input())
    H = int(input())
    WH = gcd(W, H)
    C = int(input())

    a = (W/WH)*(H/WH)
    
    print(int(a*C))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the greatest common divisor of the first two integers, and then multiplies the third integer by the quotient of the division of the first two integers by their greatest common divisor. The result is then printed to the console.
