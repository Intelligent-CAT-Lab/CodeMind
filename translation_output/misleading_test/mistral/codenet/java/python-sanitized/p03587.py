import sys

def solve(n, in, out):
    s = in.readline()
    n = int(s)
    out.write(str(n))
    out.flush()

if __name__ == "__main__":
    in = sys.stdin
    out = sys.stdout
    solve(1, in, out)