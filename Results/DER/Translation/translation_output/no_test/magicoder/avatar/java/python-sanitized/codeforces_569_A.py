import sys
import math

class TaskA:
    def solve(self, testNumber, inp, out):
        t, s, q = map(int, inp.readline().split())
        sum = 0
        while s < t:
            s = s * q
            sum += 1
        out.write(str(sum) + '\n')

if __name__ == "__main__":
    inp = sys.stdin
    out = sys.stdout
    solver = TaskA()
    solver.solve(1, inp, out)
    out.close()