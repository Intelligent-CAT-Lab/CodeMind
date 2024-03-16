```python
def pdpdp(input_str):
    output_str = ""
    count = 0
    for char in input_str:
        if char == 'D' or char == '?':
            count += 1
            output_str += 'D'
        else:
            output_str += char
    return output_str

# Test case
test_input = "PD?D??P"
expected_output = "PDPDPDP"
result = pdpdp(test_input)
print(result)
assert result == expected_output
```
