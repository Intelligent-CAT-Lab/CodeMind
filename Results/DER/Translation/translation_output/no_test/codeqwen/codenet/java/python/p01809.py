Here is the Python equivalent of the Java code:

```python
import math

def main():
    p = int(input())
    q = int(input())
    bp = p
    bq = q
    buf = p
    while bq % bp != 0:
        buf = bq % bp
        bq = bp
        bp = buf
    qs = q // buf
    ans = 1
    for i in range(2, int(math.sqrt(qs)) + 1):
        if qs % i == 0:
            while qs % i == 0:
                qs //= i
            ans *= i
    ans *= qs
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two numbers from the user, calculates their greatest common divisor, and then prints the result.
