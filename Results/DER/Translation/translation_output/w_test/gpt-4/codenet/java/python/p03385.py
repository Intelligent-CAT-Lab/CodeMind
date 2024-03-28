Here is the Python equivalent of the given Java code:

```python
s = input()
abc = [False] * 3
for i in range(3):
    if s[i] == 'a':
        abc[0] = True
    if s[i] == 'b':
        abc[1] = True
    if s[i] == 'c':
        abc[2] = True

is_ok = all(abc)
print("Yes" if is_ok else "No")
```

The above Python code assumes input length is exactly 3 characters, following the given Java code pattern. If the input string could be of different lengths, additional checks for string length should be added to match the original Java code's functionality.
