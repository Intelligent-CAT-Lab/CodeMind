Here is the equivalent Python code using a provided test input:

```python
# Read input values from user
a, b, c, d = map(int, input().split())

# Computing all possible products
products = [a * c, b * d, a * d, b * c]

# Find and print the maximum product value
max_product = max(products)
print(max_product)

# Sample test case
# Input: 418379342 802780784 -790013317 -445130206
# Expected Output: -186233282690604452
```

To test this Python code, you can run it and provide the same test input as given in the Java code example. The expected output will be `-186233282690604452`.
