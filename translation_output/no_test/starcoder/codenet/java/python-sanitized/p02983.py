import sys

class Solution:
    def solve(self):
        L = int(sys.stdin.readline())
        R = int(sys.stdin.readline())

        R -= L
        L %= 2019
        R += L

        res = 2019

        if R - L > 2019:
            print(0)
            return

        for i in range(L, R+1):
            for j in range(L, i):
                res = min(res, (i*j) % 2019)

        print(res)

sol = Solution()
sol.solve()