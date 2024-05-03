Here is the Python equivalent of the Java code you provided:

```python
def main():
    n = int(input())
    k = int(input())
    ans = min(n % k, k - (n % k))
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads two integers from the user, calculates the minimum of the remainder of `n` divided by `k` and `k` minus the remainder of `n` divided by `k`, and then prints the result.
