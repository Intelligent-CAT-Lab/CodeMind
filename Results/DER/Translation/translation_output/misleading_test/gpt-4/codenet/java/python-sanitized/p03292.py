# Read the input as a list of integers
input_values = list(map(int, input().split()))

# Assign values to T, R, and Y based on the input
T = input_values[0]
R = input_values[1]
Y = input_values[2]

# Calculate the maximum and minimum values
A = max(T, R, Y)
B = min(T, R, Y)

# Print the result of A - B
print(A - B)