# Read input string from user
s = input()

# Check if the third and fourth characters as well as fifth and sixth characters are the same
if s[2] == s[3] and s[4] == s[5]:
    print("Yes")
else:
    print("No")