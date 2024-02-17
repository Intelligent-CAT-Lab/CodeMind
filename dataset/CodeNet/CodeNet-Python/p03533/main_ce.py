import re
pattern = r"^A?KIHA?BA?RA?$"
S = "KIHBR"
if re.match(pattern,S):
    print("YES")
else:
    print("NO")