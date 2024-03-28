The provided Java code snippet takes a string input, iterates over each character, and swaps the case for alphabetical characters while leaving other characters unchanged. Here is the equivalent Python code:

```python
# Equivalent Python code for the Java sample provided

input_str = input()

# Translation of the logic into Python
output_str = ''
for char in input_str:
    if char.islower():
        output_str += char.upper()
    elif char.isupper():
        output_str += char.lower()
    # The Java code has commented out the space handling
    # Thus there's no need to handle spaces separately in the Python translation
    else:
        output_str += char

print(output_str)
```

This is how you would use the provided Python code with the given test case:

Test input:
```python
fAIR, LATER, OCCASIONALLY CLOUDY.
```

Expected output:
```python
)LO(, LATR, OCCAS5IONALLY CL%:DY.
```
