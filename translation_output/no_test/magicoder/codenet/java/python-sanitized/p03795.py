import sys

def main():
    n = int(sys.stdin.readline())
    print((n * 800) - ((n // 15) * 200))

if __name__ == "__main__":
    main()