# Read the input values from user
a, b, c = map(int, input().split())

# Check if the sum is greater than or equal to 22
if a + b + c >= 22:
    print("bust")
else:
    print("win")