```python
# Read inputs from the user.
a, b = map(int, input().split())

# Check the condition and print the result.
if b >= a:
    print(a)
else:
    print(a - 1)
```

For the test input in your example, you would use it as follows:

```python
# Test input from the example
test_input = "5 5"
input_values = test_input.split()

# Use map to apply the integer conversion to both values
a, b = map(int, input_values)

# Check the condition and print the result.
if b >= a:
    print(a)
else:
    print(a - 1)
```

When running the code, it should give you the expected output of 5.

