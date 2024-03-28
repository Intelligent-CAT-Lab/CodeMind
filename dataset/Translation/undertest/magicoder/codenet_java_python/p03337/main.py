import sys

def solve(a, b):
    return max(a + b, a - b, a * b)

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(solve(a, b))

if __name__ == "__main__":
    main()