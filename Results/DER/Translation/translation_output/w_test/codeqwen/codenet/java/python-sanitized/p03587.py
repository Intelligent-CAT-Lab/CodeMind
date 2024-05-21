def solve(testNumber, inp, out):
    s = inp.readline().strip()
    n = s.count('1')
    out.write(str(n) + '\n')

if __name__ == "__main__":
    import sys
    solve(1, sys.stdin, sys.stdout)