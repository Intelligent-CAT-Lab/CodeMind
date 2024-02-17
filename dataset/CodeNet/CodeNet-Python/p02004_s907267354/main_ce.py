import sys
readline = sys.stdin.readline
write = sys.stdout.write
def solve():
    S = readline().strip()
    ans = 0
    d = 0; cur = 0
    for c in S:
        if c == "R":
            if d == cur:
                cur += 1
            d = (d + 1) % 4
            if d == 0 and cur == 4:
                ans += 1
                cur = 0
        else:
            d = (d - 1) % 4
            if d == 0:
                cur = 0
    write("%d\n" % ans)
solve()
