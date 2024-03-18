# Read input from user
a, b = map(int, input().split())

# Calculate the answer
ans = (b - 1) // (a - 1)

# Check for exact division
if (b - 1) % (a - 1) == 0:
    print(ans)
else:
    print(ans + 1)