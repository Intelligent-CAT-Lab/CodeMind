Here's a Python equivalent using the built-in `int` type, which can handle arbitrarily large integers just as `BigInteger` can in Java:

```python
# Capture the input as two strings, split by whitespace
input_str = input().split()

# Convert the input strings to integers
A = int(input_str[0])
B = int(input_str[1])

# Perform the multiplication
result = A * B

# Print the result
print(result)
```

You can run a test case by passing the sample input "5 8" to this Python code. For example, if you are running this code in an interactive Python session or a script, just type the input when prompted, and it should output `40`.
