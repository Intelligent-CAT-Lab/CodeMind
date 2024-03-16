Certainly! Below is the Python code that achieves the same functionality as the provided Java code:

```python
def rotate_values(input_string):
    values = input_string.split()
    a, b, c = values
    return f"{c} {a} {b}"

# Sample test case
input_string = "1 2 3"
output = rotate_values(input_string)
print(output)
```

This Python function `rotate_values` takes a string `input_string` containing three integers separated by spaces, splits the string into three variables, and then returns them in rotated order, formatted as a string.

For your given test input "1 2 3", calling the `rotate_values` function with this input and printing the result will give you the expected output "3 1 2".
