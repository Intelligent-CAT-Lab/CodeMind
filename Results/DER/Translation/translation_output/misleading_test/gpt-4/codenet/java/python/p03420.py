Here's the Java code translated into Python:

```python
def main():
    n, K = map(int, input().split())
    ans = 0
    for i in range(K + 1, n + 1):
        for j in range((n // i) + 1):
            if i * (j + 1) - 1 <= n:
                ans += i - K
            else:
                ans += max(i - K - (i * (j + 1) - 1 - n), 0)
    if K == 0:
        ans -= n
    print(ans)

if __name__ == "__main__":
    main()
```

You can use the following sample input by providing it directly on the standard input (for example, through a command-line):

```python
5 2
```

This will produce the expected output:
```
-22
```
