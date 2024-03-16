Sure, here is the equivalent code in Python:

```python
# Read the input from the user.
line = input()
# Split the input based on the space and convert the elements to integers.
a, b = map(int, line.split())

# Check the condition and print the result accordingly.
if a > 2 * b:
    print(a - 2 * b)
else:
    print(0)
```

To run this Python code with the test case you provided:

```python
# Sample test case
test_input = "12 4"

# Mimicking the user input with the test input.
line = test_input
# Split the input based on the space and convert the elements to integers.
a, b = map(int, line.split())

# Check the condition and print the result accordingly.
if a > 2 * b:
    print(a - 2 * b)
else:
    print(0)

# Expected Output: 4
```

Running this code with the input "12 4" would yield the expected output "4".
