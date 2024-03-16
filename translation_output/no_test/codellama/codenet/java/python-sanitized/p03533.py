import re

pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
s = input("Enter a string: ")

if re.match(pat, s):
    print("YES")
else:
    print("NO")