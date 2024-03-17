import sys

def main():
    A, B, N = map(int, sys.stdin.readline().split())

    for x in range(-1000, 1001):
        if pow(x, N) * A == B:
            print(x)
            return

    print("No solution")

if __name__ == "__main__":
    main()