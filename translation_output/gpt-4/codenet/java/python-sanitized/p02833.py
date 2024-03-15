from sys import stdin

LINF = 1 << 55
MOD = 1000000007
mh4 = [0, -1, 1, 0]
mw4 = [-1, 0, 0, 1]
mh8 = [-1, -1, -1, 0, 0, 1, 1, 1]
mw8 = [-1, 0, 1, -1, 1, -1, 0, 1]

def solve(test_number):
    n = int(input())
    if n % 2 == 1:
        print(0)
        return

    ans = 0
    base = 10
    while True:
        if base > n: break
        ans += n // base
        base *= 5
    print(ans)

if __name__ == '__main__':
    solve(1)