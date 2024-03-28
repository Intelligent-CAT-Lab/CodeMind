import sys

class Solver:
    def calc(self, n, st):
        ans = 1
        val = st
        while val < n:
            val *= 2
            ans *= 2
        return ans

    def solve(self, in_data):
        lines = in_data.split('\n')
        N, K = map(int, lines[0].split())
        ans = 0
        for i in range(1, N+1):
            cnt = self.calc(K, i)
            wk = 1 / (cnt * N)
            ans += wk
        return ans

if __name__ == '__main__':
    in_data = sys.stdin.read().strip()
    solver = Solver()
    result = solver.solve(in_data)
    print(result)