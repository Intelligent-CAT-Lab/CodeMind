Here is the translated Python code for the given Java snippet:

```python
try:
    x, y = map(int, input().split())
    print("Brown" if abs(x - y) <= 1 else "Alice")
except Exception as e:
    print(e)
```

You can run this Python code using the given test input "2 1" to expect the output "Brown".
