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