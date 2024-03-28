import math

def execute(input_val):
    r = int(math.sqrt(input_val))
    return r * r

# Example/test case
input_val = 10
output_val = execute(input_val)
print(output_val)