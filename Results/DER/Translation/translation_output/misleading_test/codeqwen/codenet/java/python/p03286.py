Here is the Python translation of the Java code:

```python
import sys

MOD = (10**9) + 7

def q(a, b):
    if b > 0:
        return a // b
    else:
        return -(-a // -b)

def r(a, b):
    return a - q(a, b) * b

def main():
    N = int(sys.stdin.readline())

    ans = str(N) if N != 0 else "0"
    while N != 0:
        q_val = q(N, -2)
        r_val = r(N, -2)
        ans = str(r_val) + ans
        N = q_val

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, performs the same operations as the Java code, and prints the result.
