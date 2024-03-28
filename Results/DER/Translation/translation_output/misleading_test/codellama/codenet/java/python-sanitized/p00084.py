import re

def solve(s):
    s = re.sub(r'[.,]', ' ', s)
    tokens = s.split()
    result = ''
    for token in tokens:
        if len(token) >= 3 and len(token) <= 6:
            result += token[0]
    return result

s = "Rain, rain, go to Spain."
print(solve(s))