# Python code

# Get input from user
x, a, b = map(int, input().split())

# Compare the absolute difference between x and a and x and b
if abs(x-a) < abs(x-b):
    print("A")
else:
    print("B")