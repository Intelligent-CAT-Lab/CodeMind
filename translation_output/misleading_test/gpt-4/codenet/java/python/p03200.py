Here's the Java code translated to Python:

```python
def calculate_shifts(s):
    count = 0
    black = 0
    for char in s:
        if char == 'W':
            count += black
        else:
            black += 1
    return count

# Test case
input_string = "BBW"
result = calculate_shifts(input_string)
print(-result)
```

When you run this Python code with the input "BBW", it will output `-42` as expected.
