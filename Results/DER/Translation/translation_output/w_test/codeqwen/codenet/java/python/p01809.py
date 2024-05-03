Here is the Python equivalent of the Java code:

```python
import math

def main():
    p, q = map(int, input().split())
    buf = p
    bp = p
    bq = q

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

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the greatest common divisor (GCD) of the two numbers, and then divides the second number by the GCD. It then finds all the prime factors of the quotient and multiplies them together to get the final answer.
