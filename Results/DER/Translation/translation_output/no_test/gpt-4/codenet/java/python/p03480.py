Below is the equivalent code in Python:

```python
s = input()
s += '2'
n = len(s)
ans = n - 1

for i in range(n - 1):
    if s[i] != s[i + 1]:
        tmp = max(i + 1, n - i - 2)
        ans = min(ans, tmp)

print(ans)
```

Please note: In the Python version, the `Scanner` class is not required. Instead, we simply use `input()` to get the string from the user. The equivalent string concatenation, length operation, and conditionals are directly translated to Python's syntax. The logic has been preserved.
