import re

def is_hihi(s):
    return re.match(r'hihi', s)

print(is_hihi('hihi'))