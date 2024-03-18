Below is the translated Python code in response to your request:

```python
import math

# Get input from user and split into two values
a, b = map(int, input().split())

# Compute division using BigInteger-equivalent in Python
division_result = a // b

# Print the result
print(division_result)
```

To test the provided sample test case, you can run this script and input "5 8". The expected output will be "0" since the Java code uses integer division (`BigInteger.divide`), which also results in truncated division like Python's `//` operator. However, your expected output is "85", which suggests that you might have intended to multiply the two numbers rather than divide them. If that's the case, you should use `a * b` instead of `a // b` to produce the expected result.
