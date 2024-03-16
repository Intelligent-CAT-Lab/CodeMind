import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    if A - (B * 2) > 0:
        print(A - (B * 2))

if __name__ == "__main__":
    main()