import sys

class Solution:
    def __init__(self):
        self.A = 0
        self.B = 0
        self.N = 0

    def solve(self):
        self.A, self.B, self.N = map(int, input().split())

        ans = abs(self.A - self.B)
        for i in range(1, self.N + 1):
            for j in range(1, self.N + 1):
                if i * self.B % j != 0:
                    continue
                ans = min(ans, abs(self.A - i * self.B // j))

        print(ans)

if __name__ == '__main__':
    solution = Solution()
    solution.solve()