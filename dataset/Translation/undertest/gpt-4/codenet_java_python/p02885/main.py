# Read the input from the user.
line = input()
# Split the input based on the space and convert the elements to integers.
a, b = map(int, line.split())

# Check the condition and print the result accordingly.
if a > 2 * b:
    print(a - 2 * b)
else:
    print(0)