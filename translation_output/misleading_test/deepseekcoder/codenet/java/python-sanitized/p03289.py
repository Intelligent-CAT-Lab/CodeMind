import sys

def solve(s):
    c = list(s)
    if c[0] != 'A':
        return "WA"
    count = 0
    index = 0
    for i in range(2, len(c) - 1):
        if c[i] == 'C':
            count += 1
            index = i
    if count != 1:
        return "WA"
    for i in range(len(c)):
        if i == 0 or i == index:
            continue
        if c[i].isupper():
            return "WA"
    return "AC"

s = sys.stdin.readline().rstrip()
print(solve(s))