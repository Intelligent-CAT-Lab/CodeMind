import sys

class Solution:
    def __init__(self, input_str):
        self.is_debug = False
        self.INPUT = input_str.encode()
    
    def solve(self):
        x, y = map(int, input().split())
        ans = 0
        while x <= y:
            ans += 1
            x *= 2
        print(ans)

    def run(self):
        self.is = sys.stdin if not self.INPUT else sys.stdin.buffer
        self.out = sys.stdout

        self.solve()

        self.out.flush()
    
# Test input
input_str = '3 20\n'
sol = Solution(input_str)
sol.run()