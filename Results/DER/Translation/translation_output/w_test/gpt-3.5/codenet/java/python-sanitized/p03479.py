import sys

class Solution:
    def solve(self):
        x, y = map(int, input().split())
        ans = 0
        i = x
        while i <= y:
            ans += 1
            i *= 2
        print(ans)

    def run(self):
        self.solve()

if __name__ == "__main__":
    Solution().run()