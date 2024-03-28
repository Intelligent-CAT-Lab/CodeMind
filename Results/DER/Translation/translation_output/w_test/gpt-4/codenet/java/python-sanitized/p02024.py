# Read the inputs as integers
h, w, s, t = map(int, input().split())

# Check if both condition holds
if h * w % 2 == 1 and (s * w + t) % 2 == 1:
    print("No")
else:
    print("Yes")