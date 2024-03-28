Here is the Python translation of the Java code provided:

```python
import sys

MOD = 1000000007

def pow(l, i):
    if i == 0:
        return 1
    else:
        if i % 2 == 0:
            val = pow(l, i // 2)
            return val * val % 2019
        else:
            return pow(l, i - 1) * l % 2019

def main():
    n, k = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(k, n + 2):
        f = i * (i - 1) // 2
        l = (n * 2 - i + 1) * i // 2
        add = l - f + 1
        ans = (ans + add) % MOD
    print(ans)

if __name__ == "__main__":
    main()
```

In this Python code, I've removed the `FastScanner` class since Python has built-in functions like `sys.stdin.readline()` that can be used for fast input. The helper functions like `pow` were included, even if they are not used in `main`. I assume they were intended to be part of the original code snippet. It's important to note that Python has its own built-in pow function which can handle modular exponentiation with three arguments, but I kept the custom `pow` function for a faithful translation.

To run the test case provided, you would input the values on the command line after executing the Python script, like so:

```bash
echo "3 2" | python your_script_name.py
```

This would give you the expected output of 10.
