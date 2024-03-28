Below is the Python translation of the provided Java code including the test case provided:

```python
def main(a, b):
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

# Test input
a, b = 8, 6

# Expected output: "Alice"
main(a, b)
```

To run this code with different inputs, you can call the `main()` function with different values of `a` and `b`.
