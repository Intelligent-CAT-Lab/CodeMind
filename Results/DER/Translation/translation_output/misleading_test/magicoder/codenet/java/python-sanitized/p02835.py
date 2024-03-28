# Python code

# Get input from user
a, b, c = map(int, input().split())

# Check if the sum of the three numbers is greater than or equal to 22
if a + b + c >= 22:
    print("bust")
else:
    print("win")