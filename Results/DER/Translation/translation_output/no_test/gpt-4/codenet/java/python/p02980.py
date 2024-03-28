Here is the Java code translated to Python:

```python
import sys

MODULO = 998244353

k = int(5e5)
invs = [0] * (k+2)
invs[1] = 1
for i in range(2, k + 2):
    invs[i] = MODULO - (MODULO // i) * invs[MODULO % i] % MODULO

facts = [0] * (k+2)
invfacts = [0] * (k+2)
facts[0] = 1
invfacts[0] = 1
for i in range(1, k + 2):
    facts[i] = facts[i - 1] * i % MODULO
    invfacts[i] = invfacts[i - 1] * invs[i] % MODULO

def solve(height, width):
    ph = [0] * (width + 1)
    ph[0] = 1
    for i in range(1, len(ph)):
        ph[i] = ph[i - 1] * (height + 1) % MODULO

    pw = [0] * (height + 1)
    pw[0] = 1
    for i in range(1, len(pw)):
        pw[i] = pw[i - 1] * (width + 1) % MODULO

    res = 0
    for common in range(min(height, width) + 1):
        ways = (facts[height] * invfacts[common] % MODULO * 
                invfacts[height - common] % MODULO *
                facts[width] % MODULO *
                invfacts[width - common] % MODULO *
                ph[width - common] % MODULO *
                pw[height - common] % MODULO)
        if common % 2 == 0:
            res += ways
        else:
            res -= ways

    res %= MODULO
    if res < 0:
        res += MODULO

    return res

def main():
    height, width = map(int, sys.stdin.readline().split())
    result = solve(height, width)
    print(result)

if __name__ == "__main__":
    main()
```

I have translated the Java code into a Python script, where `solve` function encapsulates the logic of the `TaskF` class and its `solve` method. I've used standard input to read the numbers, and the `print` function for output, as per Python conventions. Note that `InputReader` class from Java is replaced by reading directly from `sys.stdin`. This translation assumes the input is formatted similarly to what is expected in the Java code (i.e., space-separated integers provided through the standard input).
