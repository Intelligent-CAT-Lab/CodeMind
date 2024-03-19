import sys

def main():
    N, M = map(int, sys.stdin.readline().split())

    X = 1900 * M + 100 * (N - M)

    rate = 1

    for _ in range(M):
        rate *= 2

    print(rate * X)

if __name__ == "__main__":
    main()