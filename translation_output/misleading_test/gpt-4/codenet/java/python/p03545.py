Below is the Python version of the provided Java code. Note that in Python, we don't need to import a separate module to handle standard input/output by the user, as we can directly use `input()` and `print()` functions:

```python
def find_expression(nums):
    # Iterate over the 3 operators positions
    for op1 in "+-":
        for op2 in "+-":
            for op3 in "+-":
                expression = f"{nums[0]}{op1}{nums[1]}{op2}{nums[2]}{op3}{nums[3]}"
                if eval(expression) == 7:
                    return f"{expression}=7"

# Take input from the user
str_num = input()

# Extract individual numbers as integers from the string
nums = [int(ch) for ch in str_num]

# Find the expression with operations such that the result equals 7
result_expression = find_expression(nums)

# Output the result
print(result_expression)
```

To run this Python code, you can simply execute it and it will wait for an input. After you input `1222`, it should output `.+2+2+2=7`, as expected.
