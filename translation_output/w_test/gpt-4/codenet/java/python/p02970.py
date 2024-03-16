Here is the Python translation of the provided Java code:

```python
import math

# Read the input
N, D = map(int, input().split())

# Calculate the result using math.ceil to mimic the CEILING rounding mode.
ans = math.ceil(N / (D * 2 + 1))

# Print the result
print(ans)
```

To run a test case on this Python code:

```python
# Example Test case
N = 6
D = 2
ans = math.ceil(N / (D * 2 + 1))
print(ans)  # Expected output: 2
```

You can call this test case in Python with the following input:
```python
# Sample Test
print(math.ceil(6 / (2 * 2 + 1)))  # Expected output: 2
```

Please note that the conversion uses simple integer division along with the `math.ceil` function in Python, which is a common approach for achieving the "ceiling" effect similar to `RoundingMode.CEILING` in Java's `BigDecimal`.
