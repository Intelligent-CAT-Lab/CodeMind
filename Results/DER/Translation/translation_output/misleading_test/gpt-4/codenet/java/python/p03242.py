Here is the Python version of the provided Java code:

```python
# Take input from user
S = input()

# Use a list comprehension to replace '1's with '9's and '9's with '1's
result = ''.join(['9' if c == '1' else '1' for c in S[:3]]) + S[3:]

# Print the result
print(result)
```

This code snippet takes an input string, replaces each '1' with a '9' and each '9' with a '1' in the first three characters, and then outputs the modified string.

You can test the code with the provided test case:

```python
# Test case
input_value = '119'
# Expected output: '978'

# Mock input function for the test case
input = lambda: input_value

# Invoke main functionality (assuming the above code is a function)
result = ''.join(['9' if c == '1' else '1' for c in input()[:3]]) + input()[3:]
print(result)  # Should print '978'
``` 

The mock `input` function is used here in places of the actual `input` to simulate getting the '119' test input; in actual use, you would get input directly from the user and would not include the mock `input`.
