import sys

def main():
    a, b, x = map(int, sys.stdin.readline().split())
    count = b // x - a // x
    if a % x == 0:
        count += 1
    print(count)

if __name__ == "__main__":
    main()