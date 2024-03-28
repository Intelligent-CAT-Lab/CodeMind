import re

def count_pairs(s):
    while '()' in s:
        s = re.sub(r'\(\)', '', s)
    return len(re.findall(r'\(\)', s))

s = input()
print(count_pairs(s))