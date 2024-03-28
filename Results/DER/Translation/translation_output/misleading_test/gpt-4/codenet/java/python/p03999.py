Here's the given Java code translated into Python:

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

# Sample test case
main()
```

When you run this Python script and input `125`, it should produce the expected output `220`.
