import sys

def main():
    n = int(sys.stdin.readline())
    print("ABC" if n < 1200 else "ARC")

if __name__ == "__main__":
    main()