import sys

if sys.version_info[0] < 3:
    from sys import stdin, stdout
    input = stdin.readline
    prnt = stdout.write
else:
    from sys import stdin, stdout
    input = stdin.readline
    prnt = stdout.write

s = input().strip()
res = 0

if s[0] == 'R' and s[1] == 'R' and s[2] == 'R':
    res = 3
elif s[0] == 'R' and s[1] == 'R':
    res = 2
elif s[1] == 'R' and s[2] == 'R':
    res = 2
elif s[0] == 'S' and s[1] == 'S' and s[2] == 'S':
    res = 0
else:
    res = 1

prnt(str(res) + "\n")