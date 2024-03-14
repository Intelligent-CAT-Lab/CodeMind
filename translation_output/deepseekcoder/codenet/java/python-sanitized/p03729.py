import sys

def p03729():
    a = sys.stdin.readline().strip()
    b = sys.stdin.readline().strip()
    c = sys.stdin.readline().strip()

    if a[-1] == b[0] and b[-1] == c[0]:
        print("YES")
    else:
        print("NO")

p03729()