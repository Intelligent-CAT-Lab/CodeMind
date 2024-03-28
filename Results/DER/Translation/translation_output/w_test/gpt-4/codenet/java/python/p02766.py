Here's the translated Python code for the given Java code:

```python
import sys
import math

MOD = int(1e9+7)

def ceil(a, b):
    return (a + b - 1) // b

def gcd(a, b):
    return a if b == 0 else gcd(b, a % b)

def lcm(a, b):
    return a // gcd(a, b) * b

def solve():
    N, K = map(int, input().split())
    base = 1
    cnt = 0
    while base <= N:
        cnt += 1
        base *= K
    print(cnt)

if __name__ == "__main__":
    solve()
```

This script takes two integers `N` and `K` from standard input, just like the Java code reads them from a Scanner, and prints out the number of times you must multiply `1` by `K` before the result is greater than `N`, effectively translating the given Java code into Python.

Please make sure to execute this Python script with the provided sample test case by using the command line or any other means of providing standard input to a Python script (replacing direct file reading and writing for simplicity):

```shell
echo "11 2" | python script_name.py
```

Where `script_name.py` is the filename where you saved the Python translation. The expected output will be:

```
4
```
