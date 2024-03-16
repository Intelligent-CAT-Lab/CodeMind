from collections import defaultdict

class p01579:
    def __init__(self):
        self.INF = 1 << 28
        self.EPS = 1e-9

    def run(self):
        self.s = input()
        self.solve()

    def solve(self):
        n = len(self.s)
        count = defaultdict(int)
        now = 0
        for char in self.s:
            if char == '(':
                now += 1
            else:
                now -= 1
            count[now + n] += 1
        
        now = 0
        ans = 0
        for char in self.s:
            if char == '(':
                now += 1
            else:
                now -= 1
            count[now + n] -= 1
            ans += count[now + n]

        print(ans)

if __name__ == "__main__":
    p = p01579()
    p.run()