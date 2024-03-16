Here is the translated Python code that performs the same operation as the given Java code:

```python
# Read input from the user
s = input()

# Print the first three characters of the input string
print(s[:3])
```

To test this Python code, you can run the following:

```python
# Test input
test_input = "takahashi"

# Expected output
expected_output = "tak"

# Running the test
output = test_input[:3]
assert output == expected_output, f"Expected {expected_output}, but got {output}"
print(output)
```

This will give you the expected output "tak" when you pass in the test input "takahashi".
