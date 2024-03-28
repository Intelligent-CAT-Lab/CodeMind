import re

def solve(s):
    pat = "A{0,1}KIHA{0,1}BA{0,1}RA{0,1}"
    if re.fullmatch(pat, s):
        return "YES"
    else:
        return "NO"

print(solve(input()))