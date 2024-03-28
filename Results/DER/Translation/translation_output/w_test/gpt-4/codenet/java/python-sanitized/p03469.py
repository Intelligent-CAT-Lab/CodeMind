# Read input date from the user
S = input()

# Convert the year to an integer, add 1, and convert back to a string
year = str(int(S[:4]) + 1)

# Output the new date with the incremented year and the rest of the original date
print(year + S[4:])