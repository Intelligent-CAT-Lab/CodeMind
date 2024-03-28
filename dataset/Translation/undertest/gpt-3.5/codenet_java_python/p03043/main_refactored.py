class main:
    import sys
    from collections import defaultdict
    
    class Solver:
        
        def calc(self, n, st):
            ans = 1
            val = st
            while val < n:
                val *= 2
                ans *= 2
            return ans
    
        def solve(self, N, K):
            ans = 0
            for i in range(1, N + 1):
                cnt = self.calc(K, i)
                wk = 1 / (cnt * N)
                ans += wk
            return ans
    
    if __name__ == "__main__":
        input_data = sys.stdin.read().split()
        N, K = map(int, input_data[:2])
        
        solver = Solver()
        result = solver.solve(N, K)
        print('{:.12f}'.format(result))