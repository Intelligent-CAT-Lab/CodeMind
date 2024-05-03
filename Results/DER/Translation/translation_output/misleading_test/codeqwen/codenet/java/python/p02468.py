Here is the Python equivalent of the Java code:

```python
import sys

def power(a, e, modP):
    ret = 1
    for _ in range(e):
        ret = (ret * a) % modP
        a = (a * a) % modP
    return ret

def main():
    m, n = map(int, sys.stdin.readline().split())
    print(power(m, n, 1000000007))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads two integers from the standard input, computes the power of the first integer to the second, and prints the result modulo 1000000007. The `power` function is a simple loop that multiplies the current result by the current integer and updates the integer to its square, until the exponent is reduced to zero. The `main` function reads the input, calls the `power` function, and prints the result.
