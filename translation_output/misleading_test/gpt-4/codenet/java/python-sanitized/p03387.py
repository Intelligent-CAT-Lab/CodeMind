# Read input from user as integers split by space
x = list(map(int, input().split()))

# Sort the list of integers
x.sort()

# Calculate the temporary variable
temp = 2*x[2] - x[1] - x[0]

# Calculate the final answer based on the value of temp
if temp % 2 == 1:
    ans = (temp + 2) // 2 + 1
else:
    ans = temp // 2

# Print the answer
print(ans)