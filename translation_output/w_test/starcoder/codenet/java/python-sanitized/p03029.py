import sys

def main():
    A, P = map(int, sys.stdin.readline().split())
    print((P+3*A)/2)

if __name__ == "__main__":
    main()