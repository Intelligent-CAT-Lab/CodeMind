import sys

def solve(r, d, x):
    for _ in range(10):
        x = r * x - d
        print(x)

def main():
    r, d, x = map(int, sys.stdin.readline().split())
    solve(r, d, x)

if __name__ == '__main__':
    main()