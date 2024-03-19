import sys

class codeforces_569_A:
    def solve(self, t, s, q):
        sum = 0
        while s < t:
            s = s * q
            sum += 1
        return sum

if __name__ == "__main__":
    t, s, q = map(int, sys.stdin.readline().split())
    solver = codeforces_569_A()
    print(solver.solve(t, s, q))