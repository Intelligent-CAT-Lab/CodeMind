# Python code

# Read input
a, b = map(int, input().split())

# Calculate division and modulus
d = a // b
r = a % b

# Calculate division as float
f = "%.5f" % (a / b)

# Print the results
print(d, r, f)