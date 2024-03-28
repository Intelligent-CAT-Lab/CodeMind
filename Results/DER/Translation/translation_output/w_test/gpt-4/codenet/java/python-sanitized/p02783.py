# Read input from the user
line = input().split(" ")

# Parse string input to integers
h = int(line[0])
a = int(line[1])

# Calculate the number of attacks needed
n = h // a
if h % a > 0:
    n += 1

# Output the result
print(n)