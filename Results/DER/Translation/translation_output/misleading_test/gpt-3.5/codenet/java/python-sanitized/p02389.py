import sys

class Solution:
    def solve(self):
        a, b = map(int, input().split())
        print(a*b, 2*a+2*b)
        
if __name__ == "__main__":
    solver = Solution()
    solver.solve()