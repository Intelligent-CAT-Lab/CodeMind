Below is the translated Python code from the provided Java code. I've translated the logic as closely as possible to the original Java code, including the modular exponentiation logic (`power` function):

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
    inv = [1] * 500001
    
    ans1 = 1
    for i in range(1, 500001):
        ans1 = (ans1 * i) % num
        fact[i] = ans1
    
    for i in range(1, 500001):
        inv[i] = power(fact[i], num - 2, num) % num

    n, m = map(int, input().split())

    ans = (fact[m] * inv[m - n]) % num

    anss = 0
    pos = 1
    for i in range(1, n + 1):
        prod = fact[n] * inv[i] % num * inv[n - i] % num * fact[m - i] % num * inv[m - n] % num * pos
        anss = (anss + prod) % num
        pos = -pos

    actualans = (ans * ans - anss * ans) % num
    actualans = (actualans + num) % num
    print(actualans)


if __name__ == "__main__":
    main()
```

Note that in the Python code, I used `input().split()` to read from `stdin`, which is the common way to get inputs in Python. The `print` function is used to print `actualans`. I replaced the `BufferedReader` and `PrintWriter` with Python's own I/O functions, which are more straightforward and idiomatic in Python. Also, I've removed the placeholder comments and any code that was commented out in the Java version.
