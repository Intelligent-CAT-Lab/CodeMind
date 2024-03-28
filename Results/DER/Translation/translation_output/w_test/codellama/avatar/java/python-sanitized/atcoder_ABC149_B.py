import sys

def main():
    A, B, K = map(int, sys.stdin.readline().split())
    n = A - K

    if A + B <= K:
        print("0 0")
    elif n < 0:
        print("0", A + B - K)
    else:
        print(n, B)

if __name__ == "__main__":
    main()