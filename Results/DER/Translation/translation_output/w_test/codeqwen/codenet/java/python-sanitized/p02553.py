import sys

def solve_abc178_b():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    c = int(sys.stdin.readline())
    d = int(sys.stdin.readline())

    ans = a * c
    ans = max(ans, a * d)
    ans = max(ans, b * c)
    ans = max(ans, b * d)

    print(ans)

solve_abc178_b()