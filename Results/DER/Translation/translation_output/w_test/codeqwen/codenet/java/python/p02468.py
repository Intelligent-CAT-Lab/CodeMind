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

This Python code does the same thing as the Java code: it reads two integers from the standard input, computes the power of the first integer to the second, and prints the result. The `power` function is a Python equivalent of the `power` function in the Java code. It uses a loop to multiply the base `a` by itself `e` times, and then takes the modulus `modP` at each step to keep the numbers manageable. The `main` function reads the input, calls the `power` function, and prints the result.
