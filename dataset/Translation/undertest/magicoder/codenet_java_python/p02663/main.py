# Python code

# Read input
input_values = input().split()

# Convert input to integers
h1 = int(input_values[0])
m1 = int(input_values[1])
h2 = int(input_values[2])
m2 = int(input_values[3])
k = int(input_values[4])

# Calculate time in minutes
h = h2 - h1
m = m2 - m1

# Calculate total time in minutes
day = (h * 60) + m

# Subtract k from total time
result = day - k

# Print result
print(result)