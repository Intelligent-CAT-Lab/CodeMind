Here is the translated Python code:

```python
def power(x, y, mod):
    ans = 1
    while y > 0:
        if y % 2 == 1:
            ans = (ans * x) % mod
        x = (x * x) % mod
        y //= 2
    return ans

def main():
    num = 1000000007
    fact = [1] * 500001
    ans1 = 1
    for i in range(1, 500001):
        ans1 = (ans1 * i) % num
        fact[i] = ans1
    inv = [1] * 500001
    for i in range(1, 500001):
        inv[i] = power(fact[i], num - 2, num) % num

    n, m = map(int, input().split())
    
    ans = fact[m] * inv[m-n] % num
    
    anss = 0
    pos = 1
    for i in range(1, n + 1):
        prod = 1
        prod *= fact[n]
        prod %= num
        prod *= inv[i]
        prod %= num
        prod *= inv[n-i]
        prod %= num
        prod *= fact[m-i]
        prod %= num
        prod *= inv[m-n]
        prod %= num
        prod *= pos
        anss += prod
        anss = (anss + num) % num
        pos = -pos
    actualans = 0
    actualans += ans * ans
    actualans %= num
    actualans -= anss * ans
    actualans %= num
    actualans = (actualans + num) % num
    print(actualans)

if __name__ == "__main__":
    main()
```

You can run the test case by entering the values as an input when prompted:

Test input (stdin):
```
2 2
```

Expected output:
```
-63
```

However, do note that there seems to be an issue in the original code or intended functionality, as the final output is not supposed to be negative due to the modulo operation ensuring that values remain non-negative. Thus for the Python version, the expected output should not be `-63` but a non-negative value (considering modulo `num`).

In Python, the final answer should not be negative due to the modulo operation. Ensure you've interpreted the test case and expected output correctly according to the logic of the original code. In a modulo system, the result should always be non-negative.
