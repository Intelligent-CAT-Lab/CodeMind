import sys

class Solution:
    def __init__(self):
        self.s = None
        self.a = None
        self.b = None

    def solve(self):
        self.s = input()

        self.a = [0] * 26
        self.b = [0] * 1111

        for i in range(len(self.s)):
            self.a[ord(self.s[i]) - ord('a')] += 1

        for i in range(26):
            self.b[self.a[i]] += 1

        for i in range(999, -1, -2):
            if self.b[i] > 0:
                self.b[i] -= 1
                break

        m = 0

        for i in range(1, 1001, 2):
            m += self.b[i]

        if m % 2 == 0:
            print(m // 2)
        else:
            print(m // 2 + 1)

if __name__ == "__main__":
    sol = Solution()
    sol.solve()