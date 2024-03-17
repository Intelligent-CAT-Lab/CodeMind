import sys

def solve(is, os):
    n, a, b = map(int, is.readline().split())
    os.write(str(min(a * n, b)) + '\n')

solve(sys.stdin, sys.stdout)