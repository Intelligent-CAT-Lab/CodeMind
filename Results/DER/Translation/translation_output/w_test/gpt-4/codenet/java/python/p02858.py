Here is the Python translation of the provided Java code. The Python code performs equivalent functionality to the Java version but uses idiomatic Python constructs.

```python
import sys
import math

MOD = 10**9 + 7


def gcd(a, b):
    while b:
        a, b = b, a % b
    return a


def pow_mod(x, n, mod):
    result = 1
    x %= mod
    while n > 0:
        if n % 2:
            result = result * x % mod
        x = x * x % mod
        n //= 2
    return result


def main():
    h, w, t = map(int, sys.stdin.readline().split())

    hh = h // gcd(h, t)
    ww = w // gcd(w, t)

    way = 1
    way = (way + pow_mod(2, hh, MOD) - 2) % MOD
    way = (way + pow_mod(2, ww, MOD) - 2) % MOD
    way = (way + pow_mod(2, gcd(hh, ww), MOD)) % MOD

    p = (h // hh) * (w // ww) % (MOD - 1)
    way = pow_mod(way, p, MOD)
    
    print(way)


if __name__ == "__main__":
    main()
```

To test this code with the input "2 2 1" as per your requirement, you can simply provide those numbers as a standard input to the script when calling it from the command line or any other way that supplies standard input.

For example, you can create a text file with the content "2 2 1" and then execute the script with the content of that file as input, or you can directly echo the input into the Python script from a terminal.

Here's one way to test it from a command-line interface:
```bash
echo "2 2 1" | python script.py
``` 

Replace `script.py` with the actual file name of the Python script. Expect the output to be "9".
