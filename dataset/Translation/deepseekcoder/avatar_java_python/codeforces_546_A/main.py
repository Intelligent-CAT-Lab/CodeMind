import sys

def main():
    o, n, g = map(int, sys.stdin.readline().split())
    x = 0
    borrow = 0

    for i in range(1, g + 1):
        x += i * o

    borrow = x - n

    if borrow <= 0:
        print(0)
    else:
        print(borrow)

if __name__ == "__main__":
    main()