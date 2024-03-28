import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if a > 2 * b:
        print(a - 2 * b)
    else:
        print(0)

if __name__ == "__main__":
    main()