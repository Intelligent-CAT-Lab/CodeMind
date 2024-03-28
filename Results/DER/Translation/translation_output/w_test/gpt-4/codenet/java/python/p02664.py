Here is the translated Python code based on the provided Java code:

```python
def p02664(s):
    result = []
    count = 0
    for char in s:
        if char == 'D' or char == '?':
            count += 1
            result.append('D')
        else:
            result.append(char)
    return ''.join(result)

# Sample test case
input_str = "PD?D??P"
expected_output = "PDPDPDP"
assert p02664(input_str) == expected_output

print(p02664(input_str))
```

The code defines a function `p02664` that takes the input string `s`, replaces every '?' with 'D' and counts the number of 'D's, then prints the resulting string. The sample test case asserts that the output of the function for the given `input_str` is equal to `expected_output`. The last line actually prints the result of the function for visual inspection.
