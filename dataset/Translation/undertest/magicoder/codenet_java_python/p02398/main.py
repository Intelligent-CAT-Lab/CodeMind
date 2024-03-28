# Python code

# Read input from user
x, y, z = map(int, input().split())

# Initialize counter
t = 0

# Loop through numbers from x to y
for i in range(x, y+1):
    # Check if z is divisible by i
    if z % i == 0:
        # Increment counter
        t += 1

# Print the counter
print(t)