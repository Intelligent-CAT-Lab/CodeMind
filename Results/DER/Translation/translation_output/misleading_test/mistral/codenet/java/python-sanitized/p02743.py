import sys

def solve(a, b, c):
    d = c - a - b
    if d > 0 and 4 * a * b < d * d:
        return "Yes"
    else:
        return "No"

if __name__ == "__main__":
    sc = sys.stdin
    writer = sys.stdout
    sc = FastScanner(sc)
    writer = PrintWriter(writer)
    solver = Solver(sc, writer)
    solver.run()
    writer.flush()