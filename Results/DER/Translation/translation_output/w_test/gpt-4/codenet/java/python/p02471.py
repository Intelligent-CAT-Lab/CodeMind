Here's the equivalent Python code for the provided Java code. In Python, you don't need to specify the type of each variable, and the input/output operations are a bit different. There's also no need for a separate `gcd` method since it's not used in the main logic. Take note that division and modulus operations are more straightforward in Python as well:

```python
# Read input from user
a, b = map(int, input().split())

# Initialize variables
r1, x1, y1 = a, 1, 0
r2, x2, y2 = b, 0, 1

# Extended Euclidean Algorithm
while r2 != 0:
    q, r3 = divmod(r1, r2)
    x3 = x1 - q * x2
    y3 = y1 - q * y2
    r1, x1, y1 = r2, x2, y2
    r2, x2, y2 = r3, x3, y3

# Print the results
print(f"{x1} {y1}")
```

You can now use this Python code to process the given test case. If you input "4 12" (without quotes) to this Python code, you should get "1 0" as the output, which matches the expected output given in your test case.
