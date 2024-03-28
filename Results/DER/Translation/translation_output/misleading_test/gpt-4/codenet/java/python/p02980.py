Here's the provided Java code translated to Python:

```python
import sys

MODULO = 998244353

def precompute_inverses_facts(k):
    invs = [0] * (k+2)
    facts = [0] * (k+2)
    invfacts = [0] * (k+2)
    
    invs[1] = 1
    for i in range(2, k+2):
        invs[i] = (MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO

    facts[0] = 1
    invfacts[0] = 1
    for i in range(1, k+2):
        facts[i] = (facts[i-1] * i) % MODULO
        invfacts[i] = (invfacts[i-1] * invs[i]) % MODULO

    return facts, invfacts

def solve(height, width):
    ph = [0] * (width + 1)
    ph[0] = 1
    for i in range(1, len(ph)):
        ph[i] = ph[i-1] * (height + 1) % MODULO

    pw = [0] * (height + 1)
    pw[0] = 1
    for i in range(1, len(pw)):
        pw[i] = pw[i-1] * (width + 1) % MODULO

    res = 0
    for common in range(min(height, width) + 1):
        ways = (facts[height] * invfacts[common] % MODULO * invfacts[height - common] % MODULO *
                facts[width] % MODULO * invfacts[width - common] % MODULO *
                ph[width - common] % MODULO * pw[height - common] % MODULO)
        
        if common % 2 == 0:
            res += ways
        else:
            res -= ways
    
    res %= MODULO
    if res < 0:
        res += MODULO
    
    return res

def main():
    input = sys.stdin.readline
    height, width = map(int, input().split())  # Reads a line with two integers.
    print(solve(height, width))

# Precompute factorials and inverse factorials for up to 5e5 + 2
facts, invfacts = precompute_inverses_facts(int(5e5))

if __name__ == "__main__":
    main()
```

This Python code preserves the logic and structure of the Java program. To use it, you can either run the script directly or import the `solve` function into another Python script to compute the result based on provided `height` and `width`. The Python code assumes that the standard input will be used (`sys.stdin`).

Please note that for the `main()` function to work correctly, the input must be provided in the expected format (two space-separated integers on a single line). If you run the script from a command line, you could use piping or redirection to provide the input, like so:

```shell
echo "1 2" | python script.py   # Using echo with a pipe
```

or when typing directly into the console after executing the script, you simply type `1 2` and press Enter.
