# No imports are necessary for this task in Python

# Read a line from standard input
line = input()

# Split the line into tokens (integers), map each token to int, and create a list
sides = list(map(int, line.split()))

# Calculate the total of all the sides (not used in the logic, this can be removed)
total = sum(sides)

# Sort the sides
sides.sort()

# Check if the rectangle condition is met and print the result
if sides[0] == sides[1] and sides[2] == sides[3]:
    print("yes")
else:
    print("no")