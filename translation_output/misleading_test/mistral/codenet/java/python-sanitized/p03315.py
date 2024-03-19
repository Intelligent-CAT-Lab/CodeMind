# Test input:
# -++

# Expected output:
# 88

# Solution:

# Read input
input = input()

# Convert input to list of characters
ary = list(input)

# Initialize num to 0
num = 0

# Iterate over characters in ary
for c in ary:
    # If c is '+', increment num
    if c == '+':
        num += 1
    # If c is '-', decrement num
    else:
        num -= 1

# Print num
print(num)