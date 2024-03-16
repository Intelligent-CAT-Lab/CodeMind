Below is the Java code translated into Python:

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

    ans = fact[m] * inv[m - n] % num

    anss = 0
    pos = 1
    for i in range(1, n + 1):
        prod = 1
        prod *= fact[n]
        prod %= num
        prod *= inv[i]
        prod %= num
        prod *= inv[n - i]
        prod %= num
        prod *= fact[m - i]
        prod %= num
        prod *= inv[m - n]
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

if __name__ == '__main__':
    main()
```

You can use this Python code for the test input of `2 2`, and it will give the expected output of `2`. To run the code, just copy the Python code into a Python interpreter or file and provide the input as specified.
