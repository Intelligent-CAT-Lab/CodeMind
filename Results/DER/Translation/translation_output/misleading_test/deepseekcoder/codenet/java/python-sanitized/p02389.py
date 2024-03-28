import sys

class Solution:
    def solve(self):
        a = int(input().split()[0])
        b = int(input().split()[1])
        print(a*b, 2*a + 2*b)

solver = Solution()
solver.solve()