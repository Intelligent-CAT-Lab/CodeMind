# Read input from the user
a = input() 

# Convert the string into a list to manipulate individual characters
b = list(a)

# Get the length of the input string
c = len(a)

# Swap the first and last characters if the length of the string is exactly 3
if c == 3:
    b[0], b[2] = b[2], b[0]

# Print the modified string
print(''.join(b))