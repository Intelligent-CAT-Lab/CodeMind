import sys

def solve(n, m):
    if n % 2 == 0:
        print(0, end=" ")
        for i in range(1, n // 2):
            print(0, end=" ")
        for i in range(n // 2, n):
            print(m, end=" ")
    else:
        print(0, end=" ")
        for i in range(1, n // 2):
            print(0, end=" ")
        for i in range(n // 2, n):
            print(m, end=" ")
    print()

def main():
    n, m = map(int, sys.stdin.readline().split())
    solve(n, m)

if __name__ == "__main__":
    main()