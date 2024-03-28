import sys

def check_abc(s):
    abc = [False]*3
    for i in range(len(s)):
        if s[i] == 'a':
            abc[0] = True
        elif s[i] == 'b':
            abc[1] = True
        elif s[i] == 'c':
            abc[2] = True

    isOK = all(abc)

    return "Yes" if isOK else "No"

s = sys.stdin.readline().strip()
print(check_abc(s))