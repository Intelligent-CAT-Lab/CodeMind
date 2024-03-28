# Read input from the user
x, t = map(int, input().split())

# Calculate and print the appropriate result based on the condition
if x > t:
    print(x - t)
else:
    print(0)