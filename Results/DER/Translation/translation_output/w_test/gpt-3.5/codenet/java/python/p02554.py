```python
mod = 1000000007

def modpow(a, n):
    res = 1
    while n > 0:
        if n & 1 == 1:
            res = (res * a) % mod
        a = (a * a) % mod
        n >>= 1
    return res

def solve():
    n = int(input())
    total = modpow(10, n)
    partial = 2 * modpow(9, n)
    both = modpow(8, n)
    ans = (total - partial + both) % mod
    ans = (ans + mod) % mod
    print(ans)

# Testing the solution with the sample test case
if __name__ == "__main__":
    solve()
```

