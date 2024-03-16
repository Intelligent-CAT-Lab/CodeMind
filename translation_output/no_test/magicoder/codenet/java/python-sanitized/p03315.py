# Python code

# Get input from user
input_str = input()

# Convert the string to a list of characters
ary = list(input_str)

# Initialize num to 0
num = 0

# Iterate over each character in the list
for c in ary:
    # If the character is '+', increment num
    if c == '+':
        num += 1
    # Otherwise, decrement num
    else:
        num -= 1

# Print the final value of num
print(num)