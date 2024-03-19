import re

def solve(s):
    while '0B ' in s or '1B ' in s:
        s = re.sub('0B ', '', s)
        s = re.sub('1B ', '', s)
    s = re.sub(' B ', '', s)
    return s

print(solve(input()))