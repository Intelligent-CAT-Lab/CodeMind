import sys

class AAccepted:
    def solve(self, testNumber, inp, out):
        s = inp.readline().strip()
        n = s.count('1')
        out.write(str(n) + '\n')

if __name__ == "__main__":
    inp = sys.stdin
    out = sys.stdout
    solver = AAccepted()
    solver.solve(1, inp, out)
    out.close()