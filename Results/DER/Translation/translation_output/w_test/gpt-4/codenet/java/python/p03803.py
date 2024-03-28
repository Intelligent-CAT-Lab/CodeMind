Here is the translated Python code:

```python
# Get input from user
a, b = map(int, input().split())

# Check conditions and print results
if a == 1 and b != 1:
    print("Alice")
elif b == 1 and a != 1:
    print("Bob")
elif a > b and a != 1 and b != 1:
    print("Alice")
elif a < b and a != 1 and b != 1:
    print("Bob")
elif a == b:
    print("Draw")
```

When you run this Python code and supply "8 6" as the input, the expected output will be "Alice", matching the Java version's behavior.
