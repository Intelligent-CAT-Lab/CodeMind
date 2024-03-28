s = input("Enter a character: ")
c = s[0]

# Since the behavior is to just increment the character by 1
# within the range 'a' to 'y', it can be done using chr and ord functions.

if 'a' <= c <= 'y':
    out = chr(ord(c) + 1)
    print(out)
else:
    print("Character not in range 'a' to 'y'")