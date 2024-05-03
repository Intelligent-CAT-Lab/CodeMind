Here is the Python equivalent of the Java code:

```python
import re

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return a * (b // gcd(a, b))

def main():
    line = input()
    units = re.split('[()]', line)

    an = 0
    ad = 1
    bn = 0
    bd = 1

    if len(units) == 2:
        bn = int(units[1])
        bd = 10 ** len(units[1]) - 1

    if '.' in units[0]:
        bd *= 10 ** len(units[0].split('.')[1])
        an = int(units[0].replace('.', ''))
        ad = 10 ** len(units[0].split('.')[1])

    else:
        an = int(units[0])

    d = lcm(ad, bd)
    n = an * (d // ad) + bn * d // bd
    g = gcd(n, d)
    n //= g
    d //= g

    print(f"{n}/{d}")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into units, and then calculates the least common multiple (LCM) and greatest common divisor (GCD) of the numerator and denominator. It then simplifies the fraction and prints the result.
