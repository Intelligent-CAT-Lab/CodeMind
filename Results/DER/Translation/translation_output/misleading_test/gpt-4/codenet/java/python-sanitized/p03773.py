# Read input from user
A, B = map(int, input().split())

# Calculate the answer
ans = (A + B - 24) if (A + B) > 23 else (A + B)

# Print the answer
print(ans)