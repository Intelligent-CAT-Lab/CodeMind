# Read input from the user
s = input()

# Calculate the length of the string
a = len(s)

# Initialize the flag variable
flag = True

# Compare characters and set the flag based on the conditions
if s[0] == s[a-1]:
    if a % 2 == 1:
        flag = False
    else:
        flag = True
else:
    if a % 2 == 1:
        flag = True
    else:
        flag = False

# Print the result based on the flag value
print("First" if flag else "Second")