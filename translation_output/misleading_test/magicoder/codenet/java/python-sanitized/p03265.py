# Python code

# Read input
x1, y1, x2, y2 = map(int, input().split())

# Calculate the coordinates
a = x2 - x1
b = y2 - y1
x3 = x2 - b
y3 = y2 + a
x4 = x3 - a
y4 = y3 - b

# Print the output
print(x3, y3, x4, y4)