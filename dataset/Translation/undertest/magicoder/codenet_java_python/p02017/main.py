# Python code

# Get input from user
h, w, x, y = map(int, input().split())

# Check if the product of h and w is odd and the sum of x and y is odd
if h * w % 2 == 1 and (x + y) % 2 == 1:
    print("No")
else:
    print("Yes")