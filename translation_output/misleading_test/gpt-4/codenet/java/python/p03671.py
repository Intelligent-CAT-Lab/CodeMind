Here's the Java code translated into Python:

```python
# Read input values
a, b, c = map(int, input().split())

# Sort the values
sum_values = sorted([a, b, c])

# Output the sum of the two smallest values
print(sum_values[0] + sum_values[1])
```

Here's how you would run a test case (700, 600, 780) on the Python code above:

```
# Sample Test Case Input
test_input = "700 600 780"

# Applying the test case to the code
a, b, c = map(int, test_input.split())
sum_values = sorted([a, b, c])
print(sum_values[0] + sum_values[1])
```

The expected output, as given in the original test case, would be `1222`.
