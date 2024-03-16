Here is the equivalent Python code for the provided Java example:

```python
import math

# Read input
n1 = int(input())
# Calculate n using the formula
n = int((math.sqrt(1 + (8 * n1)) - 1) / 2)
# Calculate the answer
ans = n1 - (((n + 1) * n) // 2)
# Print the result
print(ans if ans != 0 else n)

# Sample test case
sample_input = 99992
print(sample_input)
```

Running this Python code with the input `99992` should produce the output `311`, just as in the original Java code. Make sure to provide the input before running the code if you use the sample code directly.
