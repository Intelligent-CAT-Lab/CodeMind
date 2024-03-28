import sys

def main():
    X, Y = map(int, sys.stdin.readline().split())
    print("Brown" if abs(X-Y) <= 1 else "Alice")

if __name__ == "__main__":
    main()