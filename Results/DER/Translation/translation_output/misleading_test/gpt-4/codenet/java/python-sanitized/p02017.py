# Read input from user
h, w, x, y = map(int, input().split())

# Check condition and print result
if h * w % 2 == 1 and (x + y) % 2 == 1:
    print("No")
else:
    print("Yes")