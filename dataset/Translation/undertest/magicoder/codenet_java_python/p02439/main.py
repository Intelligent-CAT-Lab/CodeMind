# Python code

# Read input from user
a, b, c = map(int, input().split())

# Find minimum and maximum of a and b
min_ab = min(a, b)
max_ab = max(a, b)

# Print the minimum and maximum of min_ab and c and max_ab and c
print(min(min_ab, c), max(max_ab, c))


Test input:
4 5 3

Expected output:
3 5