# Python code

# Get input from user
X, Y = map(int, input().split())

# Check if either X or Y is even
if X % 2 == 0 or Y % 2 == 0:
    print("Even")
else:
    print("Odd")