Here is the translated Python code:

```python
# Read input as a list of integers from a single line
a, b, c = map(int, input().split())

# Check if the differences are equal
if a - b == b - c:
    print("YES")
else:
    print("NO")
```

To match your test case, you can run the Python code and input `2 4 6`:

```plaintext
2 4 6
```

Expected output:

```plaintext
YES
```
