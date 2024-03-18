Here is the equivalent Python code:

```python
def solve(s):
    n = len(s)

    from_index = 0
    to_index = n - 1
    for i in range(n):
        if s[i] == 'A':
            from_index = i
            break
    for i in range(n - 1, -1, -1):
        if s[i] == 'Z':
            to_index = i
            break

    print(to_index - from_index + 1)


# Test case:
input_string = "QWERTYASDFZXCV"
solve(input_string)  # Expected output: 19
```

Explanation of the changes:
- In Python, instead of using a `Scanner` class to read input and a `Printer` class to write output, we directly read using built-in functions like `input()` and write using `print()`. In this case, the input is provided directly within the code as per your test case.
- The for-loops in Java are converted to Python's range-based for-loops.
- There is no need to convert the string to a character array in Python, as strings are inherently iterable.
- Python uses zero-based indexing, just like Java, so no adjustment is needed for the indices.
- Instead of having a main method and classes, we simply define a function `solve` and call it with the test input.
