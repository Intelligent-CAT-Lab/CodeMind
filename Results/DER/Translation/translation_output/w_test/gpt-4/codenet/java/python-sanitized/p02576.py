# Read input from the user
n, x, t = map(int, input().split())

# Initialize variables
ans = 0
tako = 0

# Calculate the time needed
while n > tako:
    ans += t
    tako += x

# Print the result
print(ans)