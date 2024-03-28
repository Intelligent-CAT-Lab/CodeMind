```python
s = ""
for c in input():
    s += chr((ord(c) - 42) % 26 + 65)

print(s)
```
