Here's the equivalent Python code for the provided Java code:

```python
# Read the input from user
a, b, c = map(int, input().split())

# Initialize result
result = "No"

# Check the condition
if a <= c <= b:
    result = "Yes"

# Print the result
print(result)
```

Python handles input differently and uses dynamic typing, so there is no need for data type declarations. The condition checking for the range is also simplified due to Python's capability to chain comparisons.
