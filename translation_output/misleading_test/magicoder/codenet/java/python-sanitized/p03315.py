# Python code

def calculate_value(input_string):
    num = 0
    for c in input_string:
        if c == '+':
            num += 1
        else:
            num -= 1
    return num

# Test input
input_string = "+-++"
print(calculate_value(input_string))