Here's the equivalent Python code:

```python
def count_aizu_subsequences(string):
    a = 'A'
    sum = 0
    for char in string:
        if char <= a:
            sum += 1
        a = char
    return sum

# Test input
test_input = "AIZU"

# Expected output: 2
print(count_aizu_subsequences(test_input))
```

You can use this Python function by providing it with a string input, and it will return the count of subsequences as demonstrated in the provided Java code.
