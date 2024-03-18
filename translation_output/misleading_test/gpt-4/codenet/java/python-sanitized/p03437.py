# Read input from user
x, y = map(int, input().split())

# Check if x is divisible by y and output result accordingly
if x % y == 0:
    print(-1)
else:
    print(x)