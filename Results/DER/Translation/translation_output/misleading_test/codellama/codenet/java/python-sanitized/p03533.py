import re

def is_valid(s):
    pattern = r"A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    return bool(re.match(pattern, s))

s = "KIHBR"
if is_valid(s):
    print("YES")
else:
    print("NO")