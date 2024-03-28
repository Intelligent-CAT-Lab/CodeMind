Here is the equivalent Python code based on the provided Java code:

```python
def main():
    n, k = map(int, input().split())

    if k == 1:
        ans = 0
    else:
        ans = n - k

    print(ans)

if __name__ == "__main__":
    main()
```

You can run this Python code with the input `3 2`, and it should produce the expected output `34`. However, I would like to point out that based on the given Java code logic, if `n` is `3` and `k` is `2`, then the actual expected output should be `1` (since `3 - 2 = 1`). The expected output of `34` does not seem to correspond to the provided Java code logic. If there's a mistake in the expected results, please double-check your requirements.
