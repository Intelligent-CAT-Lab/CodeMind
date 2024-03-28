import sys

def solve(a, b):
    print(max(1, (b+a-1)//a))

def main():
    a, b = map(int, sys.stdin.readline().split())
    solve(a, b)

if __name__ == "__main__":
    main()