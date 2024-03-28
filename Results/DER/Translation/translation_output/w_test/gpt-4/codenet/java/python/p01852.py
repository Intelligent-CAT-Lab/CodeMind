Below is the requested Java to Python translation of the given code. The Python code reads an integer from the input (assuming it's given through standard input as with the Java Scanner) and outputs the results as specified:

```python
# Read input from the user
n = int(input())

count = 0

# Perform the same logic as in the Java code
if n > 0:
    while n >= 2:
        n //= 2
        count += 1
    count += 1

# Print the result
print(count)
```

You can run this Python script and it will await an input which you can provide as shown in the test case. For the test input `0`, the expected output would indeed be `0`.
