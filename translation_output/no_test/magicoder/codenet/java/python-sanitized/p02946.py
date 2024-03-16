import sys

def main():
    K = int(sys.stdin.readline())
    X = int(sys.stdin.readline())

    for i in range(X - K + 1, X + K):
        if i != X + K - 1:
            print(i, end=' ')
        else:
            print(i)

if __name__ == "__main__":
    main()