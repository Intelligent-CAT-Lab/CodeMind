Here's the translated code in Python:

```python
n, k = map(int, input().split())
ans = min(n % k, k - (n % k))
print(ans)
```

This Python script should provide the exact same functionality as the Java code provided. When you provide the test input `7 4`, it will output `1` as expected.
