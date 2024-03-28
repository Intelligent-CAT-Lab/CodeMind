import sys

def solve(test_number, in_, out):
    a, b, c = map(int, in_.readline().split())
    if a + b >= c:
        out.write("Yes\n")
    else:
        out.write("No\n")

if __name__ == '__main__':
    solve(1, sys.stdin, sys.stdout)