# Python code

# Read input from user
a, b, c = map(int, input().split())

# Check if the sum of b and c is less than a
if b + c < a:
    print(0)
else:
    print(b + c - a)