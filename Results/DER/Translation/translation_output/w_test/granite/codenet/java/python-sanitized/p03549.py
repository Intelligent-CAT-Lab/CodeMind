import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    X = 1900 * M + 100 * (N - M)
    rate = 1
    for i in range(1, M + 1):
        rate *= 2
    print(rate * X)

if __name__ == "__main__":
    main()