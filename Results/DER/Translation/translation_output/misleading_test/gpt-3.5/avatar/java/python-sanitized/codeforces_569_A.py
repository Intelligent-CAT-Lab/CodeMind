import sys

class TaskA:
    def solve(self, t, s, q):
        sum = 0
        while s < t:
            s *= q
            sum += 1
        return sum

if __name__ == "__main__":
    t, s, q = map(int, sys.stdin.readline().split())
    solver = TaskA()
    result = solver.solve(t, s, q)
    print(result)