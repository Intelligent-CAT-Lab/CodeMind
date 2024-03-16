# Read input from standard input
a, b = input().split()
a = int(a)
b = float(b)

# Calculate the result
c = round(b * 100)
d = a * c
print(d // 100)

# Test case
# Input: 814793613347395