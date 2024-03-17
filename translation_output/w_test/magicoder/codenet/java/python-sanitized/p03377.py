# Python code

# Get input from user
a, b, x = map(int, input().split())

# Check if the sum of a and b is greater than or equal to x and a is less than or equal to x
if a + b >= x and a <= x:
    print("YES")
else:
    print("NO")