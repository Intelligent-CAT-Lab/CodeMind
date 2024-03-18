# Read the input
a, b, c = input().split()

# Check if the last character of the first word is the same as the
# first character of the second word, and if the last character of
# the second word is the same as the first character of the third word
if a[-1] == b[0] and b[-1] == c[0]:
    print("YES")
else:
    print("NO")