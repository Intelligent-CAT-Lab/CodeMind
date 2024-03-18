def calculate_operation(input_string):
    num = 0
    for c in input_string:
        if c == '+':
            num += 1
        else:
            num -= 1
    return num

# Sample test case
test_input = "+-++"
print(calculate_operation(test_input))