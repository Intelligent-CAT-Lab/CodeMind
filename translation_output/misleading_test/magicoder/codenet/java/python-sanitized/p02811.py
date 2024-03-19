# Python code

# Get input from user
K, X = map(int, input().split())

# Check condition
if X <= 500*K:
    print("Yes")
else:
    print("No")