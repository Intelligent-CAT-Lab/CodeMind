# Python code

# Get input from user
r, g, b = map(int, input().split())

# Calculate the sum
sum = (r*100) + (g*10) + b

# Check if the sum is divisible by 4
if sum % 4 == 0:
    print("YES")
else:
    print("NO")