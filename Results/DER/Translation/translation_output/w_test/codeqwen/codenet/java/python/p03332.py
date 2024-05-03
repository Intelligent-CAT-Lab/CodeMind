Here is the Python version of the provided Java code:

```python
import sys

M = 998244353

def modI(a, m):
    if a <= 1:
        return 1
    return ((1 - modI(m % a, a) * m) % m + m) % m

def main():
    n, a, b, k = map(int, sys.stdin.readline().split())
    nck = [1] * (n + 1)
    for i in range(1, n + 1):
        nck[i] = nck[i - 1] * (n - i + 1) % M * modI(i, M) % M
    ans = 0
    for i in range(n + 1):
        if a * i <= k and (k - a * i) % b == 0 and (k - a * i) // b <= n:
            ans += nck[i] * nck[(k - a * i) // b] % M
    print(ans % M)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the input from the standard input, calculates the number of combinations, and prints the result. The `modI` function is used to calculate the modular multiplicative inverse of a number. The `main` function is the entry point of the program.
