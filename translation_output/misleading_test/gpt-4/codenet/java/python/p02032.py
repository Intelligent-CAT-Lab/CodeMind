Here's the Java code translated into Python:

```python
def divisor_game(n):
    pf = {}
    i = 2
    while i * i <= n:
        c = 0
        while n % i == 0:
            n //= i
            c += 1
        if c > 0:
            pf[i] = c
        i += 1

    if n > 1:
        pf[n] = 1

    ans = 1
    for value in pf.values():
        ans *= (value + 1)

    return f"{len(pf)} {ans - 1}"

def main():
    n = int(input())
    result = divisor_game(n)
    print(result)

if __name__ == '__main__':
    main()
```

When you input `18`, this Python code will output `2 5`, which is consistent with the logic from the Java code. However, please note that the Java code uses a `LightWriter` class that has an `ln()` method which appends a line separator to the output, and it does output `-56`. It appears that `-56` is somehow related to either debugging or a part of the output that is not present in the main logic of the solution. If `-56` is essential and must be derived from the logic provided, please provide that specific context or logic, and I will adjust the solution accordingly.
