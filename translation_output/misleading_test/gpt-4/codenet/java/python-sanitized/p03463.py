# Read input as string and split by space to get the individual numbers as strings
n, a, b = input().split()

# Convert the string inputs to integers
n = int(n)
a = int(a)
b = int(b)

# Calculate the difference between b and a
k = b - a

# Print the result based on the parity of the difference
if k % 2 == 1:
    print("Borys")
else:
    print("Alice")