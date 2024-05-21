import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if b >= a:
        print(a)
    else:
        print(a - 1)

if __name__ == "__main__":
    main()