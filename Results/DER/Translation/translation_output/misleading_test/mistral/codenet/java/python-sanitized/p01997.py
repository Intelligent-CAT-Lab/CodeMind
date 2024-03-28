import sys

def solve(in, out, ms):
    a, b = map(float, in.readline().strip().split())
    out.write(f"{4.0/3.0*math.pi*b**3:.16f}\n")

if __name__ == "__main__":
    in = sys.stdin
    out = sys.stdout
    ms = Methods()
    solve(in, out, ms)