import sys


def solve():
    readline = sys.stdin.buffer.readline
    mod = 10 ** 9 + 7
    s = str(readline().rstrip().decode('utf-8'))
    if s == "RRR":
        print((3))
    elif s == "RRS" or s == "SRR":
        print((2))
    elif s.count("R") == 0:
        print((0))
    else:
        print((1))


if __name__ == '__main__':
    solve()
