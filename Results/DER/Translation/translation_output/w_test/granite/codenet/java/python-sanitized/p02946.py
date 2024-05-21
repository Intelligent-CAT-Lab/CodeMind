import sys

def main():
    K, X = map(int, sys.stdin.readline().split())
    for i in range(X - K + 1, X + K):
        if i == X + K - 1:
            print(i)
        else:
            print(i, end=" ")

if __name__ == "__main__":
    main()