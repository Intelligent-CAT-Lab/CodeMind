import sys

class p03397:
    MOD = int(1e9) + 7
    
    def __init__(self):
        self.win = "W?W?L?W?L?"
        self.states = len(self.win)
        self.go = [
            [0, 0], [2, 2], [1, 3], [2, 0], [5, 5],
            [4, 6], [5, 3], [8, 8], [7, 9], [8, 6]
        ]

    def add(self, x, y):
        x += y
        if x >= self.MOD:
            x -= self.MOD
        return x

    def solve(self, s):
        start = len(self.go) - 1
        dp = [0] * self.states
        dp[start] = 1
        ndp = [0] * self.states
        for c in s:
            ndp = [0] * self.states
            for st in range(self.states):
                if c == '0' or c == '?':
                    next_st = self.go[st][0]
                    ndp[next_st] = self.add(ndp[next_st], dp[st])
                if c == '1' or c == '?':
                    next_st = self.go[st][1]
                    ndp[next_st] = self.add(ndp[next_st], dp[st])
            dp, ndp = ndp, dp
        res = 0
        for i in range(self.states):
            if dp[i] == 0:
                continue
            w = self.win[i]
            if w == '?':
                raise AssertionError()
            if w == 'W':
                res += dp[i]
        return res % self.MOD

    def run_file(self, filename_in, filename_out):
        with open(filename_in, 'r') as fin:
            s = fin.readline().strip()
        result = self.solve(s)
        with open(filename_out, 'w') as fout:
            fout.write(str(result) + '\n')

    def run_io(self):
        s = input().strip()
        result = self.solve(s)
        print(result)

if __name__ == '__main__':
    program = p03397()
    if len(sys.argv) > 1:
        program.run_file(sys.argv[1], 'p03397.out')
    else:
        program.run_io()