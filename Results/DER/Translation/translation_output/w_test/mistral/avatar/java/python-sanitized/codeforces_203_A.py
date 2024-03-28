import sys

def solve(test_number, in, out):
    points = int(in.readline())
    t = int(in.readline())
    a = int(in.readline())
    b = int(in.readline())
    ta = int(in.readline())
    tb = int(in.readline())
    for i in range(t):
        for j in range(t):
            if points == a - i * ta + b - j * tb or (points == 0) or points == a - ta * i or points == b - tb * j:
                out.write("YES\n")
                return
    out.write("NO\n")

if __name__ == "__main__":
    in = sys.stdin
    out = sys.stdout
    solve(1, in, out)