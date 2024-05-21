import sys

def main():
    a, b = map(int, sys.stdin.read().split())
    print((a + b) // 2)

if __name__ == "__main__":
    main()