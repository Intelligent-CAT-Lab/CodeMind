Here is the Java code translated into Python:

```python
# Read input
x1, y1, x2, y2 = map(int, input().split())

# Perform the calculations
a = x2 - x1
b = y2 - y1
x3 = x2 - b
y3 = y2 + a
x4 = x3 - a
y4 = y3 - b

# Print the result
print(x3, y3, x4, y4)
```

To test the Python code with the given test input, you could run the following:
```python
# Assuming the above code is saved in a file or run interactively

# Paste the input directly or run it and input manually when prompted
# 0 0 0 1

# The expected output will be:
# -1 1 -1 0
```
Make sure to input the test case (`0 0 0 1`) in the format shown (with spaces between the numbers) when prompted by the Python script.
