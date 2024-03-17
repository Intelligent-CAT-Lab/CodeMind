import sys

def solve():
    x, k, d = map(int, sys.stdin.readline().split())
    x = abs(x)
    if x // d >= k:
        print(x - k * d)
    else:
        sho = x // d
        amari = x % d
        if (k - sho) % 2 == 0:
            print(amari)
        else:
            print(d - amari)

if __name__ == "__main__":
    solve()