import sys

def solve(N):
    n = len(N)
    bigint = int(N)
    bigint *= 9

    ok = n * 10
    ng = 0
    while abs(ok - ng) > 1:
        med = (ok + ng) // 2
        if canMake(med, bigint):
            ok = med
        else:
            ng = med

    return (ok + 8) // 9

def canMake(n, bigint):
    bigint += n
    return bigint.digit_sum() <= n

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(solve(s))