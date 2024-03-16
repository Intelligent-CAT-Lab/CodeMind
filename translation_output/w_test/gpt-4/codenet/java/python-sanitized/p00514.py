from math import comb

# Read integer inputs from the user
a, b, c = map(int, input().split())

# Check the first condition
if a * b > c:
    print(0)
    exit(0)

# Adjust c accordingly
c -= a * b
d = c + a - 1

# Calculate the combinatorial result using math.comb for the binomial coefficient
result = comb(d, c)

# Print the result
print(result)