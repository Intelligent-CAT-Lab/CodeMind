# Get the input string
s = input()

# Calculate the length of the string
leng = len(s)

# Output the abbreviation
print(f"{s[0]}{leng-2}{s[-1]}")