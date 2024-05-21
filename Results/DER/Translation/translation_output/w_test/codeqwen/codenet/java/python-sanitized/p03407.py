def solve(testNumber, inp, out):
    out.write("Yes" if inp.readline().strip() + inp.readline().strip() >= inp.readline().strip() else "No")

if __name__ == "__main__":
    import sys
    solve(1, sys.stdin, sys.stdout)