# Get input as a list of integers
inputs = list(map(int, input().split()))

# Calculate left and right values
left = inputs[0] + inputs[1]
right = inputs[2] + inputs[3]

# Determine the result and print it
if left > right:
    print("Left")
elif left == right:
    print("Balanced")
else:
    print("Right")