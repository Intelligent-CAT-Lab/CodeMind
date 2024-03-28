import sys

def p03005():
    ans = 0
    n = int(sys.stdin.readline().strip())
    k = int(sys.stdin.readline().strip())

    if k == 1:
        ans = 0
    else:
        ans = n - k

    print(ans)

p03005()