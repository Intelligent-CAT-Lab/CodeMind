import re

input_str = "pnxnn,muduhzn,aquud,"

inputs = re.split(",", input_str.strip())

a = inputs[0]
b = inputs[1]
c = inputs[2]

print(a + " " + b + " " + c)