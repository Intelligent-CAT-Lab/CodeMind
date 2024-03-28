import sys

def main():
    a, b, c, d = map(int, sys.stdin.readline().split())
    print(max(a*c, b*d, a*d, b*c))

if __name__ == "__main__":
    main()