import sys

class I3y3sChallenge:
    def solve(self, test_number):
        n = self._input()
        if n == 2:
            self._output(-1)
            return
        
        ans = [[n if i == j else j + 1 for j in range(n - 1)] for i in range(n - 1)]
        ans.append([(i + 1) % (n - 1) + 1 for i in range(n - 1)])
        
        for row in ans:
            self._output(*row)
            
    def _input(self):
        return int(input())

    def _output(self, *args):
        print(*args)

if __name__ == "__main__":
    solver = I3y3sChallenge()
    solver.solve(1)
    sys.stdout.flush()