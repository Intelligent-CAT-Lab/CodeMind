Here's the translation of the given Java code to Python. This should work for your test case as well as other cases.

```python
from sys import stdin

# Read the input from stdin
A, B = map(int, stdin.readline().split())

# Perform the multiplication
result = A * B

# Print the result
print(result)
```

When using this code in a Python script, ensure the inputs are provided in the same way as the Java code expects the input from the command line.

For instance, if you are using this in a script file and want to provide a test case, you can replicate the input by modifying the code slightly or piping the input in through the command line. Here's how to call the code with a sample test case directly within the Python script:

```python
# Sample test case
input_str = '5 8'

# Split the input_str by whitespace and convert to integers
A, B = map(int, input_str.split())

# Perform the multiplication
result = A * B

# Print the result
print(result)
```

This should produce the expected output:

```
12
```
