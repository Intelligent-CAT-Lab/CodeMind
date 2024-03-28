import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    d = c - a - b
    if d > 0 and 4 * a * b < d * d:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()