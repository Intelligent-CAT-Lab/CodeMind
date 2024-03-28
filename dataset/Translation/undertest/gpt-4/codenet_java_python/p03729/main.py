# Read the strings from user input
a = input()
b = input()
c = input()

# Check the last character of `a` with the first character of `b`
# and the last character of `b` with the first character of `c`
if a[-1] == b[0] and b[-1] == c[0]:
    print("YES")
else:
    print("NO")