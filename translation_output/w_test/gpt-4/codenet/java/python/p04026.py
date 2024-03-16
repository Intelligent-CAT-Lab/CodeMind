```python
def find_close_occurrences(s):
    last = [-1] * 26
    for i, char in enumerate(s):
        ch = ord(char) - ord('a')
        if last[ch] >= 0 and i - last[ch] < 3:
            return f"{last[ch] + 1} {i + 1}"
        last[ch] = i
    return "-1 -1"

# Sample test case
test_input = "needed"
print(find_close_occurrences(test_input))
```

This Python code translates the essence of the provided Java code into a Python function and then tests the function with the sample test input. The output of the function will match the expected output provided in the Java test case.
