# Python code

# Read input from user
input_values = input().split()

# Convert string inputs to integers
left = int(input_values[0]) + int(input_values[1])
right = int(input_values[2]) + int(input_values[3])

# Compare the values and print the result
if left > right:
    print("Left")
elif left == right:
    print("Balanced")
else:
    print("Right")