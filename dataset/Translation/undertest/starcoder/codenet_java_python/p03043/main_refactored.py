class main:
    import sys
    
    class Solution:
        def calc(self, n, st):
            ans = 1
            val = st
            while val < n:
                val *= 2
                ans *= 2
            return ans
    
        def solve(self, testNumber, in, out):
            N = in.nextInt()
            K = in.nextInt()
            cnt = 0
            wk = 0
            ans = 0
            for i in range(1, N+1):
                cnt = self.calc(K, i)
                wk =