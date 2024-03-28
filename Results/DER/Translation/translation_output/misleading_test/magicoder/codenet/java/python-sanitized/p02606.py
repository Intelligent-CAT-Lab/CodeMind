# Python code

# Get input from user
L, R, d = map(int, input().split())

# Initialize Ans
Ans = 0

# Loop through the range
for i in range(L, R+1):
    # Check if i is divisible by d
    if i % d == 0:
        # Increment Ans
        Ans += 1

# Print Ans
print(Ans)