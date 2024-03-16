Here's the Python equivalent of the provided Java code:

```python
h, w, x, y = map(int, input().split())
if (h * w) % 2 == 1 and (x + y) % 2 == 1:
    print("No")
else:
    print("Yes")
```

This Python script expects the input formatted exactly as described in the test input (`3 5 1 4`), with all input numbers being space-separated on a single line. The conditional logic and the output remain the same as in the Java code.
