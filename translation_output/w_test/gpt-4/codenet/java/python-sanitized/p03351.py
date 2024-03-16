# Reading the input as integers
a, b, c, d = map(int, input().split())

# Calculating the absolute differences
ab = abs(a - b)
ac = abs(a - c)
bc = abs(b - c)

# Checking the conditions and printing the result
if ac <= d or (ab <= d and bc <= d):
    print("Yes")
else:
    print("No")