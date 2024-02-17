import re
pattern = r"^A?KIHA?BA?RA?$"
S = eval(input())
if re.match(pattern,S):
    print("YES")
else:
    print("NO")