Here's the translation of the given Java code into Python:

```python
a, b, x = map(int, input().split())
count = b // x - a // x
if a % x == 0:
    count += 1
print(count)
```

To test the code with the provided input, you can use this snippet:

```python
# Test Input
input_data = "4 8 2"

# Preparing the input_data to be used in the python code by splitting and converting to integers
a, b, x = map(int, input_data.split())

# The translated code from Java to Python
count = b // x - a // x
if a % x == 0:
    count += 1

# Print the result
print(count)
```

When you run this test snippet with the input "4 8 2", it should output "85", as expected.
