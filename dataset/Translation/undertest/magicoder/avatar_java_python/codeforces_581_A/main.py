# Python code

# Read input
a, b = map(int, input().split())

# Initialize count
count = 0

# Loop until a and b are both 0
while a > 0 and b > 0:
    count += 1
    a -= 1
    b -= 1

# Calculate the answer
ans = a // 2 + b // 2

# Print the result
print(count, ans)