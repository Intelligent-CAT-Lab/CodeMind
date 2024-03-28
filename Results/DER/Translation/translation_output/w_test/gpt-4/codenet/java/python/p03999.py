Below is the Python translation of the provided Java code:

```python
def helper(n):
    if n == 0:
        return 1
    return 1 << (n - 1)

def main():
    s = input()
    ans = 0
    for dx in range(len(s)):
        for start in range(len(s) - dx):
            cur = int(s[start:start + dx + 1])
            ans += cur * (helper(start) * helper(len(s) - 1 - dx - start))
    print(ans)

if __name__ == "__main__":
    main()
```

You would run the above Python script and provide it the sample input `125` in order to obtain the expected output `176`.
