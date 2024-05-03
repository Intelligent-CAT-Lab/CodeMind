Here is the Python equivalent of the Java code:

```python
def main():
    n, k = map(int, input().split())
    ans = min(n % k, k - (n % k))
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the minimum of the remainder of `n` divided by `k` and `k` minus the remainder of `n` divided by `k`, and then prints the result.
