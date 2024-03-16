Here is the translated code from Java to Python:

```python
s = input().strip()
c = sum(int(char) for char in s)

if c % 9 == 0:
    print("Yes")
else:
    print("No")

# Test input
# 123456789

# Expected output
# Yes
```

When you run this Python code with the input `123456789`, the expected output will be `Yes`, just like the Java code example.
