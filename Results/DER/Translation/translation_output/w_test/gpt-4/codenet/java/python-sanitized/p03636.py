# Read input from the user
s = input()

# Calculate the length of the string
leng = len(s)

# Print the first character, the length of the string in between (minus 2), and the last character
print(f"{s[0]}{leng-2}{s[-1]}")