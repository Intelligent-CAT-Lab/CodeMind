# Read input from user
a, b, x = map(int, input().split())

# Evaluate conditions and print output
if a + b >= x and a <= x:
    print("YES")
else:
    print("NO")