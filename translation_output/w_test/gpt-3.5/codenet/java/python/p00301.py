```python
def convert_dec_to_ternary(n):
    a = [0] * 15
    i = 0
    while n > 0:
        a[i] = (n + 1) % 3 - 1
        n = (n - a[i]) // 3
        i += 1
    result = ""
    for j in range(i - 1, -1, -1):
        result += ("0" if a[j] == 0 else "+" if a[j] > 0 else "-") + ("\n" if j == 0 else "")
    return result

# Test the function with input 25
print(convert_dec_to_ternary(25))
```
This Python code translates the given Java code to a Python function `convert_dec_to_ternary`, which converts a decimal number to a ternary representation. The provided test case is included and shows the expected output '```+0-+```' for the input 25.
