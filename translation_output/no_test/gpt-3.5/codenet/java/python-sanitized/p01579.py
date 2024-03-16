import sys

class p01579:
    def __init__(self):
        self.s = ''
        self.INF = 1 << 28
        self.EPS = 1e-9

    def run(self):
        self.s = input().strip()
        self.solve()

    def solve(self):
        n = len(self.s)
        count = [0] * (2 * n + 1)
        now = 0
        for i in range(n):
            if self.s[i] == '(':
                now += 1
            else:
                now -= 1
            count[now + n] += 1

        now = 0
        ans = 0
        for i in range(n):
            if self.s[i] == '(':
                now += 1
            else:
                now -= 1
            count[now + n] -= 1
            ans += count[now + n]

        self.println(str(ans))

    def println(self, s):
        print(s)

    def debug(self, *os):
        print(os, file=sys.stderr)

if __name__ == "__main__":
    p = p01579()
    p.run()