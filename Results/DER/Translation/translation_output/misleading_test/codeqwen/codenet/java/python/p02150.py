Here is the Python equivalent of the Java code:

```python
MOD = 1000000007

def main():
    a, b, x = map(int, input().split())
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

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the number of times the difference between `a` and `b` fits into `x`, and then calculates the total sum. The total sum is then printed to the console.
