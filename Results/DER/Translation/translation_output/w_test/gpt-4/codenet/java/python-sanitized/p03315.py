# input_string = input()  # Uncomment this line for actual input
input_string = "+-++"  # Test input
num = 0
for c in input_string:
    if c == '+':
        num += 1
    else:
        num -= 1
print(num)