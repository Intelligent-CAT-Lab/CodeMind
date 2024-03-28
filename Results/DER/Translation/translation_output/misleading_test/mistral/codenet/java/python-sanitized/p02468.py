import sys

def power(a, e, modP):
    ret = 1
    for e in range(e):
        if e % 2 == 1:
            ret = (ret * a) % modP
        a = (a * a) % modP
    return ret

def solve(m, n, modP):
    print(power(m, n, modP))

if __name__ == "__main__":
    m, n = map(int, sys.stdin.readline().strip().split())
    solve(m, n, 1000000007)