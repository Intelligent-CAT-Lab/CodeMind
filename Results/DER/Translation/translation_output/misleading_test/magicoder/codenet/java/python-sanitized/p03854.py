import re

def solve(S):
    S = re.sub('eraser|erase|dreamer|dream', '-', S)
    if len(S) == 0:
        return "YES"
    else:
        return "NO"

S = input()
print(solve(S))