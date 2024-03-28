# Read input from the user
o, n, g = map(int, input().split())

# Initialize total cost
x = 0

# Calculate total cost for g bananas
for i in range(1, g + 1):
    x += i * o

# Calculate the borrow amount
borrow = x - n

# Print the result
if borrow <= 0:
    print(0)
else:
    print(borrow)