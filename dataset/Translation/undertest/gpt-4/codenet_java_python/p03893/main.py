# Read an integer input from the user
x = int(input())

# Initial value for 'next'
next_val = 2

# Loop 'x' times
for i in range(x):
    next_val = (next_val + 1) * 2

# Print the result
print(next_val)