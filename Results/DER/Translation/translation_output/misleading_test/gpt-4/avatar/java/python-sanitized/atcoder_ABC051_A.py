test_input = "pnxnn,muduhzn,aquud,"

input_parts = test_input.strip(',').split(',')

a = input_parts[0].replace('p', '@').replace('m', ' ')
b = input_parts[1].replace('u', 's').replace('n', ' ')
c = input_parts[2].replace('a', ' ').replace('d', 'f')

print(a, b, c)