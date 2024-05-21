import sys

def main():
    x, y, z = map(int, sys.stdin.readline().split())
    print((x * y) // 2)

if __name__ == "__main__":
    main()