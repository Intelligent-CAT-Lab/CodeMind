# Read input from user
a, b = map(int, input().split())

# Check for the given conditions
if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
    print("Possible")
else:
    print("Impossible")