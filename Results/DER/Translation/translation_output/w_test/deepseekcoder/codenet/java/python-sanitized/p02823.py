import sys

class p02823:
    def __init__(self):
        self.inp = sys.stdin.readline().split()
        self.mod = 1000000007
        self.inf = 0xfffffffffffffff

    def solve(self):
        n = int(self.inp[0])
        a = int(self.inp[1])
        b = int(self.inp[2])
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