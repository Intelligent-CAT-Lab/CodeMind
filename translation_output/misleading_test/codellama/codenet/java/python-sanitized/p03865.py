import sys

def solve(s):
    a = len(s)
    flag = True
    if s[0] == s[-1]:
        if a % 2 == 1:
            flag = False
        else:
            flag = True
    else:
        if a % 2 == 1:
            flag = True
        else:
            flag = False
    if flag:
        return "First"
    else:
        return "Second"

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(solve(s))