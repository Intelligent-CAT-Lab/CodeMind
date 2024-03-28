# Read input
a, b = map(int, input().split())

# Calculate result
res = a

while a >= b:
    res += a // b
    a = (a // b) + (a % b)

# Print result
print(res)