# Python code

# Get input from user
n, k = map(int, input().split())

# Check if n is divisible by k
if n % k == 0:
    print(0)
else:
    print(1)