import sys

def solve(s):
    n = 0
    for c in s:
        if c == '1':
            n += 1
    return n

if __name__ == '__main__':
    s = sys.stdin.readline().strip()
    print(solve(s))