import math

# Read input
a, n, m = map(int, input().split())

# Calculate the maximum value
max_value = int(math.pow(m, 1 / n))

# Initialize the answer
ans = 0

# Iterate from 1 to max_value (inclusive)
for i in range(1, max_value + 1):
    # Compute i raised to the power n
    x = int(math.pow(i, n))
    # Convert x to string and calculate the sum of its digits
    y = sum(int(digit) for digit in str(x))
    
    # Check if the condition holds
    if y + a == i:
        ans += 1

# Print the answer
print(ans)