import re

def translate(line):
    line = re.sub(r'egg', 'e', line)
    line = re.sub(r'chicken', 'c', line)
    line = re.sub(r'ee', 'e e', line)
    line = re.sub(r'cc', 'c c', line)
    strs = line.split()
    max_len = 0
    ans = ''
    for s in strs:
        if len(s) > max_len:
            max_len = len(s)
            ans = 'egg' if s[-1] == 'e' else 'chicken'
    return ans

line = input().strip()
print(translate(line))