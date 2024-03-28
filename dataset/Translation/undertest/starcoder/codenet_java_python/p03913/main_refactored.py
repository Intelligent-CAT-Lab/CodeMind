class main:
    import math
    import sys
    
    class Solution:
        def run(self):
            n, a = map(int, sys.stdin.readline().split())
            self.solver(n, a)
    
        def solver(self, n, a):
            ans = n
            for m in range(2, 41):
                c = int(math.pow(n,