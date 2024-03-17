import sys

def solve(s):
    if s[0] == 'R' and s[1] == 'R' and s[2] == 'R':
        return 3
    elif s[0] == 'R' and s[1] == 'R':
        return 2
    elif s[1] == 'R' and s[2] == 'R':
        return 2
    elif s[0] == 'S' and s[1] == 'S' and s[2] == 'S':
        return 0
    else:
        return 1

s = sys.stdin.readline().strip()
print(solve(s))