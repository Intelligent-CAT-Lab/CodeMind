import sys

def main():
    T, X = map(int, sys.stdin.readline().split())
    a = T / X
    print(a)

if __name__ == "__main__":
    main()