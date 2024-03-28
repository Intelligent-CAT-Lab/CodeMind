# Reading input from the user
x, a, b = map(int, input().split())

# Compare absolute differences and print result
if abs(x - a) < abs(x - b):
    print("A")
else:
    print("B")