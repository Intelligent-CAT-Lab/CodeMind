# Read input as a list of integers from a single line
a, b, c = map(int, input().split())

# Check if the differences are equal
if a - b == b - c:
    print("YES")
else:
    print("NO")