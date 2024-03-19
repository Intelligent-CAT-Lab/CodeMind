# Python code

# Read input from user
a, b = map(int, input().split())

# Calculate the sum of numbers from a to b
n = b - a
sum_numbers = n * (n + 1) // 2

# Subtract b from the sum
result = sum_numbers - b

# Print the result
print(result)


Test input:
8 13

Expected output:
98