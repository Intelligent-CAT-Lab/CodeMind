Here's the equivalent Python code for the given Java code:

```python
def atcoder_ABC172_D():
    n = int(input())
    ans = 0
    for i in range(1, n + 1):
        ans += i * (n // i) * ((n // i) + 1) // 2
    print(ans)

atcoder_ABC172_D()
```

This Python function reads an integer from standard input, calculates the sum similar to the Java code provided, and then prints the result.
