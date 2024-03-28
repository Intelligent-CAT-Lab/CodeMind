import sys

class p02823:
    def __init__(self):
        self.mod = 1000000007
        self.inf = 0xfffffffffffffff

    def solve(self):
        n, a, b = map(int, sys.stdin.readline().split())
        if a > b:
            a, b = b, a
        if (b - a) % 2 == 1:
            ans1 = a - 1 + (b - a + 1) // 2
            a = n - a + 1
            b = n - b + 1
            if a > b:
                a, b = b, a
            ans2 = a - 1 + (b - a + 1) // 2
            print(min(ans1, ans2))
        else:
            print((b - a) // 2)

if __name__ == "__main__":
    p02823().solve()