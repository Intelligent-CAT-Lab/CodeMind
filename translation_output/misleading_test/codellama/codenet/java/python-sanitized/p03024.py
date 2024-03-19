import re

def solve(s):
    day = len(s)
    nday = 15 - day
    cnt = 0
    for i in range(day):
        if s[i] == 'o':
            cnt += 1
    if (day <= 7) or ((day >= 8) and (cnt + nday >= 8)):
        return "YES"
    else:
        return "NO"

s = "oxoxoxoxoxoxox"
print(solve(s))