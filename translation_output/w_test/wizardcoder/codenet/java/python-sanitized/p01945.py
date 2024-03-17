import re

def count_pairs(s):
    while '()' in s:
        s = re.sub(r'\(\)', '', s)
    return s.count('*')

s = input()
print(count_pairs(s))