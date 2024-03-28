# Python code

# Read input from user
a, b, c, d = map(int, input().split())

# Calculate the product of the first two numbers and the second two numbers
a = a * b
b = c * d

# Print the larger of the two products
print(max(a, b))


Test input:
3 5 2 7

Expected output:
15