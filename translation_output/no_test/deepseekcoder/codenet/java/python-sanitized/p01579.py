import sys

class p01579:
    def __init__(self):
        self.s = sys.stdin.readline().strip()

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
        print(ans)

if __name__ == "__main__":
    p01579().solve()