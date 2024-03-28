# Python code

# Read input from user
a, b, x = map(int, input().split())

# Check condition
if a + b >= x and a <= x:
    print("YES")
else:
    print("NO")