import sys

def main():
    n = int(sys.stdin.readline())
    minute = (12 * 60 * n) // 360
    print(f"{minute // 60} {minute % 60}")

if __name__ == "__main__":
    main()