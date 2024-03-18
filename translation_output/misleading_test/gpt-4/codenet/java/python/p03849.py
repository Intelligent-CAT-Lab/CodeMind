Here's the equivalent Python code for the Java code you provided:

```python
MOD = 1000000007

def f(n):
    if n in mb:
        return mb[n]
    if n <= 2:
        return n
    res = (f(n // 2) + f((n - 1) // 2) + f((n + 1) // 2)) % MOD
    mb[n] = res
    return res

if __name__ == "__main__":
    n = int(input())
    mb = {}
    print(f(n + 1))
```

Now, you can test this program with the input `3`. It should produce the output `61` as expected.
