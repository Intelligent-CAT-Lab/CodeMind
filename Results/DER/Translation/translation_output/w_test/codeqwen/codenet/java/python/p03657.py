Here is the Python equivalent of the Java code:

```python
a, b = map(int, input().split())
if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
    print("Possible")
else:
    print("Impossible")
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks if any of them is divisible by 3 or if their sum is divisible by 3, and prints "Possible" or "Impossible" accordingly.
