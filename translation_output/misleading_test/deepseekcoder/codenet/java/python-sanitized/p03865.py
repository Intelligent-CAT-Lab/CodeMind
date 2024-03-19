import sys

def check_string(s):
    a = len(s)
    flag = True

    if s[0] == s[a-1]:
        if a%2 == 1:
            flag = False
        else:
            flag = True
    else:
        if a%2 == 1:
            flag = True
        else:
            flag = False

    if flag:
        return "First"
    else:
        return "Second"

s = sys.stdin.readline().strip()
print(check_string(s))