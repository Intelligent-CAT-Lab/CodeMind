import re

def remove_substrings(s):
    while '0B ' in s or '1B ' in s:
        s = re.sub('0B |1B ', '', s)
    s = re.sub(' B ', '', s)
    return s

s = input()
print(remove_substrings(s))