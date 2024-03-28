import sys

def p03524():
    S = sys.stdin.readline().strip()
    a = S.count('a')
    b = S.count('b')
    c = S.count('c')
    if max(abs(a-b), abs(b-c), abs(c-a)) <= 1:
        print("YES")
    else:
        print("NO")

p03524()