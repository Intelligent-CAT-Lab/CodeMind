import sys

def read_ints():
    return list(map(int, input().split()))

class Solver:
    def __init__(self):
        self.nums = read_ints()

    def solve(self):
        a, b = self.nums
        return max(a + b, a - b, a * b)

if __name__ == '__main__':
    solver = Solver()
    print(solver.solve())