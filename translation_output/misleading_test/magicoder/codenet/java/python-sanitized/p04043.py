# Python code

# Read input from user
a, b, c = map(int, input().split())

# Check conditions and print output
if (a == 5 and b == 7 and c == 5) or (a == 5 and b == 5 and c == 7) or (a == 7 and b == 5 and c == 5):
    print("YES")
else:
    print("NO")