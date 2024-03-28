Here is the Java code translated to Python, including the handling of input and output as provided in the example:

```python
a, b, c = map(int, input().split())  # Read the input as three integers
min_val = min(a, b)  # Find the minimum between 'a' and 'b'
max_val = max(a, b)  # Find the maximum between 'a' and 'b'
print(min(min_val, c), max(max_val, c))  # Output the minimum value among 'min_val' and 'c', and maximum value among 'max_val' and 'c'
```

Please note that this code assumes that the input is provided in the same format as your test case, on one line, with each number separated by a space.
