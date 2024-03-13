import sys

def main():
    n = int(sys.stdin.readline())
    count = 0

    while n > 1:
        n = (n + (n % 3 if n % 3 != 0 else 0)) // 3
        count += 1

    print(count)

if __name__ == "__main__":
    main()