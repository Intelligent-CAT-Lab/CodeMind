# Read the input
tail = input()

# Initialize count
count = 0

# Iterate through the string and count the required characters
for i, char in enumerate(tail):
    if (i % 2 == 0 and char == '0') or (i % 2 == 1 and char == '1'):
        count += 1

# Calculate the remaining length after subtracting the count
n = len(tail) - count

# Print the smaller of count and n
print(min(n, count))