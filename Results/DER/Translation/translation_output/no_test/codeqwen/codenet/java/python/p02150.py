Here is the Python equivalent of the Java code:

```python
MOD = 1000000007

def main():
    a = int(input())
    b = int(input())
    x = int(input())
    s = a - b
    count = max(x - a, 0) // s
    total = (count % MOD) * (a % MOD) % MOD
    x -= count * s
    while x >= a:
        total += a
        x += - a + b
    total += x
    total %= MOD
    print(total)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the count of times the value `a` can be subtracted from `x` until `x` becomes less than `a`, and then calculates the total sum of `a` added to `x` until `x` becomes less than `a`. The result is then printed out.
