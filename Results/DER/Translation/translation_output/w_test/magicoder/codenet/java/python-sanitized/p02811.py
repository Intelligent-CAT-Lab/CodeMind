# Python code

# Get input from user
K, X = map(int, input().split())

# Check if X is less than or equal to 500*K
if X <= 500*K:
    print("Yes")
else:
    print("No")