import sys

def main():
    n, l = map(int, sys.stdin.readline().split())

    diff = [abs(l + i - 1) for i in range(1, n + 1)]
    removeK = diff.index(min(diff)) + 1

    print(n * l + n * (n + 1) // 2 - n - (l + removeK - 1))

if __name__ == "__main__":
    main()