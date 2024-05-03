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

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the difference between the first and second integers, and then determines how many times the difference can be subtracted from the third integer. It then calculates the total by multiplying the first integer by the number of times the difference can be subtracted and taking the modulus with the constant MOD. If the third integer is less than the first integer, it subtracts the difference from the third integer until it is greater than or equal to the first integer. It then adds the third integer to the total and takes the modulus with the constant MOD. Finally, it prints the total.
