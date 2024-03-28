# Read the input string
s = input()

# Initialize the counter
counter = 0

# Iterate through the string to count changes in adjacent characters
for i in range(len(s)-1):
    if s[i] != s[i+1]:
        counter += 1

# Output the result
print(counter)