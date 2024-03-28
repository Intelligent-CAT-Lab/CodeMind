import re

def solve(s):
    s = re.sub('eraser|erase|dreamer|dream', '', s)
    return 'YES' if len(s) == 0 else 'NO'

s = input()
print(solve(s))